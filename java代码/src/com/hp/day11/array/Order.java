package com.hp.day11.array;

/**
 * 数组遍历，顺序输出
 * 
 * @author HP
 *
 */
public class Order {
	// 类中的变量是成员变量
	private int a[] = new int[] { 10, 8, 20, 7, 3, 6, 15, 0, -2, 30 };
	// private int a[] = { 10, 8, 20, 7, 3, 6, 15, 0, -2, 30 };

	public static void main(String[] args) {
		// 成员变量（数组）的顺序输出
		// Order order = new Order();
		// for (int i = 0; i < order.a.length; i++) {
		// System.out.println(order.a[i]);
		// }
		// 局部变量（在方法里的变量）
		int a[] = new int[] { 10, 8, 20, 7, 3, 6, 15, 0, -2, 30 };
		//在同一方法内的局部变量，可以直接访问
		//数组名.length方法获得数组的大小
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}

}
