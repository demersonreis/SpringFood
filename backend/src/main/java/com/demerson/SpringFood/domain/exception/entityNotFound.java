package com.demerson.SpringFood.domain.exception;

public class entityNotFound extends RuntimeException{
	private static final long serialVersionUID = 1L;	
	public entityNotFound(String msg) {
		super(msg);
	}

}
