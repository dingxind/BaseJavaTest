package com.hp.day8.extend2;

public class TestCylender {

	public static void main(String[] args) {
//		//创建圆柱对象
//		Cylender cylender = new Cylender();
//		//设置底半径和圆柱的高
//		cylender.setRadius(2);
//		cylender.setHeight(2);
		Cylender cylender = new Cylender(2, 2);
		System.out.println("圆柱的体积为："+cylender.getVolumn());
	}

}
