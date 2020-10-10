package com.santosediego.dsexercicio.services.exceptions;

public class ResourceNotFoundException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public ResourceNotFoundException(String msg) {
		super(msg);
	}
}
/*
 * Extender da RuntimeException e criar construtor para receber a mensagem vinda
 * do service;
 */