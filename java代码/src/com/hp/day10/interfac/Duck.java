package com.hp.day10.interfac;

public class Duck implements Runnable, Swimable, Fliable {
	@Override
	public void fly() {
		System.out.println("煮熟的鸭子飞了");
	}

	@Override
	public void swim() {
		System.out.println("鸭子可以游泳~");
	}

	@Override
	public void run() {
		System.out.println("鸭子可以跑");
	}

	public static void main(String[] args) {
		/**
		 * 为什么没有用向上转型？
		 * 实现了3个接口，如果用某一接口作为父引用，使用接口的其他方法都需要强制转换
		 * 如果主要使用一个接口的方法，可以使用向上转型
		 * 如果可能使用多个接口的多个方法，建议使用本类
		 */
		Runnable duck = new Duck();
		duck.run();
		((Duck) duck).swim();
		((Duck) duck).fly();
	}

}
