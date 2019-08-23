package com.hp.day15.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 字节流测试
 * 
 * @author HP
 *
 */
public class ByteStreamTest {

	public static void main(String[] args) {
		/**
		 * 字节流写入： 1.先有文件对象，判断文件是否存在，不存在先创建 2.创建文件输出流 3.把输出对象转换成字节数组
		 * 4.调用write方法写入 5.关闭输出流
		 */
		File file = new File("f:bd3.txt");
		String outStr = "明天放假了~";
		try {
			FileOutputStream fos = new FileOutputStream(file);
			byte[] byteStrArray = outStr.getBytes();
			fos.write(byteStrArray);
			fos.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		/**
		 * 1.先有文件对象，判断文件是否存在，不存在先创建
		 * 2.根据文件对象穿件文件输入流
		 * 3.创建byte类型数组，通过输入流读入fis.read(buf)
		 * 4.根据读入的字节数组的信息，通过String构造方法转换成数组
		 * 5.关闭输入流
		 */
		try {
			FileInputStream fis = new FileInputStream(file);
			byte[] buf = new byte[1024];
			int length = fis.read(buf);
			String inStr = new String(buf, 0, length);
			System.out.println("读入的文件信息是：" + inStr);
			fis.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
