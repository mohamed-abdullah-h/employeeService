package com.main.errorHandler;

import java.time.LocalDateTime;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ErrorDetails {

	private LocalDateTime timestamp;
	private String message;
	private String path;
	private String errorcode;

	public ErrorDetails(String message, String path, String errorcode) {
		timestamp = LocalDateTime.now();
		this.message = message;
		this.path = path;
		this.errorcode = errorcode;
	}

	public ErrorDetails() {
		timestamp = LocalDateTime.now();
	}

}
