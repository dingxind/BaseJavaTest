package com.hp.day12.common2;

/**
 * 对于引用数据类型，也是值传递，无法改变
 * 如果想改变对象值，可以把对象作为参数传入，再做修改
 * 引用数据类型作为参数传递，结果可以直接作用于对象上：
 * 见updatePerson方法和StringSort类的arraySort方法
 * 
 * 数组排序：
 * 数据类型可能是基本数据类型，引用数据类型
 * swap(数据类型 变量1， 数据类型 变量2)
 * 交换只能在方法中交换，不能作用于结果
 * 只能传数组，对于引用数据类型内部数据，做的修改，可以作用于结果
 * 对于外部，传了两个对象，相交换，不能作用于结果
 * @author HP
 *
 */
public class SwapObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1 = new Person("zhang", 18);
		Person p2 = new Person("wang", 20);
		SwapObject so = new SwapObject();
		so.swap(p1, p2);
		so.print(p1, p2, "方法调用后输出");
		
		so.updatePerson(p1);
	}

	public void updatePerson(Person p1){
		p1.setName("li");
	}
	/**
	 * 交换两个引用数据类型（除了String类型）
	 * 
	 * @param p1
	 * @param p2
	 */
	public void swap(Person p1, Person p2) {
		Person temp = p1;
		p1 = p2;
		p2 = temp;
		print(p1, p2, "在方法中输出");
	}

	/**
	 * 根据info信息打印
	 * @param p1
	 * @param p2
	 * @param info：在方法中输出；方法调用后输出
	 */
	public void print(Person p1, Person p2, String info) {
		System.out.println(info + "第一个的值是:" + p1.getInfo());
		System.out.println(info + "第二个的值是:" + p2.getInfo());
	}
}
