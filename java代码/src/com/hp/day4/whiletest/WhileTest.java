package com.hp.day4.whiletest;

import java.util.Scanner;

/**
 * 从键盘读入个数不确定的整数，并判断读入的正数和负数的个数，输入为0时结束程序。
 * 
 * @author yangzhen
 */
public class WhileTest {

	public static void main(String[] args) {
		/**
		 * 要有输入：Scanner 整数个数不确定：使用循环，次数不确定，一般使用while 读入正数和负数：分支 记录个数，存储
		 * 输入0表示结束：循环终止条件
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入整数，如果是0，统计正数和负数结束：");
		int positive = 0;
		int negtive = 0;
		int number = sc.nextInt();
		while (number != 0) {
			if (number > 0)
				positive++;
			else
				negtive++;
			number = sc.nextInt();
		}
		System.out.println("正数的个数是：" + positive);
		System.out.println("负数的个数是：" + negtive);
	}

}
