package com.entidades;

import java.util.ArrayList;

import com.krakedev.servicios.Juego;

public class Jugadores {
	private ArrayList<String> jugadores = new ArrayList<>();

	public void jugar() {
		ArrayList<String> jugadores = new ArrayList<>();
		jugadores.add("Jugador 1");
		jugadores.add("Jugador 2");
		jugadores.add("Jugador 3");
		Juego juego = new Juego(jugadores);
		juego.entregarCartas(5);
		for (int i = 0; i < jugadores.size(); i++) {
			int total = juego.devolverTotal(i);
			System.out.println("Total de: " + jugadores.get(i) + " = " + total);
		}

	}

	public ArrayList<String> getJugadores() {
		return jugadores;
	}

	public void setJugadores(ArrayList<String> jugadores) {
		this.jugadores = jugadores;
	}

}
