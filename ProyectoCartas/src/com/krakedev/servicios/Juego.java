package com.krakedev.servicios;

import java.util.ArrayList;

import com.entidades.Carta;
import com.entidades.Naipe;

public class Juego {
	private Naipe naipe;
	private ArrayList<Carta> naipeBarajado;
	private ArrayList<ArrayList<Carta>> cartasJugadores;

	public Juego(ArrayList<String> ids) {
		cartasJugadores = new ArrayList<>();
		naipe = new Naipe();
		naipeBarajado = naipe.barajar();

		for (int i = 0; i < ids.size(); i++) {
			ArrayList<Carta> listCartas = new ArrayList<>();
			cartasJugadores.add(listCartas);
		}
	}

	public void entregarCartas(int cartasPorJugador) {
		int numJugadores = cartasJugadores.size();
		int numeroCartas = cartasPorJugador * numJugadores;
		int id = 0;
		for (int i = 0; i < numeroCartas; i++) {

			Carta carta = naipeBarajado.get(i);
			;
			cartasJugadores.get(id).add(carta);
			id = (id + 1) % numJugadores;
		}
	}

	public int devolverTotal(int idJugador) {
		ArrayList<Carta> cartasJugador = cartasJugadores.get(idJugador);
		int total = 0;
		for (int i = 0; i < cartasJugador.size(); i++) {
			total += cartasJugador.get(i).getNumero().getValor();
		}
		return total;
	}

	public String determinarGanador() {
		int idGanador = 0;
		int sumaGanador = devolverTotal(idGanador);

		for (int i = 1; i < cartasJugadores.size(); i++) {
			int sumaJugador = devolverTotal(i);
			if (sumaJugador >= sumaGanador) {
				idGanador = i;
				sumaGanador = sumaJugador;
			}
		}

		return idGanador + 1 + "";
	}

	public ArrayList<ArrayList<Carta>> getCartasJugadores() {
		return cartasJugadores;
	}

}