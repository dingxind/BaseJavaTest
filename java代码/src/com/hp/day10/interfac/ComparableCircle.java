package com.hp.day10.interfac;

//先继承后实现
public class ComparableCircle extends Circle implements CompareObject {
	public ComparableCircle() {

	}

	public ComparableCircle(double radius) {
		super(radius);
	}

	@Override
	public int compareTo(Object o) {
		// 比较对象，向下转型，需要强制转换
		Circle c = (Circle) o;
		if (this.getRadius() > c.getRadius())
			return 1;
		else if (this.getRadius() < c.getRadius())
			return -1;
		else
			return 0;
	}

	public static void main(String[] args) {
		ComparableCircle c1 = new ComparableCircle(3);
		ComparableCircle c2 = new ComparableCircle(2);
		int result = c1.compareTo(c2);
	}

}
