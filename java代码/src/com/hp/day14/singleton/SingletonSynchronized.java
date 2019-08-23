package com.hp.day14.singleton;

/**
 * 使用synchronized关键字，可以应用于多线程下的场景
 * @author HP
 */
public class SingletonSynchronized {
	private static SingletonSynchronized instance = null;
	private SingletonSynchronized(){
		
	}
	
	public static SingletonSynchronized getInstance(){
		if(instance == null){
			/**
			 * 多线程场景下，可能多个类会访问同一资源
			 * 都会调用getInstance方法
			 * A调用的时候发现instance == null，B调用的时候也是一样的结果，两个都会创建
			 * 会造成创建了2个对象
			 * 如果使用了synchronized，同一资源，只能有1个访问，其他访问的时候等待
			 */
			synchronized(SingletonSynchronized.class){
				instance = new SingletonSynchronized();
			}
		}
		return instance;
	}
}
