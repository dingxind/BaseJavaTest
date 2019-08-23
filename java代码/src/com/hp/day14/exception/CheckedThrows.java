package com.hp.day14.exception;

public class CheckedThrows {

	public static void main(String[] args) {
		CheckedThrows ct = new CheckedThrows();
		/**
		 * 检查异常，如果在方法体上throws，在调用此方法的方法内-try-catch，要么在方法体上继续throws
		 * j2se程序，throws到main方法上就到头了
		 * 如果catch的异常很多，十个八个，RuntimeException,Exception
		 */
		try {
			ct.loadDriver();
		} catch (NullPointerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (ClassNotFoundException e) {
		}

	}

	public void loadDriver() throws ClassNotFoundException{
		Class.forName("com.mysql.jdbc.Driver");
	}
}
