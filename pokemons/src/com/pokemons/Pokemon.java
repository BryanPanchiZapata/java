package com.pokemons;

public class Pokemon {
	private String nombre;
	private String tipo;
	private double poder;
	private Movimiento movimiento;

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

	public Movimiento getMovimiento() {
		return movimiento;
	}

	public void setMovimiento(Movimiento movimiento) {
		this.movimiento = movimiento;
	}

}
