package com.trail.project.mongointegration.exception;

@SuppressWarnings("serial")
public class InvalidUserIdException extends Exception {
	public InvalidUserIdException(String msg) {
		super(msg);
	}
}
