package com.hp.day8.extend2;

public class Cylender extends Circle{
	//圆柱的高
	private double height;
	public Cylender(){
		
	}
	
	public Cylender(double radius, double height){
		super(radius);
		//this.height表示成员变量，height表示形式参数
		this.height = height;
	}
	
	public double getVolumn(){
		return this.getArea()*height;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}
	
}
