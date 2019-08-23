package com.hp.day12.common2;

/**
 * 自定义日期类 1.类的成员变量 2.构造方法（参数由少到多） 3.普通方法 4.get,set方法
 * 
 * @author yangzhen
 */
public class MyDate {
	/**
	 * 年，月，日，本身是对日期的描述，所以作为成员变量 封装性
	 */
	private int day;
	private int month;
	private int year;

	public MyDate() {

	}

	/**
	 * 有参构造方法，初始化成员变量
	 * 
	 * @param day
	 * @param month
	 * @param year
	 */
	public MyDate(int day, int month, int year) {
		/**
		 * 成员变量的作用域是整个类；局部变量（形参）作用域是方法 如果形参和成员变量名称相同，会覆盖成员变量 可以通过this.成员变量引用
		 */
		this.day = day;
		this.month = month;
		this.year = year;
	}

	public boolean equals(Object obj) {
		if (obj == null)
			return false;
		/**
		 * 为什么要强制转换？ 1.有小到大自动转，例如苹果是水果 2.由大到小需强制，例如水果是苹果，必须显示告诉它
		 */
		MyDate md = (MyDate) obj;
		// 如果两个对象的三个成员变量值完全相等，两个对象相等
		if (this.day == md.getDay() && this.month == md.getMonth() && this.year == md.getYear())
			return true;
		else
			return false;
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
