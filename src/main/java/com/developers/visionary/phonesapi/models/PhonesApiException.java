package com.developers.visionary.phonesapi.models;

public class PhonesApiException extends Throwable {
	private String message;
	private String code;
	
	public PhonesApiException(String code) {
		this.message = "";
		this.code = code;
	}
	
	public PhonesApiException(String message, String code) {
		this.message = message;
		this.code = code;
	}
	
	public String getMessage() {
		return message;
	}

	public String getCode() {
		return code;
	}

	public static PhonesApiException Exception(String message, String code) {
		return new PhonesApiException(message, code);
	}
}
