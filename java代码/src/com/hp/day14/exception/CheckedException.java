package com.hp.day14.exception;

public class CheckedException {

	/**
	 * 可检查异常要求必须两种解决方式：
	 * 除了RuntimeException的：io
	 * 1.try-catch
	 * 2.throws
	 * @param args
	 * @throws ClassNotFoundException 
	 */
	public static void main(String[] args) throws ClassNotFoundException {
		/**
		 * 类名.方法名--方法一定是静态方法
		 * 如果不是静态方法，创建对象调用
		 * EmployeeService es = new EmployeeService();
		 */
//		try {
//			Class.forName("com.mysql.jdbc.Driver");
//		} catch (ClassNotFoundException e) {
//			e.printStackTrace();
//		}
		Class.forName("com.mysql.jdbc.Driver");
	}

}
