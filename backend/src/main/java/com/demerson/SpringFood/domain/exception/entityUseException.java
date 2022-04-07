package com.demerson.SpringFood.domain.exception;

public class entityUseException extends RuntimeException{
	private static final long serialVersionUID = 1L;
    
	public entityUseException(String msg){
		super(msg);
	}
}
