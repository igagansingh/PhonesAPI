package com.developers.visionary.phonesapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@SpringBootApplication
public class PhonesapiApplication {

	private static final Logger logger = LogManager.getLogger(PhonesapiApplication.class);

	public static void main(String[] args) {
		logger.info("Started application successfully...");
		SpringApplication.run(PhonesapiApplication.class, args);
		
	}

}
