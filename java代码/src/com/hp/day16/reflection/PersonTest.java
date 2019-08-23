package com.hp.day16.reflection;

import java.lang.reflect.Field;

public class PersonTest {

	public static void main(String[] args) throws Exception{
		Class<?> clazz = Class.forName("com.hp.day16.reflection.Person");
		Person p = (Person) clazz.newInstance();
		/**
		 * 获取的name成员变量，除了成员变量名外，还有附加信息，例如成员变量数据类型
		 * 下面三行相当于p.setName("wangwu")
		 */
		Field nameField = clazz.getDeclaredField("name");
		//因为成员变量是私有的
		nameField.setAccessible(true);
		nameField.set(p, "wangwu");
		System.out.println("通过设置成员变量的值后："+p.getInfo());
	}

}
