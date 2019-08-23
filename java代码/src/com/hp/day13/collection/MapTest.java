package com.hp.day13.collection;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 * 1.使用Map的好处：如果知道一个关键字，直接取出对象
 * 2.Set好处：里面不会有重复元素
 * 3.List好处：考虑有序，根据某一序号取出元素
 * @author HP
 *
 */
public class MapTest {

	public static void main(String[] args) {
		Person p1 = new Person("zhang", 20, new Date());
		Person p2 = new Person("wang", 21, new Date());
		Person p3 = new Person("zhao", 22, new Date());

		/**
		 * 当前案例由于没有唯一标识，只有3个元素，姓名不重复，可以把姓名作为key value值可以是对象 一般情况下，使用对象的唯一标识作为key
		 * 唯一标识？ 学生：学校学号，本校 普通公民：身份证号 系统：分配唯一识别号，+1
		 */
		Map<String, Person> personMap = new HashMap<String, Person>();
		personMap.put(p1.getName(), p1);
		personMap.put(p2.getName(), p2);
		personMap.put(p3.getName(), p3);

		Person p4 = new Person("zhao", 16, new Date());
		/**
		 * key相同，value不同，后面添加的会覆盖前面的
		 */
		personMap.put(p4.getName(), p4);

		/**
		 * 可以通过get(Key)获得Key对应的value
		 */
		Person pTemp = (Person) personMap.get("zhao");
		// containsKey判断是否包含指定的key（Key是唯一的）
		boolean result = personMap.containsKey("zhao");

		personMap.remove("zhao");

		System.out.println("personMap的大小是：" + personMap.size());

		List<Person> personList1 = new ArrayList<Person>();
		personList1.add(p1);
		personList1.add(p2);
		List<Person> personList2 = new ArrayList<Person>();
		personList2.add(p2);
		personList2.add(p3);
		Map<String, List<Person>> personListMap = new HashMap<String, List<Person>>();
		personListMap.put("list1", personList1);
		personListMap.put("list2", personList2);

		// 获取key的集合，存入set中
		Set<String> keySet = personMap.keySet();
		for (String key : keySet) {
			Person p = personMap.get(key);
			System.out.println(p.getInfo());
		}
		
		Iterator<Entry<String,Person>> it = personMap.entrySet().iterator();
		while(it.hasNext()){
			Entry<String,Person> entry = it.next();
			System.out.println(entry.getValue().getInfo());
		}
	}

}
