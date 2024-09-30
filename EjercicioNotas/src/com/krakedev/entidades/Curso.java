package com.krakedev.entidades;

import java.util.ArrayList;

public class Curso {
	private ArrayList<Estudiante> estudiantes = new ArrayList<>();

	// buscarEstudiantePorCedula
	public Estudiante buscarEstudiantePorCedula(Estudiante estudiante) {
		Estudiante elementoEncontrado;
		for (int i = 0; i < estudiantes.size(); i++) {
			elementoEncontrado = estudiantes.get(i);
			if (elementoEncontrado.getCedula().equals(estudiante.getCedula())) {
				System.out.println("Estudiante Encontrado: " + elementoEncontrado.getCedula());
			}
		}
		return null;
	}

	// Método matriculasEstudiantiles
	public void matricularEstudiante(Estudiante estudiante) {
		Estudiante estudianteEncontrado = buscarEstudiantePorCedula(estudiante);
		if (estudianteEncontrado != null) {
			System.out.println("Estudiante ya se encuentra Registrado");
		} else {
			estudiantes.add(estudiante);
		}
	}

	// Método calcularPromedioCurso
	public double calcularPromedioCurso() {
		double valorSuma = 0;
		for (int i = 0; i < estudiantes.size(); i++) {
			valorSuma += estudiantes.get(i).getNotas().get(i).getCalificacion();
		}
		System.out.println("Nota Total Curso:");
		return valorSuma;
	}

	// Método mostrar
	public void mostrar() {
		for (int i = 0; i < estudiantes.size(); i++) {
			Estudiante estudianteNota = estudiantes.get(i);
			if (estudianteNota != null) {
				System.out.println("Notas Curso: " + estudianteNota.getNotas().get(i).getCalificacion());
			}
		}
	}

	public ArrayList<Estudiante> getEstudiantes() {
		return estudiantes;
	}

	public void setEstudiantes(ArrayList<Estudiante> estudiantes) {
		this.estudiantes = estudiantes;
	}

}
