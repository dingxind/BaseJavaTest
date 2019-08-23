package com.hp.day14.thread;

import java.util.ArrayList;
import java.util.List;

public class BreadStack {
	private List<Bread> breadList = new ArrayList<Bread>();
	//面包筐的容量
	private static final int MAX = 10;
	
	private static final int MIN = 0;

	/**
	 * 同步方法，同一时间只能有一个线程访问
	 * 把面包存到面包筐中
	 * @param bread 有序号的
	 */
	public synchronized void push(Bread bread){
		if(breadList.size()>=MAX){
			System.out.println("面包筐已满，请等待卖出面包");
			//面包筐满，等待消费的方法通知
			try {
				this.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		breadList.add(bread);
		System.out.println("面包" + bread.getId() + "新出炉");
		/**
		 * 作用：唤醒wait的线程，如果没有wait不起作用
		 * 当面包筐中没有面包的时候
		 */
		this.notify();
	}
	
	/**
	 * 
	 */
	public void pop(){
		synchronized (this) {
			if(breadList.size()<=MIN){
				System.out.println("面包筐已空，请等待面包出炉");
				try {
					//让顾客等待，等待当有面包出炉的时候唤醒他
					this.wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			Bread bread = breadList.get(breadList.size()-1);
			System.out.println("面包"+bread.getId()+"已被卖出");
			breadList.remove(bread);
			//通知做面包的，可以继续做了
			this.notify();
		}
	}
	
	public List<Bread> getBreadList() {
		return breadList;
	}

	public void setBreadList(List<Bread> breadList) {
		this.breadList = breadList;
	}
	
}
