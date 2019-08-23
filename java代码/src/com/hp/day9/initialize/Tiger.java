package com.hp.day9.initialize;

public class Tiger extends Cat {
	int c3 = f1(3);

	@Override
	int f1(int i) {
		System.out.println("Tiger unstatic " + i);
		return i;
	}

	{
		System.out.println("Tiger unstatic block");
	}
	static int c4 = f2(4);

	static int f2(int i) {
		System.out.println("Tiger static " + i);
		return i;
	}

	static {
		System.out.println("Tiger static block");
	}

	public Tiger() {
		super();
		System.out.println("new Tiger()");
	}

	public static void main(String[] args) {
		new Tiger();
	}
}
