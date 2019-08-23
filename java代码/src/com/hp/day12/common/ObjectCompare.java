package com.hp.day12.common;

import com.hp.day8.extend.Person;

public class ObjectCompare {

	public static void main(String[] args) {
		/**
		 * 第二种
		 */
		Integer a = 1;
		Integer b = 1;
		/**
		 * 开辟了一块存储空间，存储1.
		 * 两个数值相等
		 */
		System.out.println("a==b?" + (a == b));
		/**
		 * equals比较的是地址
		 * 参数是Object类型，向上转型--适用于多种数据类型
		 * 否则equals(Integer i) equals(Float f) equals(Person p).......  
		 */
		System.out.println("a.equals(b)?" + a.equals(b));
		
//		/**
//		 * 第三种
//		 */
//		Integer a =new Integer(1);
//		Integer b = new Integer(1);
//		/**
//		 * new分配内存空间了，既然分配了2个，地址肯定不相等
//		 * equals方法被重写了，比较的是int类型值
//		 */
//		System.out.println("a==b?" + (a == b));
//		System.out.println("a.equals(b)?" + a.equals(b));
		
		/**
		 * 第四种
		 */
		Person p1 = new Person();
		Person p2 = new Person();
		System.out.println("p1==p2?" + (p1 == p2));
		/**
		 * 对对象类型来说：
		 * 1.重写了equals方法，按照重写的规则来
		 * 2.如果不重写，两个对象比较，==和equals都是比较的地址
		 */
		System.out.println("p1.equals(p2)?" + p1.equals(p2));
	}

}
