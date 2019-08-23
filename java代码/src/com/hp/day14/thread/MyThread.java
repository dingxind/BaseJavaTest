package com.hp.day14.thread;

/**
 * 多线程实现：
 *  1.继承Thread类 
 *  2.重写run方法
 *  3.创建线程对象（通过构造方法），通过调用start方法启动线程
 *  start方法和run方法区别：
 *  如果直接调用run方法，是方法调用，不是多线程
 *  如果调用start方法，会根据CPU分配的资源情况调用run，启动了一个线程
 * @author HP
 *
 */
public class MyThread extends Thread {
	private String name;

	public MyThread(String name) {
		super(name);
		this.name = name;
	}

	@Override
	public void run() {
		System.out.println("当前线程的名字："+Thread.currentThread().getName());
	}
	
	public static void main(String [] args){
		System.out.println("当前线程的名字："+Thread.currentThread().getName());
		Thread myThread = new MyThread("子线程");
		myThread.start();
	}

}
