package com.hp.day14.thread;

public class YieldThreadTest {

	public static void main(String[] args) {
		Thread yieldThread1 = new YieldThread("线程1");
		Thread yieldThread2 = new YieldThread("线程2");
		yieldThread1.start();
		yieldThread2.start();
	}

}
