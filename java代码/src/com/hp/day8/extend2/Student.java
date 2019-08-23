package com.hp.day8.extend2;

import java.util.Date;

/**
 * 继承：使用extends关键字可以把父类的成员变量和方法继承过来
 * 
 * 构造方法
 * 1.创建子类对象时，要先调用父类的构造方法，再调用子类的构造方法
 * 2.在本类的构造方法中调用重载的构造方法时，要第一行，优先安排加载，其他成员变量可能会依赖他
 * 3.调用父类的构造方法也要放在第一行，因为子类成员变量的初始化也可能依赖父类的成员变量
 * @author HP
 */
public class Student extends Person {
	private String school;

	public Student() {

	}

	public Student(String name, int age, Date birthday, String school) {
		super(name, age, birthday);
		this.school = school;
	}

	public String getInfo2() {
		// 可以通过super关键字访问父类的方法（有访问权限的方法）
		// getInfo()相当于this.getInfo()，都是从父类继承来的，并且有访问权限
		return super.getInfo() + " school:" + school;
	}

	public String getSchool() {
		return school;
	}

	public void setSchool(String school) {
		this.school = school;
	}

	/**
	 * run模式和debug模式： run：程序基本没问题，只想看结果 debug：开发阶段一般都用debug,可以观察到中间过程
	 * 断点：行标左侧，鼠标双击。打到关注的位置 j2se:从main方法开始顺序执行，执行到第一个断点暂停 如果没有断点，会一直执行到程序结束
	 * F6，可以一行行的运行 绿色背景表示这一行还没有运行 可以把鼠标放到运行完的代码的变量上，观察中间过程信息
	 * 如果观察完中间过程，后续代码不再关注，可以按F8 多个断点之间跳转F8
	 * 如果遇到方法调用，想进入方法，按F5
	 */
	public static void main(String[] args) {
//		Person p = new Person();
		Student s = new Student("zhang",18,new Date(),"枣庄学院");
		System.out.println(s);
	}
}
