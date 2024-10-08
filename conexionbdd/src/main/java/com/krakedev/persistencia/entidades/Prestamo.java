package com.krakedev.persistencia.entidades;

import java.math.BigDecimal;
import java.util.Date;

public class Prestamo {
	private int id_prestamo;
	private Personas personas;
	private BigDecimal monto;
	private Date FechaPrestamo;
	private Date horaPrestamo;
	private String garante;

	public Prestamo(int id_prestamo, Personas personas, BigDecimal monto, Date fechaPrestamo, Date horaPrestamo,
			String garante) {
		super();
		this.id_prestamo = id_prestamo;
		this.personas = personas;
		this.monto = monto;
		FechaPrestamo = fechaPrestamo;
		this.horaPrestamo = horaPrestamo;
		this.garante = garante;
	}

	public Prestamo(int id_prestamo, Personas personas) {
		super();
		this.id_prestamo = id_prestamo;
		this.personas = personas;
	}

	public Prestamo() {

	}

	public int getId_prestamo() {
		return id_prestamo;
	}

	public void setId_prestamo(int id_prestamo) {
		this.id_prestamo = id_prestamo;
	}

	public Personas getPersonas() {
		return personas;
	}

	public void setPersonas(Personas personas) {
		this.personas = personas;
	}

	public BigDecimal getMonto() {
		return monto;
	}

	public void setMonto(BigDecimal monto) {
		this.monto = monto;
	}

	public Date getFechaPrestamo() {
		return FechaPrestamo;
	}

	public void setFechaPrestamo(Date fechaPrestamo) {
		FechaPrestamo = fechaPrestamo;
	}

	public Date getHoraPrestamo() {
		return horaPrestamo;
	}

	public void setHoraPrestamo(Date horaPrestamo) {
		this.horaPrestamo = horaPrestamo;
	}

	public String getGarante() {
		return garante;
	}

	public void setGarante(String garante) {
		this.garante = garante;
	}

	@Override
	public String toString() {
		return "Prestamo [id_prestamo=" + id_prestamo + ", personas=" + personas + ", monto=" + monto
				+ ", FechaPrestamo=" + FechaPrestamo + ", horaPrestamo=" + horaPrestamo + ", garante=" + garante + "]";
	}

}
