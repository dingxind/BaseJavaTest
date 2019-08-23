package com.hp.day14.thread;

/**
 * 线程优先级测试
 * 
 * @author HP
 */
public class PriorityTest {
	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			//线程0~4都是优先级级别低的线程，线程5~9都是优先级级别高的线程
			Thread maxPriority = new Thread(new MaxPriority(),"线程" + (i + 5) + "优先级高的线程");
			Thread minPriority = new Thread(new MinPriority(),"线程" + i + "优先级低的线程");
			//设置线程优先级
			maxPriority.setPriority(Thread.MAX_PRIORITY);
			minPriority.setPriority(Thread.MIN_PRIORITY);
			//启动线程
			maxPriority.start();
			minPriority.start();
		}
	}
}
