package com.hp.day14.exception;

/**
 * 封装的登录异常
 * 
 * @author HP
 *
 */
public class LoginException extends RuntimeException {
	public LoginException() {

	}

	public LoginException(String info) {
		super("登录异常" + info);
	}
}
