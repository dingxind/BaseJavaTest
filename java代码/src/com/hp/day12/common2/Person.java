package com.hp.day12.common2;

import java.util.Date;

/**
 * package目的： 1.防止类重名的情况 2.有利于对类管理，专门的类放到专门的包中 例如描述实体的类，放到描述实体的包中
 * 和数据库打交道的类，放到dao包中
 * 
 * @author HP
 *
 */
public class Person {
	/**
	 * 成员变量：类中声明或定义的变量成为成员变量 修饰符 数据类型 变量名
	 * 访问权限修饰符：private,default,protected,public
	 */
	private String name;
	private int age;
	private Date birthday;
	
	/**
	 * 一般，如果写了有参构造方法，无参的也要写上
	 * 如果没有写构造方法，系统会提供一个无参构造方法
	 * 如果写了，系统不提供了
	 * 1.可能多个人会使用同一个类，当创建对象的时候，new+无参构造方法创建
	 * 2.后续框架，IOC提供生成的对象会调用无参构造方法--养成好习惯
	 */
	public Person(){
		
	}
	public Person(String name, int age) {
//		this();
		this.name = name;
		this.age = age;
	}

	public Person(String name, int age, Date birthday) {
		/**
		 * 可以使用this()调用本类重载的构造方法，可以传参
		 * 如果this调用了构造方法，要放在第一行
		 */
		this(name,age);
//		this.name = name;
//		this.age = age;
		this.birthday = birthday;
	}

	public String getInfo() {
		// 通过this可以调用本类中拥有的方法
		// String s = this.getName();
//		String s = getName();
		return "姓名:"+name+" 年龄:"+age;
	}
	
	public static void main(String [] args){
		Person person = new Person("zhang", 18, new Date());
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

}
