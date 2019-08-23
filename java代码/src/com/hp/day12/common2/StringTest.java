package com.hp.day12.common2;

public class StringTest {

	public static void main(String[] args) {
		/**
		 * String s = "今天星期四"，在内存中相同的值只开辟一块区域 
		 * int a =1;
		 */
		String s = "今天星期四";
		s = "今天星期四"+",这个月是1月";
		String s1 = "今天星期四";
		String s2 = new String("明天星期五");
		String s3 = new String("明天星期五");
		System.out.println("s2.equals(s3):" + s2.equals(s3));
		
		/**
		 * 一张试卷由多道题组成
		 * 试题表，记录试题信息，试题id，试题内容
		 * 试卷表，试卷id，试题
		 */
		String questionIds = new String("1,3,5,10");
		String [] questionIdsArray = questionIds.split(",");
	}

}
