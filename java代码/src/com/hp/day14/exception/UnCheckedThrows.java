package com.hp.day14.exception;

public class UnCheckedThrows {

	public static void main(String[] args) {
		UnCheckedThrows uct = new UnCheckedThrows();
		uct.divide(1, 0);
//		uct.divide2(1, 0);
	}

	public int divide(int a, int b) {
		return a / b;
	}

	public int divide2(int a, int b) throws ArithmeticException{
		return a / b;
	}
}
