package com.hp.day2.datatype;

/**
 * 用于测试数据类型及转换
 * @author yangzhen
 * 类名遵循类命名规范XxxYyyZzz
 */
public class DataTypeTest {
	public static void main(String [] args){
		/**
		 * 在一个方法内，局部变量名不能重复、
		 * 在方法内的变量成为局部变量
		 * 变量分类：成员变量和局部变量
		 * 	 	  基本数据类型变量（8种）和引用数据类型变量（3种）
		 * 变量ch即是局部变量又是基本数据类型变量
		 */
		//一行语句，要以分号结尾
		char ch = 'A';
		byte b = 15;
		short s = 5;
		int i = 100;
		long l = 10L;
		//小数如果是float类型，必须加f或F
		float f = 15.0f;
		double d = 10.0;
		boolean bl = true;
		
		/**
		 * 数据类型转换：有小到大自动转，由大到小需强制
		 * 苹果是水果没错，说水果是苹果有问题
		 * 等号是赋值的意思
		 */
		int byte2int = b;
		int short2int = s;
		long byte2long = b;
		int char2int = ch;
		
		
		byte int2byte = (byte) i;
		short int2short = (short) i;
		float double2float = (float) d;
		
		//byte,short,char类型运算时先转换成int数据类型
		int chPlusb = ch + b;
		//int bool = true;
		
		/**
		 * char类型是基本数据类型，表示单个字符，用单引号引起来
		 * String类似是类引用数据类型，双引号引起来，表示字符串
		 */
		String s2 = "a"+i;
		
		//s是short类型，2是int类型，运算后是int类型，转换成short类型需强制转换
		short sh = (short) (s*2);
		
		s = (short) (s + 3);
	}
}
