package com.hp.day10.abs;

public class TestInstrument {

	public static void main(String[] args) {
		Instrument wind = new Wind();
		wind.play();
		Instrument piano = new Piano();
		piano.play();
	}

}
