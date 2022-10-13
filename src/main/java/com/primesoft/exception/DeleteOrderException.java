package com.primesoft.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@SuppressWarnings("serial")
@ResponseStatus(code= HttpStatus.OK)
public class DeleteOrderException extends RuntimeException {

	public DeleteOrderException(String message) {
		super(message);
	}
}
