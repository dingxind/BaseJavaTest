package com.hp.day16.reflection;

public class FruitFactory {
	/**
	 * 方法参数：执行方法时需要额外提供的信息
	 * eg:两个数的加法，需要两个参数
	 * @param fruitName 水果名称
	 * @return 返回生成的水果对象
	 * static关键字：
	 * 静态方法中不能直接调用非静态方法。创建对象，对象.方法
	 * 非静态方法中可以调用静态方法，类名.方法
	 * static类型的成员变量：多个对象共享的数据
	 * static类型的方法：工具方法
	 */
	public static Fruit getInstance(String fruitName){
		/**
		 * 首字母：Fruit f
		 * 每个单词首字母：TeacherService ts
		 * 常规缩写：不能有歧义，password pwd,student stu
		 * 单个词：全拼Fruit fruit
		 */
		Fruit f = null;
		//if语句如果只有一行可以不写{}
		if("Apple".equals(fruitName))
			f = new Apple();
		else if("Orange".equals(fruitName))
			f = new Orange();
		return f;
	}
	
	public static void main(String [] args){
		/**
		 * 在本类中的静态方法可以直接调用--》getInstance("Apple")
		 * 在其他类中，需要使用类名.方法名
		 */
		Fruit f = FruitFactory.getInstance("Apple");
		f.eat();
		/**
		 * 静态方法中调用普通方法：
		 * 普通方法调用，需要事先创建对象，使用对象.方法
		 * 在本类中，普通方法之间可以直接调用
		 */
//		FruitFactory ff = new FruitFactory();
//		Fruit f2 = ff.getInstance("Orange");
//		f2.eat();
	}
}
