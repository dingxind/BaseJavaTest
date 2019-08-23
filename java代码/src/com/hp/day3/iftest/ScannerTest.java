package com.hp.day3.iftest;
/**
 * 可以通过import导入其他类
 * Scanner类包名是java.util
 */
import java.util.Scanner;

public class ScannerTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//println括号里的作为输出内容
		//sc.nextInt()用来接收一个int类型的数
		System.out.println("请输入一个整数：");
		System.out.println("从控制台获取的值是："+sc.nextInt());
		System.out.println("第二次从控制台获取的值是："+sc.nextInt());
		/**
		 * 为什么获取后再赋给一个变量呢？
		 * 因为可能会使用多次
		 */
		int i = sc.nextInt();
		System.out.println("第三次获取的值是："+i);
		System.out.println("把第三次获取的值再次打印："+i);
		
		/**
		 * next和nextLine都可以在控制台获取一行输入
		 * nextLine有时候获取不到输入
		 */
		String s = sc.next();
		System.out.println("接收的String类型的参数是："+s);
	}

}
