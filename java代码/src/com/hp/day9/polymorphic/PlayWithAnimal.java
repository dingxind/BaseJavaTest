package com.hp.day9.polymorphic;

public class PlayWithAnimal {
	/**
	 * play方法重载
	 * 缺点：如果Animal类有很多子类，需要重载很多个方法
	 * @param dog
	 */
//	public void play(Dog dog){
//		dog.shout();
//	}
//	
//	public void play(Cat cat){
//		cat.shout();
//	}
	
	public void play(Animal animal){
		animal.shout();
	}
	public static void main(String[] args) {
		PlayWithAnimal pwa = new PlayWithAnimal();
		Animal dog = new Dog();
		pwa.play(dog);
		
		Animal cat = new Cat();
		pwa.play(cat);
	}

}
