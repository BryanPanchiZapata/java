package com.cmc.repaso.test;

import com.cmc.repaso.entidades.Estudiante;

public class testEstudiante {

	public static void main(String[] args) {
		Estudiante per = new Estudiante("Marcos");

		// Modificar nota llamando al metodo calificar
		per.calificar(10);
		// Mostrar Valores de nombre
		System.out.println("Nombre: " + per.nombre);
		// mostrar nota
		System.out.println("Nota: " + per.nota);

	}

}
