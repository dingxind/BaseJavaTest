package com.hp.day14.exception;

import com.hp.day8.extend2.Person;

public class TryCatch {

	public static void main(String[] args) {
		Person p = null;
		/**
		 * 使用try-catch可以处理异常
		 */
		try{
			p.getInfo();
		}catch(Exception e){
			System.out.println("p对象是null");
		}
	}

}
