package com.primesoft.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@SuppressWarnings("serial")
@ResponseStatus(code= HttpStatus.NOT_FOUND)
public class OrderNotFoundException extends RuntimeException {
	

		public OrderNotFoundException(String message) {
			super(message);
		}

}

