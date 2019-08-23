package com.hp.day5.fortest;

public class MultiplyTable {

	public static void main(String[] args) {
		//i<=9和i<10效果一样
		//打印对齐，可以用制表符tab：\t
		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				System.out.print(i + "*" + j + "=" + (i * j) +"\t");
			}
			System.out.println();
		}
	}

}
