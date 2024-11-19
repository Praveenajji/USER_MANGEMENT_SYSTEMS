package com.example.ums.exceptionhandler;

public class Usernotfoundbyid extends RuntimeException {

	private final String message;
	private final String redirecTo;
	
	public Usernotfoundbyid(String message, String redirecTo) {
		super();
		this.message = message;
		this.redirecTo = redirecTo;
	}

	public String getMessage() {
		return message;
	}

	public String getRedirecTo() {
		return redirecTo;
	}
	
	
}
