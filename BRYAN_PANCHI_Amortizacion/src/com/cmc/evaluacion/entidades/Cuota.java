package com.cmc.evaluacion.entidades;

import com.cmc.evaluacion.Utilitario;

public class Cuota {
	private int numero;
	private double cuota, capital, inicio, interes, abonoCapital, saldo;
	Utilitario utilitario = new Utilitario();

	public Cuota(int numero) {
		this.numero = numero;
		this.saldo = 0;
		this.inicio = 0;
	}

	// Método mostrarPrestamo
	public void mostrarPrestamo() {
		System.out.println(numero + " | " + utilitario.redondear(cuota) + " | " + utilitario.redondear(inicio) + " | "
				+ utilitario.redondear(interes) + " | " + utilitario.redondear(abonoCapital) + " | "
				+ utilitario.redondear(saldo));
	}

	public double getCuota() {
		return cuota;
	}

	public void setCuota(double cuota) {
		this.cuota = cuota;
	}

	public double getCapital() {
		return capital;
	}

	public void setCapital(double capital) {
		this.capital = capital;
	}

	public double getInicio() {
		return inicio;
	}

	public void setInicio(double inicio) {
		this.inicio = inicio;
	}

	public double getInteres() {
		return interes;
	}

	public void setInteres(double interes) {
		this.interes = interes;
	}

	public double getAbonoCapital() {
		return abonoCapital;
	}

	public void setAbonoCapital(double abonoCapital) {
		this.abonoCapital = abonoCapital;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

}
