package com.cmc.repaso.entidades;

public class Producto {
	private String nombre;
	private double precio;

	// Getters and setters

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecio() {
		return precio;
	}

	// constructor
	public Producto(String nombre, double precio) {
		this.nombre = nombre;
		this.precio = precio;
	}

	// metodos
	public void setPrecio(double precio) {
		if (precio >= 0) {
		} else {
			double var = precio * -1;
			this.precio = var;
		}
	}

	public double calcularPrecioPromo(double descuento) {
		double desc = descuento / 100;
		double valorDesc = desc * precio;
		double valorTotal = precio - valorDesc;

		System.out.println("Precio: " + valorTotal);
		return valorTotal;
	}
}
