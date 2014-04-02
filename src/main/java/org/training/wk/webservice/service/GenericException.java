package org.training.wk.webservice.service;

import javax.xml.ws.WebFault;

@WebFault(name = "genericException")
public class GenericException extends Exception {
	private static final long serialVersionUID = 1L;

	public GenericException() {

	}

	public GenericException(String message) {
		super(message);
	}

	public GenericException(String message, Throwable cause) {
		super(message, cause);
	}
}
