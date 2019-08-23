package com.hp.day9.statictest;

/**
 * static修饰的变量称为静态变量或类变量
 * 可以在多个对象中共享，不创建对象也可以使用
 * 在普通方法中可以使用静态变量或静态方法
 * 在静态方法中不能调用成员变量，普通方法（隐藏了this.）
 * static类型的变量和方法酌情使用，工具类
 * @author HP
 *
 */
public class Person {

	private int id;

	private static int total = 0;

	public Person() {
		total++;
		id = total;
	}

	public static int getTotal() {
//		this.getInfo();
		return total;
	}
	
	public void getInfo(){
		//可以使用静态变量
		int to = total;
		Person.getTotal();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1 = new Person();
		Person p2 = new Person();
		System.out.println("p1的id号是:" + p1.id);
		System.out.println("p2的id号是:" + p2.id);
		System.out.println("Person对象总共创建了" + Person.total + "个");
		System.out.println("Person对象总共创建了" + Person.getTotal() + "个");
	}

}
