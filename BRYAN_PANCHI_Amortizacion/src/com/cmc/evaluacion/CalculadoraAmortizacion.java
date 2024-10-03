package com.cmc.evaluacion;

import com.cmc.evaluacion.entidades.Prestamo;

public class CalculadoraAmortizacion {
	public static double calcularCuota(Prestamo prestamo) {
		double cuota = (prestamo.getMonto() * 0.01) / (1 - (Math.pow(1 + 0.01, -prestamo.getPlazo())));
		return cuota;
	}

}
