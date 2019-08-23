package com.hp.day9.initialize;

/**
 * 1.静态成员变量
 * 2.静态块
 * 3.静态方法
 * 4.成员变量
 * 5.非静态块
 * 6.普通方法
 * 7，构造方法
 * @author HP
 *
 */
public class Cat {
	int c1 = f1(1);

	int f1(int i) {
		System.out.println("Cat unstatic " + i);
		return i;
	}

	{
		System.out.println("Cat unstatic block");
	}
	static int c2 = f2(2);

	static int f2(int i) {
		System.out.println("Cat static " + i);
		return i;
	}

	static {
		System.out.println("Cat static block");
	}

	public Cat() {
		System.out.println("new Cat()");
	}

	public static void main(String[] args) {
		new Cat();
	}
}
