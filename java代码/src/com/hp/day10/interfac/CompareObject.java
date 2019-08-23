package com.hp.day10.interfac;

public interface CompareObject {
	/**
	 * 用于比较两个对象
	 * @param o 向上转型
	 * @return >0表示当前对象大
	 * 		<0表示比较对象大
	 * 		=0表示相等
	 */
	int compareTo(Object o);
}
