package com.hp.day13.collection;

import java.util.ArrayList;
import java.util.List;

/**
 * 1.单个类功能单一。实体类，po,pojo,javabean，一般主要写成员变量，get,set方法，构造方法，toString，getInfo方法
 * 2.针对功能单一的类，做的操作，称为**Service，包括各种的增删改查
 * @author HP
 *
 */
public class EmployeeService {

	public void addEmployee(Employee employee){
		
	}
	/**
	 * 排序
	 * @param employeeList
	 */
	public void sort(List<Employee> employeeList){
		if (null == employeeList || employeeList.size() < 1) {
			System.out.println("集合为null,或集为空~");
			return;
		}
		for (int i = 0; i < employeeList.size() - 1; i++) {
			for (int j = 0; j < employeeList.size()-1-i; j++) {
				//如果1交换
				if (employeeList.get(j).compareToEmployee(employeeList.get(j+1)) > 0) {
					Employee temp = employeeList.get(j);
					//set方法，可以根据序号设置对应的值，和数组不同
					employeeList.set(j, employeeList.get(j+1)) ;
					employeeList.set(j+1, temp) ;
				}
			}
		}
	}
	
	public static void main(String [] args){
		//创建对象并存入List排序
		Employee emp1 = new Employee("yang", 20, 3000);
		Employee emp2 = new Employee("wang", 22, 3000);
		Employee emp3 = new Employee("zhao", 23, 5000);
		List<Employee> employeeList = new ArrayList<Employee>();
		employeeList.add(emp1);
		employeeList.add(emp2);
		employeeList.add(emp3);
		
		EmployeeService es = new EmployeeService();
		es.sort(employeeList);
	}

}
