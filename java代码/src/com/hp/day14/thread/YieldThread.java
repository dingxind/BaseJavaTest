package com.hp.day14.thread;

public class YieldThread extends Thread {
	public YieldThread(String name) {
		super(name);
	}

	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			if (i != 3)
				System.out.println(Thread.currentThread().getName() + "---" + i);
			else {
				System.out.println(Thread.currentThread().getName() + "---" + i + "线程让步");
				Thread.yield();
			}
		}
	}
}
