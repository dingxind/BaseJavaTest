package com.hp.day14.thread;

public class JoinThread extends Thread{
	public JoinThread(String name){
		super(name);
	}

	@Override
	public void run() {
		for(int i=0;i<10;i++){
			System.out.println("I am"+getName());
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
}
