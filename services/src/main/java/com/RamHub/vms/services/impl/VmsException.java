package com.cuberootz.vms.services.impl;

public class VmsException extends Exception {

	private static final long serialVersionUID = 1L;
	private String field;
	private String message;
	
	public VmsException(String field, String message) {
		super();
		this.field = field;
		this.message = message;
	}

	public String getField() {
		return field;
	}

	public void setField(String field) {
		this.field = field;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "VmsException [field=" + field + ", message=" + message + "]";
	}
	
	
}

