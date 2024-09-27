package com.clearminds.componentes;

public class Producto {
	private String nombre;
	private double precio;
	private String codigo;

	// método incrementarPrecio
	public void incrementarPrecio(int porcentaje) {
		double incrmentoPorcentaje = porcentaje / 100.0;
		this.precio = precio * (1 + incrmentoPorcentaje);
	}

	// Método disminuirPrecio
	public void disminuirPrecio(double descuento) {
		this.precio = precio - descuento;
	}

	// Getter and Setters
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

	// constructor
	public Producto(String nombre, double precio, String codigo) {
		super();
		this.nombre = nombre;
		this.precio = precio;
		this.codigo = codigo;
	}

}
