package com.hp.day14.exception;

import com.hp.day8.extend2.Person;

public class TryFinally {

	public static void main(String[] args) {
		/**
		 * try-finally语句：
		 * 如果抛异常，则先执行finally后，再抛异常信息
		 * 场景：程序可能出现异常，出现异常后修正某些数据，并且把异常抛出去
		 * 
		 * final,finally,finalize区别：
		 * final:1.修饰类，类不能被继承，String
		 * 		 2.修饰方法：方法不能被重写
		 * 		 3.修饰变量：基本数据类型，值不能修改；引用数据类型，地址不能修改（new ...），变量值可以修改
		 * finally:try-catch语句中用的，最后执行的语句
		 * finalize:垃圾回收。可以显示的调用，但是什么时候回收不由我们决定
		 * 			垃圾回收：对象，长时间不使用，垃圾回收。静态变量除外
		 */
		Person p = null;
		try {
			p.getInfo();
		} finally {
			System.out.println("@@");
		}
	}

}
