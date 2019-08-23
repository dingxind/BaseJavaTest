package com.hp.day8.extend;

public class Test {

	public static void main(String[] args) {
		Person p = new Person();
		Soldier s = new Soldier();
		Student stu = new Student();
		Officer o = new Officer();
		Graduate g = new Graduate();
		
		p.getInfo();
		s.train();
		stu.getSchool();
		o.work();
		g.getOffer();
	}

}
