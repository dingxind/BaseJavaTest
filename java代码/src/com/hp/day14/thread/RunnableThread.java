package com.hp.day14.thread;

public class RunnableThread implements Runnable {

	@Override
	public void run() {
		System.out.println("Runnable接口实现");
	}

	public static void main(String[] args) {
		//?为什么要用向上转型？
		//如果主要使用子类派生出的方法，则最好不使用向上转型
		Runnable runnableThread = new RunnableThread();
		Thread thread = new Thread(runnableThread);
		thread.start();
	}

}
