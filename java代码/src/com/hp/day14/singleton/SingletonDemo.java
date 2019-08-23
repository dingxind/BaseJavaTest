package com.hp.day14.singleton;

/**
 * 单例模式： 只维护一套信息--所有对象要共享这套数据--static，不能随便访问--private
 * 只有一个实例--不能让其他通过构造方法随意创建，构造方法私有（本类可以访问） 
 * 对外提供这个实例--如果实例不存在，即通过构造方法创建；如果存在直接返回
 * @author HP
 *
 */
public class SingletonDemo {
	private static SingletonDemo instance;

	private SingletonDemo() {

	}

	/**
	 * 如果方法不写成静态的，SingletonDemo sd = new SingletonDemo();sd.getInstance();
	 * @return
	 */
	public static SingletonDemo getInstance() {
		if (instance == null)
			instance = new SingletonDemo();
		return instance;
	}
	
	public static void main(String [] args){
		//单例模式获取唯一实例的方式，调用静态方法获取
		/**
		 * 获取一个对象：可以通过构造方法获取；也可以通过方法返回获取（返回的数据类型和声明引用的数据类型要匹配）
		 * 怎么证明是同一个？
		 */
		SingletonDemo sd = SingletonDemo.getInstance();
		SingletonDemo sd1 = SingletonDemo.getInstance();
		System.out.println(sd==sd1);
	}
}
