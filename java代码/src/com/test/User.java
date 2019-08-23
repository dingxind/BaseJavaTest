package com.test;

public class User {
	private String name;
	private String gender;
	private Integer age;
	private String school;

	public User() {

	}

	public User(String name, String gender, Integer age, String school) {
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.school = school;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getSchool() {
		return school;
	}

	public void setSchool(String school) {
		this.school = school;
	}
	
	public static void main(String [] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, IllegalArgumentException, NoSuchFieldException, SecurityException{

	}
}
