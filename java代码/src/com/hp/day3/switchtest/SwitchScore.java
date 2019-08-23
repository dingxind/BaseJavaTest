package com.hp.day3.switchtest;

import java.util.Scanner;

/*
 * 编写程序：从键盘上读入一个学生成绩，存放在变量score中，根据score的值输出其对应的成绩等级：
score>=90        等级：A
70=<score<90     等级: B
60=<score<70     等级: C
score<60         等级：D
 */
public class SwitchScore {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个成绩：0~100之间的整数");
		int score = sc.nextInt();
		if (score < 0 || score > 100)
			System.out.println("输入的成绩不合法");
		else {
			switch (score / 10) {
			/*
			 * case 10和case 9执行相同的场景
			 * 因此在case9执行break
			 */
			case 10:
			case 9:
				System.out.println("等级：A");
				break;
			case 8:
			case 7:
				System.out.println("等级：B");
				break;
			case 6:
				System.out.println("等级：C");
				break;
			case 5:
			case 4:
			case 3:
			case 2:
			case 1:
			case 0:
				System.out.println("等级：D");
				break;
			default:
				System.out.println("非法，其他");
				break;
			}
		}
	}

}
