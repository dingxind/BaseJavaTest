package com.hp.day14.thread;

public class ProduceBread implements Runnable {
	private BreadStack bs;

	private static final int LOOP = 20;
	private static final int SLEEP_TIME = 50;

	public ProduceBread() {

	}

	public ProduceBread(BreadStack bs) {
		this.bs = bs;
	}

	@Override
	public void run() {
		for (int i = 0; i < LOOP; i++) {
			Bread bread = new Bread(i);
			bs.push(bread);
			try {
				Thread.sleep(SLEEP_TIME);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
