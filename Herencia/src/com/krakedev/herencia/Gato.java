package com.krakedev.herencia;

public class Gato extends Animal {
	@Override
	public void dormir() {
		System.out.println("El gato esta durmiendo");
	}
	
	public void maullar() {
		System.out.println("Estoy maullando");
	}
	
	public void maullar(String adjetivo) {
		System.out.println("Gato Maullando " + adjetivo);
	}
}
