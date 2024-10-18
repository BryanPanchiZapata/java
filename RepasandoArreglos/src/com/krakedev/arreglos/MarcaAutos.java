package com.krakedev.arreglos;

import java.util.ArrayList;

public class MarcaAutos {

	public static void main(String[] args) {
		ArrayList<String> auto = new ArrayList<>();

		auto.add("Maserati");
		auto.add("Audi");
		auto.add("Mazda");

		for (int i = 0; i < auto.size(); i++) {
			String nombreAuto = auto.get(i);
			System.out.println(nombreAuto);
		}

	}

}
