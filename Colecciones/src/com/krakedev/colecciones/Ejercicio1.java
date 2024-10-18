package com.krakedev.colecciones;

import java.util.ArrayList;

public class Ejercicio1 {

	public static void main(String[] args) {
		String valorRecuperado;
		ArrayList<String> cadenas;
		cadenas = new ArrayList<String>();

		System.out.println(cadenas.size());

		cadenas.add("Pikachu"); // Posiscion 0
		cadenas.add("Charizard"); // Posicion 0

		System.out.println(cadenas.size());

		valorRecuperado = cadenas.get(0); // Recupero el elemento de la posicion 0

		System.out.println(valorRecuperado);

		String cadena;
		for (int i = 0; i < cadenas.size(); i++) {
			cadena = cadenas.get(i);
			System.out.println("Pokemon: " + cadena);
		}

	}

}
