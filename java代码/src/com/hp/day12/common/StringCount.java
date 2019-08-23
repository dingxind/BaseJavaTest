package com.hp.day12.common;

/**
 * 请统计"nba"在字符串"nbaernbatynbauinbaopnba"中出现的次数 提示：indexOf，当返回-1时，表示字符串结束
 * 
 * @author yangzhen
 *
 */
public class StringCount {

	public static void main(String[] args) {
		String s = "nbaernbatynbauinbaopnba";
		/**
		 * 从头开始找，找nba，一直找到尾，找到一个计数+1
		 */
		int index = 0;
		// 计数器
		int count = 0;

		String searchFor = "nba";
		/**
		 * s.indexOf("nba", index): 从index开始查找nba字符串，如果找到了，继续；如果找不到，返回-1
		 */
		while ((index = s.indexOf(searchFor, index)) != -1) {
			// 当找到了一个符合条件的字符串时，序号从当前字符串+搜索的字符串长度开始再查找
			index += searchFor.length();
			// 如果进入循环，说明找到了，否则不会再进入循环了
			count++;
		}
		System.out.println(searchFor + "的个数为：" + count);
	}

}
