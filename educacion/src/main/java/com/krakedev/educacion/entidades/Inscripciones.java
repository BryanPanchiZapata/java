package com.krakedev.educacion.entidades;

import java.math.BigDecimal;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class Inscripciones {
	private Estudiantes cedula_estudiante;
	private Cursos id_cursos;
	private BigDecimal costo;
	@JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
	private Date fecha_inscripcion;

	public Inscripciones(Estudiantes cedula_estudiante, Cursos id_cursos, BigDecimal costo, Date fecha_inscripcion) {
		super();
		this.cedula_estudiante = cedula_estudiante;
		this.id_cursos = id_cursos;
		this.costo = costo;
		this.fecha_inscripcion = fecha_inscripcion;
	}

	public Inscripciones() {
		super();
	}

	public Estudiantes getCedula_estudiante() {
		return cedula_estudiante;
	}

	public void setCedula_estudiante(Estudiantes cedula_estudiante) {
		this.cedula_estudiante = cedula_estudiante;
	}

	public Cursos getId_cursos() {
		return id_cursos;
	}

	public void setId_cursos(Cursos id_cursos) {
		this.id_cursos = id_cursos;
	}

	public BigDecimal getCosto() {
		return costo;
	}

	public void setCosto(BigDecimal costo) {
		this.costo = costo;
	}

	public Date getFecha_inscripcion() {
		return fecha_inscripcion;
	}

	public void setFecha_inscripcion(Date fecha_inscripcion) {
		this.fecha_inscripcion = fecha_inscripcion;
	}

	@Override
	public String toString() {
		return "Inscripciones [cedula_estudiante=" + cedula_estudiante + ", id_cursos=" + id_cursos + ", costo=" + costo
				+ ", fecha_inscripcion=" + fecha_inscripcion + "]";
	}

}
