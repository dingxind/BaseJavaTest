package com.hp.day14.thread;

/**
 * 高优先级线程类
 * 如何体现高优先级？setPriority高级别
 * @author HP
 */
public class MaxPriority extends Thread {
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName() + "正在输出:");
	}
}
