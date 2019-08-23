package com.hp.day14.thread;

public class ConsumeBread implements Runnable {
	private BreadStack bs;

	private static final int LOOP = 20;
	private static final int SLEEP_TIME = 500;

	public ConsumeBread() {

	}

	public ConsumeBread(BreadStack bs) {
		this.bs = bs;
	}

	@Override
	public void run() {
		for (int i = 0; i < LOOP; i++) {
			bs.pop();
			try {
				Thread.sleep(SLEEP_TIME);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
