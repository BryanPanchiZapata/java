package com.krakedev;

public class Auto {
	private String marca;
	private int anio;
	private double precio;

	// Constructor
	public Auto(String marca, int anio, double precio) {
		this.marca = marca;
		this.anio = anio;
		this.precio = precio;
	}
	
	public Auto() {

	}

	// Get obtener el valor
	public String getMarca() {
		return marca;
	}

	// Set modificar el valor
	public void setMarca(String marca) {
		this.marca = marca;
	}

	// Get obtener el valor
	public int getAnio() {
		return anio;
	}

	// Set modificar el valor
	public void setAnio(int anio) {
		this.anio = anio;
	}

	// Get obtener el valor
	public double getPrecio() {
		return precio;
	}

	// Set modificar el valor
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	// metodo estilo imprimir
	
	public void imprimir() {
		System.out.println("*********");
	}
	
}
