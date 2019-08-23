package com.hp.day16.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Person {
	/**
	 * 如果我们没有初始化（声明的时候），系统会初始化
	 * 1.数值类型：0
	 * 2.布尔类型：false
	 * 3.char类型：空格
	 * 4.其他引用类型：null
	 */
	private String name;
	private Integer age;

	public Person() {
	}

	public Person(String name, Integer age) {
		this.name = name;
		this.age = age;
	}

	public String getInfo() {
		return "姓名为："+this.name + "，年龄为：" + this.age;
	}
	
	/**
	 * j2se程序，如果一直使用throws，抛到main方法就到头了
	 */
	public static void main(String [] args) throws Exception{
		//Class.forName得到的是类信息
		Class<?> clazz = Class.forName("com.hp.day16.reflection.Person");
		//任何数据类型和字符串拼接，都会转换成String再拼接
		System.out.println("获取的类名是"+clazz.getName());
		System.out.println("获取的简单类名是"+clazz.getSimpleName());
		
		//clazz.newInstance()--》调用了类的无参构造方法
		Person p = (Person) clazz.newInstance();
		System.out.println("对象的信息是："+p.getInfo());
		
		/**
		 * 可变参数：用几个参数就写几个参数，参数类型匹配即可
		 * 有参构造方法需要知道有几个参数，每个参数的数据类型
		 * Peson p2 = new Person("张三",24);
		 */
		Constructor cons = clazz.getConstructor(String.class,Integer.class);
		Person p2 = (Person) cons.newInstance("张三",24);
		System.out.println("有参构造方法的信息："+p2.getInfo());
		
		/**
		 * 可以通过getDeclaredFields获取类的所有的成员变量
		 * 获取Field后可以通过getType获取数据类型，通过getName获取成员变量名
		 */
		Field[] fieldArray = clazz.getDeclaredFields();
		for(int i=0;i<fieldArray.length;i++){
			System.out.println(fieldArray[i].getType()+"@@"+fieldArray[i].getName());
		}
		
		/**
		 * 获取的name成员变量，除了成员变量名外，还有附加信息，例如成员变量数据类型
		 * 下面三行相当于p.setName("wangwu")
		 */
		Field nameField = clazz.getDeclaredField("name");
		//因为成员变量是私有的
		nameField.setAccessible(true);
		nameField.set(p, "wangwu");
		System.out.println("通过设置成员变量的值后："+p.getInfo());
		
		
		/**
		 * 使用反射调用方法
		 * 调用无参方法时，第一个参数是参数名，第二个参数置null
		 * 使用method对象的invoke方法调用，第一个参数是对象，第二个参数置null
		 */
		Method getNameMethod = clazz.getDeclaredMethod("getName", null);
		getNameMethod.invoke(p2, null);
		
		Method setNameMethod = clazz.getDeclaredMethod("setName", String.class);
		setNameMethod.invoke(p, "lisi");
		System.out.println("反射调用有参方法的值是:"+p.getName());
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

}
