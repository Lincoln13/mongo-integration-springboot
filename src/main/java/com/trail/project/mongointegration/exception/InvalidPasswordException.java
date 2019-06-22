package com.trail.project.mongointegration.exception;

@SuppressWarnings("serial")
public class InvalidPasswordException extends Exception {
	public InvalidPasswordException(String msg) {
		super(msg);
	}
}
