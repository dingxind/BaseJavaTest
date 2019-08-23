package com.hp.day12.common2;

/**
 * 基本数据类型相交换，只在方法里交换，结果不能保存下来
 * 在方法执行时，对数据创建了副本
 * 例如：抄作业，A作业写完了，B抄了一份，发现某道题观点不一致，自己修改了，A的不便
 * 值传递
 * @author HP
 *
 */
public class SwapValue {

	public static void main(String[] args) {
		/**
		 * 静态方法中只能调用静态方法，Calender.getInstance() 
		 * 普通方法调用：先创建对象，使用对象.方法
		 */
		SwapValue sv = new SwapValue();
		int a = 2;
		int b = 3;
		sv.swap(a, b);
		System.out.println("方法调用后a的值是:"+a);
		System.out.println("方法调用后b的值是:"+b);
	}

	/**
	 * 交换两个数
	 * @param a
	 * @param b
	 */
	public void swap(int a, int b) {
		int temp = b;
		b = a;
		a = temp;
		System.out.println("a的值是:"+a);
		System.out.println("b的值是:"+b);
	}
}
