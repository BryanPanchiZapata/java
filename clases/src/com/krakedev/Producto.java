package com.krakedev;

public class Producto {
	private String nombre;
	private String descripcion;
	private double precio;
	private int stockActual;

	// Constructor
	public Producto(String nombre, String descripcion, double precio, int stockActual) {
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.precio = precio;
		this.stockActual = stockActual;
	}

	// Get obtener el valor
	public String getNombre() {
		return nombre;
	}

	// Set modificar
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	// Get obtener
	public String getDescripcion() {
		return descripcion;
	}

	// Set modificar
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	// Get obtener
	public double getPrecio() {
		return precio;
	}

	// Set modificar
	public void setPrecio(double precio) {
		this.precio = precio;
	}

	// Get obtener
	public int getStockActual() {
		return stockActual;
	}

	// Set modificar
	public void setStockActual(int stockActual) {
		this.stockActual = stockActual;
	}
}
