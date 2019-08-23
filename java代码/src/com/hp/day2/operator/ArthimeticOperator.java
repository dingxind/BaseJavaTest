package com.hp.day2.operator;

/**
 * 算术运算符测试
 * @author yangzhen
 */
public class ArthimeticOperator {

	public static void main(String[] args) {
		/**
		 * java中除法是取整
		 * 任何数据类型和字符串拼接，都转换成字符串
		 * %是两个数取余
		 */
		System.out.println("5/4的算术运算结果是:"+5/4);
		
		System.out.println("5%3的运算结果是："+5%3);
		
		/**
		 * b取值是在a+1前取的，运算完int b = a++;代码后a+1
		 * ++和--放后面用的最多
		 */
		int a = 3;
		int b = a++;
		System.out.println("a的值是"+a+",b的值是"+b);
		
		int a1 = 3;
		int b1 = ++a1;
		System.out.println("a1的值是"+a1+",b1的值是"+b1);
	}

}
