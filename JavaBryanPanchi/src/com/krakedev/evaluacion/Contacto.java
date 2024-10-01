package com.krakedev.evaluacion;

import java.util.ArrayList;

public class Contacto {
	private String cedula;
	private String nombre;
	private String apellido;
	private Direccion direccion;
	private ArrayList<Telefono> telefonos = new ArrayList<>();

	// Constructor
	public Contacto(String cedula, String nombre, String apellido) {
		this.cedula = cedula;
		this.nombre = nombre;
		this.apellido = apellido;
	}

	// Método agregar telefono
	public void agregarTelefono(Telefono telefono) {
		telefonos.add(telefono);
	}

	// Método mostrarTelefonos
	public void mostrarTelefonos() {
		Telefono telf = null;
		System.out.println("Teléfonos con estado C:");
		for (int i = 0; i < telefonos.size(); i++) {
			telf = telefonos.get(i);
			if (telf.getEstado().equals("C")) {
				System.out.println("Número: " + telf.getNumero() + " " + "Tipo: " + telf.getTipo());
			}
		}

	}

	// Método recuperarIncorrectos
	public ArrayList<Telefono> recuperarIncorrectos() {
		ArrayList<Telefono> telefonosIncorrectos = new ArrayList<>();
		Telefono telfI = null;
		for (int i = 0; i < telefonos.size(); i++) {
			telfI = telefonos.get(i);
			if (telfI.getEstado().equals("E")) {
				telefonosIncorrectos.add(telfI);
			}
		}
		return telefonosIncorrectos;
	}

	// Método imprimir testContacto1

	public void imprimir() {
		System.out.println("Informacion del contacto:");
		System.out.println("Cédula: " + cedula + "\nNombre: " + nombre + "\nApellido: " + apellido + "\nDireccion: "
				+ "\n" + " Calle Principal: " + direccion.getCallePrincipal() + "\n" + " Calle Secundaria: "
				+ direccion.getCalleSecundaria());

	}

	// Método imprimir testContacto2
	public void imprimir1() {
		if (direccion != null) {
			System.out.println("***" + nombre + " " + apellido + "***" + "\nDireccion: " + direccion.getCallePrincipal()
					+ " " + direccion.getCalleSecundaria());
		} else {
			System.out.println("***" + nombre + " " + apellido + "***" + "\n No tiene asociada una direccion");
		}
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
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

	public Direccion getDireccion() {
		return direccion;
	}

	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}

	public ArrayList<Telefono> getTelefono() {
		return telefonos;
	}

	public void setTelefono(ArrayList<Telefono> telefonos) {
		this.telefonos = telefonos;
	}

}
