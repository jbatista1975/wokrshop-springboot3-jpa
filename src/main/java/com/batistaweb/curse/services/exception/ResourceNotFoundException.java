package com.batistaweb.curse.services.exception;

public class ResourceNotFoundException extends RuntimeException{

	private static final long serialVersionUID = 1L;

	public ResourceNotFoundException(Object id) {
		super("Resouce not foud.id " + id);
	}
	
	
}
