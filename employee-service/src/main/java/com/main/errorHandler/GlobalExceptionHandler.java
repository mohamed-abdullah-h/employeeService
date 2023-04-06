package com.main.errorHandler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

@ControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler(value = ResourceNotFoundException.class)
	public ResponseEntity<ErrorDetails> handleResourceNotFoundException(WebRequest webRequest,
			ResourceNotFoundException ex) {
		ErrorDetails error = new ErrorDetails(ex.getMessage(), webRequest.getDescription(false),
				"Employee_Id_NOT_FOUND");
		return new ResponseEntity<>(error, HttpStatus.NOT_FOUND);
	}
}
