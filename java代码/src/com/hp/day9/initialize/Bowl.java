package com.hp.day9.initialize;

/**
 * 变量的初始化：
 * 1.系统可以给初始化
 * 2.可以在定义的时候初始化
 * 3.可以在块（静态块，非静态块）中初始化
 * 4.可以在构造方法中初始化
 * 
 * 先加载静态成员变量，按照顺序，包括静态块的顺序，谁在前先加载谁
 * 静态变量只加载一次
 * 成员变量按照代码顺序初始化
 * 构造方法调用
 * c4
 * c3
 * 以下四行是第一个对象的初始化
 * c1 = null
 * c2= cup2
 * c1 = cup1
 * 调用构造方法
 * 以下四行是第二个对象的初始化
 * c1 = null
 * c2= cup2
 * c1 = cup1
 * 调用构造方法
 * 
 * @author HP
 *
 */
public class Bowl {
	Cup c1;
	Cup c2 = new Cup(2);
	{
		c1 = new Cup(1);
	}
	static {
		c4 = new Cup(4);
		System.out.println("Bowl中的静态块,静态块只在类加载的时候运行，所以只运行一次");
	}
	static Cup c3 = new Cup(3);
	static Cup c4;

	Bowl() {
		System.out.println("new Bowl()");
	}

	static void f() {
		System.out.println("Bowl中的静态方法f()被访问");
	}

	public static void main(String[] args) {
		Bowl.f();
		System.out.println("实例化一个Bowl对象");
		new Bowl();
		System.out.println("再实例化一个Bowl对象");
		new Bowl();
	}

}
