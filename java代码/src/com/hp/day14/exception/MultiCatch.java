package com.hp.day14.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * 练习：通过控制台输入两个数，求两个数的除法 除数异常可以使用ArithmeticException
 * 输入格式异常可以使用InputMismatchException
 * 
 * @author HP
 *
 */
public class MultiCatch {

	public static void main(String[] args) {
		/**
		 * 控制台输入--Scanner
		 * Scanner sc = new Scanner(System.in);
		 * 可以用一个sc对象接收，赋给2个变量
		 * 两个数相除/
		 * try{
		 * }catch(){
		 * }
		 * catch(){
		 * }
		 */
		Scanner sc = new Scanner(System.in);
		//nextInt通过sc对象获取一个int类型数
		//a是被除数，b是除数
		int a ;
		int b ;
		double result ;
		try{
			System.out.println("请输入被除数：");
			a = sc.nextInt();
			sc.close();
			System.out.println("请输入除数：");
			b = sc.nextInt();
			result = a/b;
		}catch (InputMismatchException e) {
			System.out.println("输入类型不匹配");
		}catch(ArithmeticException ar){
			System.out.println("除数为0");
		}catch (Exception e) {
			System.out.println("其他异常");
		}
	}

}
