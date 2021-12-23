package br.com.bbnsdevelop.basics.exceptions;

public class CustomeException extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	CustomeException(String message){
		super(message);
	}

}
