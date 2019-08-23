package com.hp.day7.encapsulation;

/**
 * 1.成员变量设置成private类型
 * 2.成员变量要有get,set方法，可以控制读写分离
 * 3.可以通过set方法做数据处理
 * @author HP
 */
public class Person {
	/**
	 * 作用域：
	 * 1.局部变量的作用域在方法内
	 * 2.成员变量的作用域在类内
	 */
	/**
	 * 一般情况下，成员变量访问权限都是private
	 * private访问权限只能自己访问
	 */
	private String name;
	private boolean gender;
	private int age;
	
	/**
	 * get,set方法的原则：
	 * public 成员变量的数据类型 get+成员变量（）{
	 * 	return 成员变量;
	 * }
	 * public void set+成员变量(成员变量数据类型 形参){
	 * 	this.成员变量=形参;
	 * }
	 * @return
	 */
	public String getName(){
		return name;
	}
	
	/**
	 * 如果成员变量和局部变量重名，在方法内，局部变量会覆盖成员变量
	 * @param name
	 */
//	public void setName(String name2){
//		name = name2;
//	}
	public void setName(String name){
		this.name = name;
	}

	/**
	 * 布尔类型的get方法，is开头
	 * @return
	 */
	public boolean isGender() {
		return gender;
	}

	public void setGender(boolean gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	
}
