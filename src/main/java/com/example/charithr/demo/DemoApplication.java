package com.example.charithr.demo;

import java.util.logging.Logger;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		Logger logger = Logger.getLogger(DemoApplication.class.getName());
		logger.info("Starting the Error application");
	}

}
