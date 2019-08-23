package com.hp.day12.common2;

/**
 * 比较数值及对象
 * debug模式：开发中100%使用的运行模式，能够观察中间过程
 * run模式：程序基本没问题了，只想看结果
 * 断点：在某一行，行号左边，双击，可以出现蓝色点，称为断点。在断点上再双击，断点可以取消
 * 断点的作用：让程序开始执行后，到这一点暂停（程序能够执行到这个位置），可以观察中间过程
 * 			绿色背景，表示这一行暂停，并且还没执行
 * 如果debug模式没有任何断点，和run模式一样
 * F6：执行一行，不管这行有没有方法
 * F5：执行这行时，如果有方法，进入到方法；如果没有方法，功能和F6相同
 * F8：断点间跳转，如果后续没有断点，会一直执行到程序结束
 * run模式下，断点不起作用
 * @author yangzhen
 */
public class ObjectCompare {

	public static void main(String[] args) {
		/**
		 * 第二种
		 */
		Integer a = 1;
		Integer b = 1;
		//==比较的是数值
		System.out.println("a==b?"+(a==b));
		/**
		 * Integer是int类型包装类
		 * Integer类重写了Object类的equals方法，比较的是数值
		 */
		System.out.println("a.equals(b)?"+a.equals(b));
		
//		/**
//		 * 输出快捷键：sysout+alt+?
//		 * 多行注释：选中多行，ctrl+?
//		 */
//		Integer a =new Integer(1);
//		Integer b = new Integer(1);
//		/**
//		 * 通过new创建对象，内存中会分配存储空间，两个地址肯定不同
//		 * equals重写了Object的方法，比较的是数值
//		 */
//		System.out.println("a==b?"+(a==b));
//		System.out.println("a.equals(b)?"+a.equals(b));
		
//		Person a =new Person();
//		Person b =new Person();
//		/**
//		 * ==比较的是两个对象的地址
//		 * equals如果没有重写这个方法，也是比较的地址
//		 */
//		System.out.println("a==b?"+(a==b));
//		System.out.println("a.equals(b)?"+a.equals(b));
	}

}
