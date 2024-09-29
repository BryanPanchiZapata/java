package com.clearminds.componentes;

public class Producto {
	private String nombre;
	private double precio;
	private String codigo;

	public Producto(String nombre, String codigo, double precio) {
		this.nombre = nombre;
		this.codigo = codigo;
		this.precio = precio;
	}

	public Producto(String nombre, double precio, String codigo) {
		this.nombre = nombre;
		this.codigo = codigo;
		this.precio = precio;
	}
	public Producto(String nombre, double precio) {
		this.nombre = nombre;
		this.precio = precio;
	}

	// método incrementarPrecio
	public void incrementarPrecio(int incremento) {
		double precioIncremento = incremento / 100.0;
		precio = precio * (1 + (precioIncremento));
	}

	// Método disminuirPrecio
	public void disminuirPrecio(double descuento) {
		precio = precio - descuento;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

}
