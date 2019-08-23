package com.hp.day14.exception;

import com.hp.day8.extend2.Person;

public class UnCheckedException {

	public static void main(String[] args) {
		/**
		 * 不检查异常，运行的时候遇到异常抛出
		 * 编译器也没错
		 * null.任何方法都会抛NullPointerException
		 * 方法有返回值，但是可以不接收--只通过方法返回值无法判断方法重载
		 * 方法明明有返回值，但是不接收：访问数据库
		 */
		Person p = null;
		p.getInfo();
	}

}
