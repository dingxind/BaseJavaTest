package com.hp.day2.operator;

/**
 * 逻辑运算符
 * @author HP
 *
 */
public class LogicOperator {

	public static void main(String[] args) {
		int height = 190;
		int rich = 100000;
		boolean handsome = true;
		//多个条件同时成立，使用&&
		System.out.println("要找的男朋友"+((height>180) && (rich>10000) && handsome));
		//多个条件满足其一，使用||
		
		boolean skinWhite = true;
		int rich2 = 50000;
		boolean beautiful = true;
		System.out.println("要找的女朋友："+(skinWhite || rich2 > 40000 || beautiful));
	}

}
