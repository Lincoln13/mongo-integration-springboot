package com.trail.project.mongointegration.exception;

@SuppressWarnings("serial")
public class InvalidEmailException extends Exception {
	public InvalidEmailException(String msg) {
		super(msg);
	}
}
