package com.hp.day13.collection;

import java.util.ArrayList;
import java.util.List;

/**
 * 定义一个Employee类,属性:name:String,age:int,salary:double
 * 把若干Employee对象放在List中,排序并遍历输出,排序规则:salary高的在前面,salary相同时age大的在前面,
 * age也相同时按照name升序排列 把若干Employee对象放在Set中并遍历,要求没有重复元素
 * 
 * @author yangzhen
 * 类的顺序？
 */
public class Employee {
	private String name;
	private int age;
	private double salary;

	// 构造方法？
	public Employee() {

	}

	//构造方法的重载，形参和成员变量作用域
	public Employee(String name, int age, double salary) {
		this.name = name;
		this.age = age;
		this.salary = salary;
	}

	/**
	 * 用于比较两个对象大小
	 * salary高的在前面,salary相同时age大的在前面,age也相同时按照name升序排列
	 * salary大 返回-1---表示不用交换
	 * salary相同age大 返回-1 表示不用交换
	 * 		age相同，name字符比较字符小的返回-1 不用交换 大返回1
	 * 		age小的返回1，交换
	 * salary小，返回1
	 * @param emp 被比较的对象
	 * @return >0表示比较对象大 =0表示相等 <0表示被比较对象大（参数）
	 */
	public int compareToEmployee(Employee emp){
		if(null == emp)
			return 1;
		//当前对象和参数做比较，当前对象是this
		if(this.salary>emp.getSalary())
			return -1;
		else if(this.salary == emp.getSalary()){
			if(this.age >emp.getAge())
				return -1;
			else if(this.age == emp.getAge()){
				//再判断name
				if(this.name.compareTo(emp.getName())>0){
					return 1;
				}
				else if(this.name.compareTo(emp.getName())==0){
					return 0;
				}
				else
					return -1;
			}
			else{
				return 1;
			}
		}
		else
			return 1;
	}
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

}
