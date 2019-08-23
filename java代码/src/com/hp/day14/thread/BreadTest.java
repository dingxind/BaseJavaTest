package com.hp.day14.thread;

public class BreadTest {

	public static void main(String[] args) {
		/**
		 * 生产者消费者模式--操作的必须是同一对象
		 */
		BreadStack bs = new BreadStack();
		ProduceBread pb = new ProduceBread(bs);
		ConsumeBread cb = new ConsumeBread(bs);
		Thread produceThread = new Thread(pb,"生产者线程");
		Thread consumeThread = new Thread(cb,"消费者线程");
		produceThread.start();
		consumeThread.start();
	}

}
