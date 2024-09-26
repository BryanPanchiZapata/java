package com.cmc.repaso.entidades;

public class Item {
	private String nombre;
	private double productosActuales;
	private double productosDevueltos;
	private double productosVendidos;

	public double getProductosActuales() {
		return productosActuales;
	}

	public void setProductosActuales(double productosActuales) {
		this.productosActuales = productosActuales;
	}

	public double getProductosDevueltos() {
		return productosDevueltos;
	}

	public void setProductosDevueltos(double productosDevueltos) {
		this.productosDevueltos = productosDevueltos;
	}

	public double getProductosVendidos() {
		return productosVendidos;
	}

	public void setProductosVendidos(double productosVendidos) {
		this.productosVendidos = productosVendidos;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	// Método imprimir
	public void imprimir() {
		System.out.println("Productos Actuales: " + this.productosActuales);
		System.out.println("Productos Devueltos: " + this.productosDevueltos);
		System.out.println("Productos Vendidos: " + this.productosVendidos);
	}

	// Método vender
	public void vender(double productosVendidos) {
		this.productosActuales = productosVendidos - productosActuales;
		this.productosVendidos = this.productosVendidos + productosVendidos;
	}
	
	//Método devolver
	public void devolver(double productosVendidos) {
		this.productosActuales = productosActuales + productosVendidos;
		this.productosVendidos = this.productosVendidos - productosVendidos;
		this.productosDevueltos = productosDevueltos + productosVendidos;
	}

}
