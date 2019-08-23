package com.hp.day11.array;

import java.util.Date;

import com.hp.day8.extend.Person;
import com.hp.day8.extend.Soldier;
import com.hp.day8.extend.Student;

/**
 * 类的成员变量和方法：
 * 创建对象，对象.成员变量，对象.方法调用
 * 静态成员变量（类变量），静态方法：
 * 类名.静态成员变量，类名.静态方法
 * @author HP
 *
 */
public class ArrayDef {

	private int arr2[]= new int[3];
	
	private Student s3;
	
	public static void main(String[] args) {
		//数组的声明
		int arr[] = null;
		System.out.println(arr);
		ArrayDef ad = new ArrayDef();
		System.out.println("输出int类型数组的地址："+ad.arr2);
		System.out.println("输出int类型数组的第一个元素："+ad.arr2[0]);
		ad.arr2[1]=1;
		System.out.println("修改后的第二个元素的值是："+ad.arr2[1]);
		/**
		 * 数组中经常遇到的问题：IndexOutofBoundsException
		 * 数组越界异常
		 */
//		System.out.println(ad.arr2[3]);
		
		/**
		 * 相同数据类型的集合
		 */
		Student [] stuArray = new Student[2];
		stuArray[0] = new Student("zhang", 18, new Date(), "海大");
		
		//错误，相同数据类型的放到一起
//		stuArray[1] = new Soldier();
		
		/**
		 * 数组：相同数据类型包括数据类型的子类
		 */
		Person [] personArray = new Person[2];
		personArray[0] = new Student("zhang", 18, new Date(), "海大");
		personArray[1] = new Soldier();
		
		//静态初始化的两种形式
		int [] a = new int[]{1,3,5};
		int [] a1 = {1,3,5};
		
		/**
		 * 比较的是地址，即使值一样，地址也不同，所以不相等
		 */
		System.out.println(a==a1);
		int [] a2 = new int[3];
		a2 = new int[4];
		
		Student s1 = new Student();
		Student s2 = s1;
		System.out.println(s1==s2);
		
		//null.任何方法都会报空指针异常
		System.out.println(ad.s3.getInfo());

	}

}
