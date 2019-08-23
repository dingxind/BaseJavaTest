package com.hp.day9.finaltest;


public class PlayWithAnimal {

	public void play(final Animal animal) {
		animal.setKind("cat");
//		animal = new Animal();
		animal.shout();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PlayWithAnimal pwa = new PlayWithAnimal();
		Animal animal = new Animal();
		pwa.play(animal);
	}

}
