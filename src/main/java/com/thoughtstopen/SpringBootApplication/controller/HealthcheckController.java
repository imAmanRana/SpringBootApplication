/**
 * 
 */
package com.thoughtstopen.SpringBootApplication.controller;

import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author amand
 *
 */
/*
 * CODING TEST FOR CITI BANK
 */
@RestController
public class HealthcheckController {

	@GetMapping(value = "/healthcheck", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<HealthStatus> healthcheck(@RequestParam String format) {

		ResponseEntity<HealthStatus> hs;
		switch (format) {

		case "short":
			hs = new ResponseEntity<HealthStatus>(new HealthStatusShort(), HttpStatus.OK);
			break;
		case "full":
			hs = new ResponseEntity<HealthStatus>(new HealthStatusFull(), HttpStatus.OK);
			break;
		default:
			throw new BadRequestException();

		}

		return hs;
	}

	@PutMapping(value = "/healthcheck")
	public ResponseEntity<Object> healthcheckPut() {
		return new ResponseEntity<Object>(null, HttpStatus.METHOD_NOT_ALLOWED);
	}

	@PostMapping(value = "/healthcheck")
	public ResponseEntity<Object> healthcheckPost() {
		return new ResponseEntity<Object>(null, HttpStatus.METHOD_NOT_ALLOWED);
	}

	@DeleteMapping(value = "/healthcheck")
	public ResponseEntity<Object> healthcheckDelete() {
		return new ResponseEntity<Object>(null, HttpStatus.METHOD_NOT_ALLOWED);
	}

	@ExceptionHandler(value = BadRequestException.class)
	ResponseEntity<Object> exception(BadRequestException exception) {
		return new ResponseEntity<>("Bad Request", HttpStatus.BAD_REQUEST);
	}
}

/**
 * Custom Exception Class for Bad Request Parameters
 * 
 * @author Amandeep Singh
 *
 */
class BadRequestException extends RuntimeException {
	private static final long serialVersionUID = 1L;
}

/**
 * Marker Interface for Health Status
 * 
 * @author Amandeep Singh
 *
 */
interface HealthStatus {
	// marker interface
}

/**
 * Short Health Status, returns OK
 * 
 * @author Amandeep Singh
 *
 */
class HealthStatusShort implements HealthStatus {
	private String status;

	public HealthStatusShort() {
		this.status = "OK";
	}

	// GETTERS & SETTERS
	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}

/**
 * Full Health Status, returns Ok with current time in ISO 8601 format
 * 
 * @author Amandeep Singh
 *
 */
class HealthStatusFull implements HealthStatus {
	private String currentTime;
	private String application;

	public HealthStatusFull() {
		this.application = "OK";
		this.currentTime = DateTimeFormatter.ISO_INSTANT.format(ZonedDateTime.now());
	}

	// GETTERS & SETTERS
	public String getApplication() {
		return application;
	}

	public void setApplication(String application) {
		this.application = application;
	}

	public String getCurrentTime() {
		return currentTime;
	}

	public void setCurrentTime(String currentTime) {
		this.currentTime = currentTime;
	}
}