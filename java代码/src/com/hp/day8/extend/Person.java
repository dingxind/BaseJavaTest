package com.hp.day8.extend;

import java.util.Date;

public class Person {
	// 修饰符 数据类型
	private String name;
	private int age;
	private Date birthday;

	public Person() {
		super();
		System.out.println("@@@@");
	}
	
	public Person(String name, int age){
		this();
		this.name = name;
		this.age = age;
	}

	// 有参构造方法目的：1.创建对象 2.初始化成员变量
	/**
	 * 如果在一个方法中，形式参数/局部变量和成员变量名称完全一致，则会覆盖成员变量 想引用成员变量，可以使用this关键字
	 * 
	 * @param name 姓名
	 * @param age 年龄
	 * @param birthday 出生年月
	 */
	public Person(String name, int age, Date birthday) {
//		this.name = name;
//		this.age = age;
		this(name,age);
		this.birthday = birthday;
	}

	public String getInfo() {
		//在本类中,可以通过this.方法来调用本类的方法，this.可以省略
		String result = this.getInfo2();
		return result;
	}

	public String getInfo2(){
		return null;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public static void main(String [] args){
		/**
		 * 可以有两种方式初始化成员变量
		 * 1.通过无参构造方法创建对象，通过成员变量的set方法修改（初始化）成员变量的值
		 * 	 具体调用哪些成员变量的set方法，根据情况
		 * 2.可以通过有参构造方法创建对象并初始化成员变量
		 * 
		 * 如果初始化成员变量较少，可以使用第一种
		 * 如果成员变量比较多，在创建对象需初始化时，使用第二种
		 * spring中使用是第一种，所以如果重载了有参构造方法，必须要有一个无参构造方法
		 */
		Person p = new Person();
		p.setName("zhang");
		p.setAge(10);
		p.setBirthday(new Date());
		
		Person p2 = new Person("wang", 18, new Date());
	}
}
