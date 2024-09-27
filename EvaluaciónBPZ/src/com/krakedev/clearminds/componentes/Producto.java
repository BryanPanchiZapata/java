package com.krakedev.clearminds.componentes;

public class Producto {
	private String nombre;
	private double precio;
	private String codigo;

	// Constructor
	public Producto(String nombre, double precio, String codigo) {
		super();
		this.nombre = nombre;
		this.precio = precio;
		this.codigo = codigo;
	}

	// Método incrementarPrecio
	public void incrementoPrecio(double porcentaje) {
		this.precio = precio * (1 + (porcentaje / 100));
	}

	// Método disminuirPrecio
	public void disminuirPrecio(double descuento) {
		double precioDescuento = descuento / 100;
		double porcentajeDesceunto = precioDescuento * precio;
		this.precio = precio - porcentajeDesceunto;
	}

	// Getters and Setter
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
