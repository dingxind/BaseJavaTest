package com.hp.day12.common2;

public class StringBufferTest {

	public static void main(String[] args) {
		/**
		 * StringBuffer线程安全
		 * 1.构造方法
		 * 2.append，在原字符串的基础上添加字符串
		 */
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < 20; i++) {
			sb.append("s");
		}
		//StringBuffer也重写了toString
		System.out.println(sb.toString());
		StringBuffer sb2 = new StringBuffer();
		sb2.append("select");
		sb2.append(" * ");
		sb.append(" from ");
		sb.append(" user ");
		sb.append(" where ");
	}

}
