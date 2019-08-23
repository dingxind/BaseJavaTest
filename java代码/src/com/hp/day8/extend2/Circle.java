package com.hp.day8.extend2;

public class Circle {
	// 圆的半径
	private double radius;

	/**
	 * 构造方法没有返回类型，方法名和类名完全相同 用于创建对象，可以初始化成员变量
	 * 构造方法重载：方法名相同，参数列表不同（参数的个数，类型不同）
	 */
	public Circle() {

	}

	public Circle(double radius) {
		this.radius = radius;
	}
	
	public double getArea(){
		/**
		 * pow表示计算第一个参数的第二个参数次方
		 */
		return Math.PI * Math.pow(radius, 2);
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

}
