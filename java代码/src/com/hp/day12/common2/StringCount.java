package com.hp.day12.common2;

/**
 * 请统计"nba"在字符串"nbaernbatynbauinbaopnba"中出现的次数
 * 
 * @author HP
 */
public class StringCount {

	public static void main(String[] args) {
		/**
		 * 变量一般遵循的原则
		 * 1.类名，第一个单词首字母小写，其他不变 UserService userService；User user
		 * 2.使用类名第一个字母：String s;Person p
		 * 3.多个单词，每个单词首字母：UserService us; UserDao ud
		 * 4.常用缩写，password pwd student->stu
		 * 5.循环计数，一般情况下无意义，int i, int j, int k
		 * 6.附带自解释：List userList
		 */
		String s = new String("nbaernbatynbauinbaopnba");
		/**
		 * s.indexOf("nba",index) == -1表示找不到了 
		 * 更新多少次不确定，用到循环 while 
		 * 统计次数，计数
		 */
		int count = 0;
		String searchFor = new String("nba");
		int index = 0;
		while((index = s.indexOf(searchFor,index)) !=-1){
			count++;
			index += searchFor.length();
		}
		System.out.println(searchFor +"的个数是："+count);
	}

}
