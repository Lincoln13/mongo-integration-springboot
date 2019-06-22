package com.trail.project.mongointegration.exception;

@SuppressWarnings("serial")
public class UserIdAlreadyPresentException extends Exception {
	public UserIdAlreadyPresentException(String msg) {
		super(msg);
	}
}
