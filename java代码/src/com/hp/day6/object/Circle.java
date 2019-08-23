package com.hp.day6.object;

public class Circle {
	//圆的半径
	double radius;
	
	/**
	 * 计算圆的面积
	 * @param radius 半径
	 * @return 圆面积
	 */
	public double getArea(){
//		return Math.PI*radius*radius;
		return Math.PI*Math.pow(radius, 2);
	}
	
	public static void main(String[] args) {
		Circle circle = new Circle();
		circle.radius = 2;
		double area = circle.getArea();
		System.out.println("圆的面积是："+area);
	}

}
