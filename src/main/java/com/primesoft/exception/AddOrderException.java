package com.primesoft.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@SuppressWarnings("serial")
@ResponseStatus(code= HttpStatus.CREATED)
public class AddOrderException extends RuntimeException{
	
	public AddOrderException(String message) {
		super(message);
	}

}
