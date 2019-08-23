package com.hp.day5.fortest;

public class Flower {

	public static void main(String[] args) {
		System.out.println("100~999之间的水仙花数是：");
		for (int i = 100; i <= 999; i++) {
			int hundred = i / 100;
			int ten = i / 10 % 10;
			int one = i % 10;
			if(i == Math.pow(hundred, 3)+Math.pow(ten, 3)+Math.pow(one, 3)){
				System.out.println(i);
			}
		}
	}

}
