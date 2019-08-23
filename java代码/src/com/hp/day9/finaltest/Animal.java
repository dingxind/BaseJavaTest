package com.hp.day9.finaltest;

/**
 * final修饰的类不能被继承
 * final修饰的方法不能被重写
 * final修饰的变量：如果是基本数据类型变量，变量的值不能被修改
 * 		如果是引用数据类型，成员变量的值可以修改，但是地址不能改变
 * 		创建对象，会在内存中开辟一块区域，让引用指向这个地址
 * @author HP
 */
public class Animal {
	private String kind;
	
	public void shout() {
		System.out.println("shout sth");
	}

	public final void getInfo(){
		System.out.println("from animal");
	}
	public String getKind() {
		return kind;
	}

	public void setKind(String kind) {
		this.kind = kind;
	}
	
}
