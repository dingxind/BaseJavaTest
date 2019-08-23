package com.hp.day2.operator;

/**
 * 赋值运算符测试
 * @author yangzhen
 */
public class AssignmentOperator {

	public static void main(String[] args) {
		/**
		 * 赋值运算符应用场景： 
		 * 1、变量定义 
		 * 2、把方法返回值赋给变量 
		 * 3、通过运算赋值
		 */
		int i = 5;
		i = i + 2;
		//下面一行和上面一行效果一样
		i += 2;
		/**
		 * 赋值运算符=经常和==混淆
		 * ==比较相等
		 */
		short s = 3;
		s = (short) (s + 4);
		//相当于s = s+4，可以把值运算后直接赋给左侧变量的数据类型
		s+=4;
	}

}
