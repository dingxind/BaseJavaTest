package com.hp.day12.common2;

/**
 * 如果直接写字符串：在空间中会直接分配一块区域
 * 虽然是引用数据类型，直接赋值字符串或者通过构造方法创建字符串
 * 也是值传递，副本
 * 结果都无法保留
 * @author HP
 *
 */
public class SwapString {

	public static void main(String[] args) {
		String s1 = "zhang";
		String s2 = "wang";
		SwapString ss = new SwapString();
		ss.swapString(s1, s2);
		ss.printInfo(s1, s2, "方法调用后输出");
		
		String s3 = new String("li");
		String s4 = new String("yang");
		ss.swapString(s3, s4);
		ss.printInfo(s3, s4, "方法调用后输出");
	}

	/**
	 * 交换两个String类型的值
	 * 
	 * @param s1
	 * @param s2
	 */
	public void swapString(String s1, String s2) {
		String temp = s1;
		s1 = s2;
		s2 = temp;
		/**
		 * 同一类中普通方法之间可以相互调用，普通可以调用静态方法（static）
		 * 省略了this.
		 */
		this.printInfo(s1, s2, "方法中输出");
	}

	/**
	 * 根据附加信息打印
	 * @param s1
	 * @param s2
	 * @param info 方法中输出；方法调用后输出
	 */
	public void printInfo(String s1, String s2, String info) {
		System.out.println(info + "第一个的值是:" + s1);
		System.out.println(info + "第二个的值是:" + s2);
	}

}
