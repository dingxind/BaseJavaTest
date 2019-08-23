package com.hp.day13.collection;

import java.util.HashSet;
import java.util.Set;

/**
 * 编写程序，获取命令行参数中的字符串列表，输出其中重复的字符、不重复的字符以及消除重复以后的字符列表
 * @author yangzhen
 */
public class DuplicateChar {
	public static void main(String[] args) {
		String str = "congratulationstoyou";
		//重复的集合
		Set dupliCharSet = new HashSet();
		//不重复的集合,字符串中出现后，只保留一次
		Set unDupliCharSet = new HashSet();
		//所有
		Set allCharsSet = new HashSet();
		// toCharArray把字符串转换为字符数组
		char[] charArray = str.toCharArray();
		for (int i = 0; i < charArray.length; i++) {
			if(!unDupliCharSet.add(charArray[i])){
				dupliCharSet.add(charArray[i]);
			}
		}
		//if语句，for循环语句，如果只有一句，可以不加{}
		if(unDupliCharSet == null || unDupliCharSet.size()<1)
			System.out.println("不重复的字符集合中为空");
		else{
			System.out.println("不重复的字符为：");
			for(Object ch :unDupliCharSet)
				System.out.print((char)ch);
		}
		System.out.println();
		
		if(dupliCharSet == null || dupliCharSet.size()<1)
			System.out.println("重复的字符集合中为空");
		else{
			System.out.println("重复的字符为：");
			for(Object ch :dupliCharSet)
				System.out.print((char)ch);
		}
		
		/**
		 * unDupliCharSet:如果没有，添加一份，后面再有，不添加了
		 * dupliCharSet：前面已经有过，无法再添加进去了
		 */
		allCharsSet.addAll(unDupliCharSet);
//		allCharsSet.addAll(dupliCharSet);
		allCharsSet.removeAll(dupliCharSet);
		System.out.println("消除重复以后的字符列表是：");
		for(Object ch :allCharsSet)
			System.out.print((char)ch);
	}}