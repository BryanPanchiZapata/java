package com.krakedev.entidades;

import java.util.ArrayList;

public class Estudiante {
	private String nombre;
	private String apellido;
	private String cedula;
	private ArrayList<Nota> notas = new ArrayList<>();

	public Estudiante(String cedula, String nombre, String apellido) {
		this.cedula = cedula;
		this.nombre = nombre;
		this.apellido = apellido;
	}

	// Método agregarNota
	public void agregarNota(Nota nota) {
		Nota notaExistente;
		if (nota.getCalificacion() >= 0 && nota.getCalificacion() <= 10) {
			for (int i = 0; i < notas.size(); i++) {
				notaExistente = notas.get(i);
				if (nota.getMateria().getCodigo().equals(notaExistente.getMateria().getCodigo())) {
					return;
				}
			}
			notas.add(nota);
		}

	}

	// Método modificarNota
	public void modificarNota(String codigo, double notaNueva) {
		Nota codigoEncontrado;
		if (notaNueva >= 0 && notaNueva <= 10) {
			for (int i = 0; i < notas.size(); i++) {
				codigoEncontrado = notas.get(i);
				// Verificar si el codigo ingresado en el prametro coincide con el array
				if (codigo.equals(codigoEncontrado.getMateria().getCodigo())) {
					codigoEncontrado.setCalificacion(notaNueva); // settea la nota
					return;
				}
			}
			System.out.println("Código no encontrado");
		}
	}

	// Método calcularPromedioEstudianteNotas
	public double calcularPromedioNotasEstudiante() {
		double valorSuma = 0;
		for (int i = 0; i < notas.size(); i++) {
			valorSuma += notas.get(i).getCalificacion();
		}
		if (notas.size() > 0) {
			System.out.println("Nota Final:");
			return valorSuma / notas.size();
		} else {
			return 0;
		}

	}

	public void mostrar() {
		for (int i = 0; i < notas.size(); i++) {
			Nota estudianteNota = notas.get(i);
			if (estudianteNota != null) {
				System.out.println("Nombre: " + nombre + " Apellido: " + apellido + " Cédula: " + cedula
						+ " Calificación: " + estudianteNota.getCalificacion() + " Materia: "
						+ estudianteNota.getMateria().getNombre() + " Código: "
						+ estudianteNota.getMateria().getCodigo());
			} else {
				System.out.println("Nombre: " + nombre + " Apellido: " + apellido + "Cédula: " + cedula
						+ "Datos no ingresados Null");
			}
		}
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

	public ArrayList<Nota> getNotas() {
		return notas;
	}

	public void setNotas(ArrayList<Nota> notas) {
		this.notas = notas;
	}

}
