package com.hp.day12.common;

public class MyDate {
	private int day;
	private int month;
	private int year;

	public MyDate() {

	}

	public MyDate(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}

	@Override
	public boolean equals(Object obj) {
		/**
		 * 入口是不安全的，一般情况下需要对入参条件提出质疑
		 * obj是null的情况下，obj调用任何方法都会抛异常
		 */
		if (null == obj)
			return false;
		MyDate md = (MyDate) obj;
		if (this.day == md.getDay() && this.month == md.getMonth() && this.year == md.getYear())
			return true;
		else
			return false;
	}

	public static void main(String[] args) {
		MyDate m1 = new MyDate(14, 3, 1976);
		MyDate m2 = new MyDate(14, 3, 1976);

		if (m1 == m2) {
			System.out.println("m1==m2");
		} else {
			System.out.println("m1!=m2"); // m1 != m2
		}

		if (m1.equals(m2)) {
			System.out.println("m1 is equal to m2"); // m1 is equal to m2
		} else {
			System.out.println("m1 is not equal to m2");
		}

	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

}
