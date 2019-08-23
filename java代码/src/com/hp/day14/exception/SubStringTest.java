package com.hp.day14.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SubStringTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String origin;
		int beginIndex;
		int endIndex;
		try {
			System.out.println("请输入字符串");
			origin = sc.next();
			System.out.println("请输入截取的起始序号");
			beginIndex = sc.nextInt();
			System.out.println("请输入截取的终止序号");
			endIndex = sc.nextInt();
			SubStringTest sst = new SubStringTest();
//			origin = null;
			String result = sst.subString(origin, beginIndex, endIndex);
			System.out.println("截取的字符串是：" + result);
		} catch (InputMismatchException e) {
			System.out.println("输入格式有误~");
		} catch (NullPointerException e) {
			System.out.println(e.getMessage());
		} catch (StringIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	/**
	 * 求字符串的子串
	 * 
	 * @param origin
	 *            源字符串
	 * @param beginIndex
	 *            起始序号
	 * @param endIndex
	 *            终止序号
	 * @return 截取的字符串 如果返回null表示出现异常
	 */
	public String subString(String origin, int beginIndex, int endIndex) {
		if (origin == null)
//			return null;
			throw new NullPointerException("源字符串为null");
		// {
		// System.out.println("源字符串为null");
		// return null;
		// }
		if (beginIndex < 0 || endIndex > origin.length() || beginIndex >=origin.length())
			throw new StringIndexOutOfBoundsException("序号越界");
		if (beginIndex > endIndex)
			throw new StringIndexOutOfBoundsException("开始序号大于结束序号异常~");
		return origin.substring(beginIndex, endIndex);
//		String result = null;
//		try{
//			result = origin.substring(beginIndex, endIndex);
//		}catch(Exception e){
//			e.printStackTrace();
//		}
//		return result;
	}
}
