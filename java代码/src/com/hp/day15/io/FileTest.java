package com.hp.day15.io;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class FileTest {

	public static void main(String[] args) {
		/**
		 * 直接给定一个路径，路径有嵌套，必须先保证前面路径是存在的，前面的路径都是文件夹，必须先有
		 * 尽量不要有中文，空格
		 * 例如：配置数据库连接信息，有可能会中文转义%....
		 */
		File dir = new File("F:/张三");
		if(!dir.exists()){
			//创建目录
			dir.mkdir();
		}
		File file = new File("F:/张三/bd3.txt");
		if(!file.exists()){
			try {
				file.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		System.out.println("是文件吗："+file.isFile());
		System.out.println("是目录吗："+file.isDirectory());
		System.out.println("文件名是："+file.getName());
		System.out.println("文件路径:"+file.getPath());
		System.out.println("文件绝对路径："+file.getAbsolutePath());
		System.out.println("文件最后的修改时间："+new Date(file.lastModified()));
		System.out.println("文件的大小是:"+file.length());
		/**
		 * 在windows下文件可读可写可执行一般都具有权限
		 * 在linux下，一般需要赋予文件权限才能做操作
		 */
		System.out.println("文件是否可读："+file.canRead());
		System.out.println("文件是否可写："+file.canWrite());
	}

}
