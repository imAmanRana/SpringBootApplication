/**
 * 
 */
package com.thoughtstopen.SpringBootApplication.exceptionHandler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * @author amand
 *
 */
@ControllerAdvice
public class ProductExceptionController {

	@ExceptionHandler(value = ProductNotfoundException.class)
	public ResponseEntity<Object> exception(ProductNotfoundException exception) {
		return new ResponseEntity<>("Product not found", HttpStatus.NOT_FOUND);
	}

}
