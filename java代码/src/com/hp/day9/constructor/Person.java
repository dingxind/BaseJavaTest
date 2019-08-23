package com.hp.day9.constructor;

import java.util.Date;

/**
 * package:
 * 1.类有重名的情况，可以用包名.类名管理类
 * 2.利用package可以对类方便的管理，可以对类分类
 * 实体类：专门描述一些实体的，例如学生类，教师类，。。。po,pojo,javabean
 * 工具类：com......util，里面一般都是静态变量，静态方法，直接使用类名.静态变量，类名.静态方法
 * 专门用于接收请求的类：...servlet;...action,...controller
 * 专门用于负责和数据库打交道的类：dao
 * 
 * 构造方法：
 * 1.作用：生成对象，可以初始化成员变量
 * 2.语法：构造方法是一类特殊的方法（），没有返回值，没有void，方法名和类名完全相同
 * 3.初始化顺序：构造方法放到最后
 * 4.有父类有子类的情况：先调用父类的构造方法，再调用子类的构造方法
 * 5.构造方法可以重载（？），但不能重写
 * 6.可以使用this关键字调用重载的构造方法this(name,age);但是要放到第一行
 * 7.可以使用super调用父类的构造方法super(name, age, birthday);也要放到第一行
 * 8.不能使用abstract修饰
 * 9.如果没有显示定义构造方法，系统提供一个默认无参构造方法；如果显示定义了构造方法，系统不提供。
 * 	 如果定义了有参构造方法，一般重载一个无参构造方法
 * @author HP
 *
 */
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
//		com.hp.day8.extend.Person p2 = new com.hp.day8.extend.Person("wang", 18, new Date());
	}
}
