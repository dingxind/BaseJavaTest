package com.hp.day13.collection;

import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetTest {

	public static void main(String[] args) {
		Person p1 = new Person("zhang", 20, new Date());
		Person p2 = new Person("wang", 21, new Date());
		Person p3 = new Person("zhao", 22, new Date());
		
		/**
		 * 如果使用是HashSet，debug调试在map里的table里查看
		 */
		Set<Person> personSet = new HashSet<Person>();
		personSet.add(p1);
		personSet.add(p2);
		personSet.add(p3);
		
		//如何证明存的唯一的？同一对象不能存两次
		//在集合中已经存了一份，不能再存
		personSet.add(p1);
		p2.setAge(16);
		personSet.add(p2);
		
		/**
		 * set的移除，只有remove(Object)
		 */
		personSet.remove(p2);
		
		boolean result = personSet.contains(p2);
		
		/**
		 * foreach指向第0个元素
		 */
		for(Person p:personSet){
			System.out.println(p.getInfo());
		}
		/**
		 * 迭代器指向第0个元素前
		 */
		Iterator<Person> it = personSet.iterator();
		while(it.hasNext()){
			Person p = it.next();
			System.out.println(p.getInfo());
		}
	}

}
