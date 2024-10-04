package com.cmc.evaluacion;

public class Utilitario {
	public double redondear(double valor) {
		double redondeo = Math.round(valor * 100.0)/100.0;
		return redondeo;
	}
}
