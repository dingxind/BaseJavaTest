package com.hp.day15.io;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * 1.字符流和字节流；输入流和输出流
 * 2.字节流--一般都是以Stream结尾，输入就是input，输出就是output
 * 	 字符流--一般都是Reader(输入流)，Writer(输出流)
 * 3.文件的字节流字符流，在前面再File
 * @author HP
 *
 */
public class CharStreamTest {

	public static void main(String[] args) throws IOException {
		/**
		 * 字符流写入：
		 * 1.创建FileWriter对象
		 * 2.给定字符串，直接写入fw.write(),写入多次
		 * 3.关闭字符流
		 */
		File file = new File("F:bd32.txt");
		if (!file.exists())
			file.createNewFile();
		FileWriter fw = new FileWriter(file);
		String id = "20190101";
		String name = "zhangsan";
		String sex = "male";
		fw.write(id);
		fw.write(name);
		fw.write(sex);
		fw.close();
		
		
		FileReader fr = new FileReader(file);
		char[] buf = new char[1000];
		int length = fr.read(buf);
		String inStr = new String(buf,0,length);
		System.out.println("文件读入的信息是："+inStr);
		fr.close();
	}

}
