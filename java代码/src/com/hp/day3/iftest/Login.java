package com.hp.day3.iftest;

import java.util.Scanner;

public class Login {
	public static void main(String[] args) {
//		// 以下三行是输入信息
//		String role = "admin";
//		String userName = "hp";
//		String password = "1234";
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入角色：admin user other");
		String role = sc.next();
		System.out.println("请输入用户名：");
		String userName = sc.next();
		System.out.println("请输入密码：");
		String password = sc.next();
		if ("admin".equals(role)) {
			if("hp".equals(userName) && "123".equals(password)){
				System.out.println("登录成功");
			}
			else{
				System.out.println("请重新登录");
			}
		} else if ("user".equals(role)) {

		} else {
			System.out.println("角色不存在");
		}
	}
}
