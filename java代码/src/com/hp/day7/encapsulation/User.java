package com.hp.day7.encapsulation;

/**
 * 用户的相关信息
 * 
 * @author HP
 *
 */
public class User {
	// 用户标识
	private int userId;
	// 用户名
	private String userName;
	// 密码
	private String password;

	public User() {

	}

	public User(String userName, String password) {
		this.userName = userName;
		this.password = password;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
