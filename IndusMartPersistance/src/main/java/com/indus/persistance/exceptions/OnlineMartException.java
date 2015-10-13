package com.indus.persistance.exceptions;

public class OnlineMartException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 37757037576556705L;

	public OnlineMartException() {
		super();
	}

	public OnlineMartException(String arg0, Throwable arg1, boolean arg2,
			boolean arg3) {
	}

	public OnlineMartException(String arg0, Throwable arg1) {
		super(arg0, arg1);
	}

	public OnlineMartException(String arg0) {
		super(arg0);
	}

	public OnlineMartException(Throwable arg0) {
		super(arg0);
	}

}
