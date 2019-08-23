package com.hp.day2.operator;

public class TernaryOperator {

	public static void main(String[] args) {
		int score = 48;
		/**
		 * 三元运算符：
		 * (条件表达式)?表达式1：表达式2；
		 * 如果条件为true，运算后的结果是表达式1；
		 * 如果条件为false，运算后的结果是表达式2；
		 */
		System.out.println("张三的成绩为:"+((score>=60)?59:score));
	}

}
