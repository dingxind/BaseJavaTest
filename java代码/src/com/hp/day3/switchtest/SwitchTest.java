package com.hp.day3.switchtest;

import java.util.Scanner;

public class SwitchTest {

	public static void main(String[] args) {
		System.out.println("明天晚上干什么? 1:上晚自习，2:听音乐， 3.打篮球， 4.看电影, 其他值.聚餐");
		Scanner sc = new Scanner(System.in);
		int choice = sc.nextInt();
		switch (choice) {
		case 1:
			System.out.println("上晚自习");
			break;
		case 2:
			System.out.println("听音乐");
			break;
		case 3:
			System.out.println("打篮球");
			break;
		case 4:
			System.out.println("看电影");
			break;
		default:
			System.out.println("聚餐");
			break;
		}
	}

}
