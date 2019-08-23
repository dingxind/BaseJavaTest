package com.hp.day6.object;

public class User {
	// id经常使用自增
	private int id;
	private String userName;
	private String password;
	private String gender;

	// 无参构造方法
	/**
	 * 一般定义了有参构造方法时，一般要把无参构造方法写上
	 * 原因：
	 * 1.有时候会调用无参构造方法，写了有参系统不提供无参构造方法
	 * 2.在学框架的时候spring会用很多发射机制调用无参构造方法个set方法
	 */
	/**
	 * 构造方法重载：
	 * 1.首先是构造方法，符合构造方法的特征
	 * 2.方法间方法名相同，但参数列表不同（参数的个数，参数的类型）
	 */
	public User() {

	}

	public User(String userName, String password) {
		this.userName = userName;
		this.password = password;
	}

	public static void main(String[] args) {
		User user = new User("hp","123");
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

}
