package com.hp.day13.collection;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class ListTest {

	public static void main(String[] args) {
		Person p1 = new Person("zhang", 20, new Date());
		Person p2 = new Person("wang", 21, new Date());
		Person p3 = new Person("zhao", 22, new Date());

		/**
		 * 父接口 对象名 = new 接口的实现类，也称为向上转型 集合框架变量名称：存储的数据类型+集合框架名称
		 * 泛型：<数据类型>，集合中的元素必须是指定的数据类型，可以不用再做类型检查
		 */
		List<Person> personList = new ArrayList<Person>();
		personList.add(p1);
		personList.add(p2);
		personList.add(p3);
		// 如果能存进去，证明可重复
		personList.add(p1);
//		personList.add("123");

		//第二个集合
		List<Person> personList2 = new ArrayList<Person>();
		personList2.add(p2);
		personList2.add(p3);
		personList.addAll(personList2);
		
		/**
		 * get方法可以获得某一对象，序号从0开始
		 * 数组，下标也是从0开始
		 * 超过了集合的大小，也会报越界异常IndexOutOfBoundsException
		 * 数组越界：ArrayIndexOutOfBoundsException
		 */
		Person pTemp = (Person) personList.get(3);
//		Person pTemp2 = (Person) personList.get(6);
		
		/**
		 * remove(index)根据序号移除
		 * remove(Object)根据对象移除
		 */
		personList.remove(5);
		personList.remove(p2);
		
		boolean result = personList.contains(p1);
		
		
		/**
		 * List的遍历
		 * 条件表达式是布尔类型，可以是多个
		 * personList不能是null
		 * List中序号从0开始
		 * 把判断条件加到条件表达式：循环n次，多判断n次
		 * 如果把判断条件提出来，n+1
		 */
		System.out.println("第一种遍历");
		if(null!= personList){
			Person p;
			for(int i=0;i<personList.size();i++){
				p = personList.get(i);
				System.out.println(p.getInfo());
			}
		}
		System.out.println("第二种遍历");
		/**
		 * foreach遍历最好加泛型，否则认为List中都是Object类型
		 */
		for(Person p :personList){
			System.out.println(p.getInfo());
		}
		
		System.out.println("第三种遍历");
		/**
		 * 迭代器：指向集合中第0个元素前
		 * 迭代器泛型：指向的每一个对象都是Person
		 */
		Iterator<Person> it = personList.iterator();
		//it.hasNext()表示这个集合中有下一个元素
		//it.next()指向下一个元素
		//循环：for循环一般用于次数确定的情况，while循环用于次数不确定的情况
		while(it.hasNext()){
			Person p = it.next();
			System.out.println(p.getInfo());
		}
		
//		User user = new User();
//		User user1 = findUserById(1);
	}

}
