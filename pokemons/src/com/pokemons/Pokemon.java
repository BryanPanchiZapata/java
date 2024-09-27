package com.pokemons;

public class Pokemon {
	private String nombre;
	private String tipo;
	private double poder;

	// Constructor
	public Pokemon(String nombre, String tipo, double poder) {
		this.nombre = nombre;
		this.tipo = tipo;
		this.poder = poder;
	}

	public Pokemon() {

	}

	public Pokemon(String nombre) {
		this.nombre = nombre;
	}

	// Getters and Setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public double getPoder() {
		return poder;
	}

	public void setPoder(double poder) {
		this.poder = poder;
	}

}
