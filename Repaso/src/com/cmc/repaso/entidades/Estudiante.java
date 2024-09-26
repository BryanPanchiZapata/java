package com.cmc.repaso.entidades;

public class Estudiante {
	public String nombre;
	public double nota;
	public String resultado;

	// Constructor
	public Estudiante(String nombre) {
		this.nombre = nombre;
	}

	// Método calificar
	public void calificar(double nota) {
		this.nota = nota;
		if (nota < 8) {
			System.out.println(this.resultado = "Resulatdo: F");
		} else if (nota >= 8) {
			System.out.println(this.resultado = "Resulatdo: A");
		}
	}

}
