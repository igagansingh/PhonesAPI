package com.developers.visionary.phonesapi.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.developers.visionary.phonesapi.models.Phone;

@Repository
public interface PhoneRepository extends MongoRepository<Phone, String> {
	  public Phone findByModel(String model);
	  public Phone deleteByModel(String model);
}
