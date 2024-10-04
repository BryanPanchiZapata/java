package com.cmc.evaluacion.entidades;

import java.util.ArrayList;

public class Clientes {
	private String cedula;
	private String nombre;
	private String apellido;
	private ArrayList<Prestamo> prestamos;

	public Clientes(String cedula, String nombre, String apellido) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.cedula = cedula;
		prestamos = new ArrayList<Prestamo>();
	}

	public void agregarPrestamo(Prestamo nuevoPrestamo) {
		this.prestamos.add(nuevoPrestamo); 
	}

	public void mostrarCliente() {
		System.out
				.println("[" + "cédula: " + cedula + ", " + "nombre: " + nombre + ", " + "apellido: " + apellido + "]");
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public ArrayList<Prestamo> getPrestamos() {
		return prestamos;
	}

	public void setPrestamos(ArrayList<Prestamo> prestamos) {
		this.prestamos = prestamos;
	}

}
