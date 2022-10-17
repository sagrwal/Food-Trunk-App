package com.primesoft.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@SuppressWarnings("serial")
@ResponseStatus(code= HttpStatus.NOT_FOUND)
public class MenuException extends RuntimeException{
	public MenuException(String message) {
		super(message);
	}


}
