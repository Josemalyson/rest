package br.com.java.rest.execption;

public class RestException extends RuntimeException {


	private static final long serialVersionUID = 3650079409589869086L;

	public RestException(String string) {
		super(string);
	}
	
}
