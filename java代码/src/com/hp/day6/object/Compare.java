package com.hp.day6.object;

/**
 * 比较两个整数的大小
 * @author HP
 *
 */
public class Compare {
	
	/**
	 * 修饰符，方法一般写成public，如果只有本方法使用写成private
	 * 返回类型：如果不需要返回，void
	 * 		  如果需要返回结果，返回结果的类型，返回值要和方法的返回类型匹配
	 * 比较两个数，需要输入int a, int b
	 * 数据类型 参数名 参数名尽量顾名思义
	 * 在方法中变量需要先声明/定义，后使用
	 * 方法定义时，括号中的参数是形参，形式参数，在方法调用时才传的实际参数
	 * 如果方法返回类型不是void，必须有return，并且数据类型要匹配
	 * @param a
	 * @param b
	 * @return 返回两个整数的最大值
	 */
	public int max(int a, int b){
		/**
		 * if(a>=b)
		 * 	return a;
		 * else
		 * return b;
		 */
		a = 6;
		return a>=b?a:b;
	}
	
	/**
	 * 求两个整数的最小值
	 * 局部变量作用域在方法内
	 * @param a
	 * @param b
	 * @return
	 */
	public int min(int a,int b){
		return a<b?a:b;
	}
	
	public static void main(String[] args) {
		//一般引用数据类型创建的成为对象或实例
		Compare compare = new Compare();
		//一般，方法的返回值使用相同数据类型的变量接收，因为后面可能还会用到这个结果
		int a = 10;
		int b = 5;
		int result = compare.max(a, b);
		System.out.println("两个数的最大值是："+result);
		int result2 = compare.min(4, 6);
		System.out.println("两个数的最小值是："+result2);
	}

}
