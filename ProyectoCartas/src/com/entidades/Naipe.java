package com.entidades;

import java.util.ArrayList;

public class Naipe {
	private ArrayList<Numero> numerosPosibles = new ArrayList<>();
	private ArrayList<Carta> cartas = new ArrayList<>();
	private Palos palos = new Palos();
	Random random = new Random();

	public Naipe() {
		numerosPosibles = new ArrayList<>();
		cartas = new ArrayList<>();
		CargarNaipe();
		agregarCarta(palos.getCorazonNegro());
		agregarCarta(palos.getCorazonRojo());
		agregarCarta(palos.getDiamante());
		agregarCarta(palos.getTrebol());
	}

	public void CargarNaipe() {
		numerosPosibles.add(new Numero("A", 11));
		numerosPosibles.add(new Numero("2", 2));
		numerosPosibles.add(new Numero("3", 3));
		numerosPosibles.add(new Numero("4", 4));
		numerosPosibles.add(new Numero("5", 5));
		numerosPosibles.add(new Numero("6", 6));
		numerosPosibles.add(new Numero("7", 7));
		numerosPosibles.add(new Numero("8", 8));
		numerosPosibles.add(new Numero("9", 9));
		numerosPosibles.add(new Numero("10", 10));
		numerosPosibles.add(new Numero("J", 10));
		numerosPosibles.add(new Numero("Q", 10));
		numerosPosibles.add(new Numero("K", 10));

	}

	public void agregarCarta(String palo) {
		Numero elemento = null;
		for (int i = 0; i < numerosPosibles.size(); i++) {
			elemento = numerosPosibles.get(i);
			cartas.add(new Carta(elemento, palo));
		}
	}

	public ArrayList<Carta> barajar() {
		ArrayList<Carta> auxiliar = new ArrayList<>();
		for (int i = 1; i <= 100; i++) {
			int valorRandom = Random.obtenerPosicion();
			if (cartas.get(valorRandom).getEstado().equals("N")) {
				auxiliar.add(cartas.get(valorRandom));
				cartas.get(valorRandom).setEstado("C");
			}
		}
		for (int i = 0; i < cartas.size(); i++) {
			if (cartas.get(i).getEstado().equals("N")) {
				auxiliar.add(cartas.get(i));
				cartas.get(i).setEstado("C");
			}
		}
		return auxiliar;

	}

}
