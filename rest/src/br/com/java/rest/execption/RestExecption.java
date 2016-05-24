package br.com.java.rest.execption;

public class RestExecption extends RuntimeException {


	private static final long serialVersionUID = 3650079409589869086L;

	public RestExecption(String string) {
		super(string);
	}
	
}
