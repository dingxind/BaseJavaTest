package com.hp.day11.array;

public class TwoDimension {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][]={{1,2,3},{4,5,6}};
		/**
		 * 二维数组中每一维都是一个数组
		 * 外层循环循环的一维数组
		 * a是数组，数组中有2个元素，逗号隔开的大括号
		 * 看到了大括号，说明每个元素又分别都是数组
		 * a[i]这种方式也是数组，a[i].length表示第i个数组的长度
		 * 引用二维数组，a[i][j]方式
		 */
		for (int i=0;i<a.length;i++){
			for(int j=0;j<a[i].length;j++)
				System.out.println(a[i][j]);
		}
	}

}
