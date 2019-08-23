package com.hp.day16.reflection;

public class FruitReflectionFactory {

	public static Fruit getInstance(String className) {
		//局部变量的作用域是本方法，出了方法无效了
		Fruit f = null;
		try {
			//调用无参构造方法
			f = (Fruit) Class.forName(className).newInstance();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return f;
	}

	public static void main(String[] args) {
		/**
		 * 使用Class.forName的地方，参数的名字都是包名.类名
		 */
		Fruit f = FruitReflectionFactory.getInstance("com.hp.day16.reflection.Apple");
		f.eat();
	}

}
