package com.hp.day7.encapsulation;

public class TestDefault {

	public static void main(String[] args) {
		/**
		 * 1.类名首字母改成小写
		 * 2.类名首字母小写
		 * 3.类名缩写stu,pwd
		 * 4.类名缩写，类名是由多个单词组成的，UserService us
		 */
		Person p = new Person();
//		//赋值，写入
//		p.name = "zhang";
//		//读取
//		System.out.println(p.name);
		
		p.setName("wang");
		System.out.println(p.getName());
	}

}
