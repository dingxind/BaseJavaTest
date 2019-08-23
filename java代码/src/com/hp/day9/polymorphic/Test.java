package com.hp.day9.polymorphic;

/**
 * 重写：
 * 重写是针对父类和子类的关系的
 * 1.要有继承关系
 * 2.父类方法不能满足子类需求，子类重写父类方法
 * 3.父类引用指向子类对象
 * 
 * 如果主要调用重写的方法，使用子类引用和父类引用都可以
 * 如果主要调用子类拓展的方法，声明为子类的引用，否则还得强制转换
 * @author HP
 *
 *	
 *	重载：方法名相同，参数个数、参数类型不同
 *		针对同一个类来说的
 *		构造方法，普通方法都可以重载
 *		仅通过返回类型不能识别方法的重载
 *	重写：父类和子类之间的关系
 *		继承关系
 *		父类的方法不能满足子类的需求，子类重写父类的方法（方法名，参数类型完全一致，访问权限不能低于父类）
 *		子类对象指向父类引用Animal cat = new Cat();
 */
public class Test {

	public static void main(String[] args) {
		Animal animal = new Animal();
		Animal dog = new Dog();
		Cat cat = new Cat();
		//普通方法的调用使用对象.方法
		animal.eat();
		animal.shout();
		dog.eat();
		dog.shout();
		cat.eat();
		cat.shout();
		
		cat.climb();
	}

}
