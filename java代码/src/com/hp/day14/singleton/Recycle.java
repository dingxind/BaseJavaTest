package com.hp.day14.singleton;

public class Recycle {
	private static Recycle recyle;

	private Recycle() {

	}

	public static Recycle getRecycleInstance() {
		if (recyle == null)
			recyle = new Recycle();
		return recyle;
	}

	public void delete(String info) {
		System.out.println(info + "已经被回收站处理");
	}
}
