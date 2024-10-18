package com.autos.composicion;

public class Persona {
	private String nombre;
	private String apellido;
	private int presupuesto;
	private Auto auto;

	public Persona(String nombre, String apellido, int presupuesto) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.presupuesto = presupuesto;
	}

	public Persona() {
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

	public int getPresupuesto() {
		return presupuesto;
	}

	public void setPresupuesto(int presupuesto) {
		this.presupuesto = presupuesto;
	}

	public Auto getAuto() {
		return auto;
	}

	public void setAuto(Auto auto) {
		this.auto = auto;
	}

	public void imprimir() {

		if (auto != null) {
			System.out.println("Nombre Persona: " + nombre + "\n" + "Apellido Persona: " + apellido + "\n"
					+ "Presupuesto: " + presupuesto + "\n" + "Caracteristicas del auto: " + "\n" + auto.getNombre()
					+ "\n" + auto.getModelo() + "\n" + auto.getMarca() + "\n" + auto.getPrecio());
		} else {
			System.out.println("Nombre Persona: " + nombre + " " + "Apellido Persona: " + apellido + " "
					+ "Presupuesto: " + presupuesto + " " + "Auto valores null");
		}

	}

}
