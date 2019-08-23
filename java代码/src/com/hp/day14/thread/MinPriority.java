package com.hp.day14.thread;

public class MinPriority extends Thread {
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName() + "正在输出:");
	}
}
