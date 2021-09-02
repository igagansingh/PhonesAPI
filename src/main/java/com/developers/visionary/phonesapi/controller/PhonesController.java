package com.developers.visionary.phonesapi.controller;

import java.net.URI;
import java.util.Arrays;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.developers.visionary.phonesapi.models.Phone;
import com.developers.visionary.phonesapi.models.PhonesApiException;
import com.developers.visionary.phonesapi.models.PhonesApiResponse;
import com.developers.visionary.phonesapi.repository.PhoneRepository;
import com.developers.visionary.phonesapi.utils.ExceptionCode;
import com.mongodb.MongoWriteException;

@RestController
public class PhonesController {
	private static final Logger logger = LogManager.getLogger(PhonesController.class);

	@Autowired
	private PhoneRepository repo;
	
	@PostMapping("/phone/")
	public ResponseEntity<PhonesApiResponse> create(@RequestBody Phone phone) {
		try {
			Phone response;
			response = repo.save(phone);
			return ResponseEntity.created(new URI("/phone/" + response.getModel())).body(PhonesApiResponse.createResponse(Arrays.asList(response)));
		} catch(DuplicateKeyException duplicateKeyException) {
			if(duplicateKeyException.getCause() instanceof MongoWriteException) {
				MongoWriteException exception = (MongoWriteException)duplicateKeyException.getCause();
				if(exception.getCode()==11000) {
					return ResponseEntity.badRequest().body(PhonesApiResponse.createResponse(PhonesApiException.Exception("Key already exists", ExceptionCode.E410001)));
				} else {
					logger.error(exception.getMessage());
				}
			}
		} catch(Exception mongoException) {}
		return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
	}
	
	@GetMapping("/phone/")
	public ResponseEntity<PhonesApiResponse> getAll() {
		List<Phone> phones = repo.findAll();
		return ResponseEntity.ok().body(PhonesApiResponse.createResponse(phones));
	}
	
	@GetMapping("/phone/{model}")
	public ResponseEntity<PhonesApiResponse> getById(@PathVariable String model) {
		Phone phone = repo.findByModel(model);
		if(phone==null) {
			return ResponseEntity.notFound().build();
		}
		return ResponseEntity.ok().body(PhonesApiResponse.createResponse(Arrays.asList(phone)));
	}
	
	@DeleteMapping("/phone/{model}")
	public ResponseEntity<HttpStatus> deleteById(@PathVariable String model) {
		repo.deleteByModel(model);
		return ResponseEntity.status(HttpStatus.OK).build();
	}
}
