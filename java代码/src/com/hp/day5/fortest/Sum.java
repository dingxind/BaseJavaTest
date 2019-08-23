package com.hp.day5.fortest;

import java.util.Scanner;

/**
 * 键盘输入一个正整数n，计算1+2+…+n,并输出
 * 
 * @author HP
 */
public class Sum {

	public static void main(String[] args) {
		System.out.println("请输入一个正整数n:");
		Scanner sc = new Scanner(System.in);
		// 记录求和
		int sum = 0;
		// 记录输入的正整数
		int num = sc.nextInt();
		for (int i = 1; i <= num; i++) {
			// sum = sum+i
			sum += i;
		}
		System.out.println("1~" + num + "的和为：" + sum);
	}

}
