package com.krakedev.composicion;

public class Producto {
	private String nombe;
	private double precio;

//Constructor
	public Producto(String nombe, double precio) {
		super();
		this.nombe = nombe;
		this.precio = precio;
	}

	// Getters and Setters
	public String getNombe() {
		return nombe;
	}

	public void setNombe(String nombe) {
		this.nombe = nombe;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

}
