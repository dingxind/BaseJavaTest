package com.hp.day6.object;

public class TestRef {

	public void updatePerson(Person p){
		p.age = 18;
	}
	public static void main(String[] args) {
		//创建对象时：new + 类名（）
		Person p = new Person();
		TestRef test = new TestRef();
		test.updatePerson(p);
		System.out.println(p.age);
	}

}
