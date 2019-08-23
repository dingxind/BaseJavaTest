package com.hp.day9.finaltest;

public class Dog extends Animal{
//	public void getInfo(){
//		
//	}
	public void getNum(final int i){
//		i = 10;
		System.out.println("i的值是:"+i);
	}
	
	public static void main(String [] args){
		Dog dog = new Dog();
		dog.getNum(5);
		dog.getNum(12);
	}
}
