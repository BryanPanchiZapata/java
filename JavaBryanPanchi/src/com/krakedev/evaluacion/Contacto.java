package com.krakedev.evaluacion;

public class Contacto {
	private String cedula;
	private String nombre;
	private String apellido;
	private Direccion direccion;

	// Constructor
	public Contacto(String cedula, String nombre, String apellido) {
		this.cedula = cedula;
		this.nombre = nombre;
		this.apellido = apellido;
	}

	// Método imprimir
	public void imprimir() {
		this.direccion.setCallePrincipal("Av. Siempre viva");
		this.direccion.setCalleSecundaria("Calle 4");
		System.out.println("Cédula: " + cedula + "\nNombre: " + nombre + "\nApellido: " + apellido + "\nDireccion: "
				+ "\n" + " Calle Principal: " + direccion.getCallePrincipal() + "\n" + " Calle Secundaria: "
				+ direccion.getCalleSecundaria());

		this.setNombre("Ana");
		this.setApellido("Gómez");
		this.setCedula("09876543210");
		this.direccion.setCallePrincipal("Cdl del ejercito");
		this.direccion.setCalleSecundaria("Pasaje 2B");
		System.out.println("\nInformación del Contacto (Actualizada)" + "\n" + "Cédula: " + cedula + "\nNombre: "
				+ nombre + "\nApellido: " + apellido + "\nDireccion: " + "\n" + " Calle Principal: "
				+ direccion.getCallePrincipal() + "\n" + " Calle Secundaria: " + direccion.getCalleSecundaria());
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

}
