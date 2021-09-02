package com.developers.visionary.phonesapi.models;

import java.util.List;

public class PhonesApiResponse {
	private List<Phone> response;
	private PhonesApiException error;
	
	PhonesApiResponse(List<Phone> response) {
		this.response = response;
		this.error = null;
	}
	
	PhonesApiResponse(PhonesApiException error) {
		this.response = null;
		this.error = error;
	}
	
	public List<Phone> getResponse() {
		return response;
	}

	public PhonesApiException getError() {
		return error;
	}

	public static PhonesApiResponse createResponse(List<Phone> phones) {
		return new PhonesApiResponse(phones);
	}
	
	public static PhonesApiResponse createResponse(PhonesApiException error) {
		return new PhonesApiResponse(error);
	}
}
