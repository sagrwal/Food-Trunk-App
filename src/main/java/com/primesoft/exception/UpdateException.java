package com.primesoft.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@SuppressWarnings("serial")
@ResponseStatus(code= HttpStatus.NOT_FOUND)
public class UpdateException extends RuntimeException {

	public UpdateException(String message) {
		super(message);
	}
}
