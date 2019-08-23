package com.hp.day14.thread;

public class SleepThread extends Thread {
	public SleepThread(String name) {
		super(name);
	}

	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println(Thread.currentThread().getName()+"输入"+i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String [] args){
		Thread sleepThread = new SleepThread("休眠线程");
		sleepThread.start();
	}

}
