package com.hp.day14.thread;

public class JoinThreadTest {

	public static void main(String[] args) {
		Thread joinThread = new JoinThread("Join线程");
		joinThread.start();
		try {
			joinThread.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		for (int i = 0; i < 10; i++) {
			System.out.println("I am Main Thread");
		}
	}

}
