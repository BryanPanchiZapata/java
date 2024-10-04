package com.cmc.evaluacion;

import java.util.ArrayList;

import com.cmc.evaluacion.entidades.Cuota;
import com.cmc.evaluacion.entidades.Prestamo;

public class CalculadoraAmortizacion {
	public static double calcularCuota(Prestamo prestamo) {
		double cuota = (prestamo.getMonto() * 0.01) / (1 - (Math.pow(1 + 0.01, -prestamo.getPlazo())));
		return cuota;
	}

	public static void generarTabla(Prestamo prestamo) {
		Utilitario decimal = new Utilitario();
		double valorCuota = decimal.redondear(calcularCuota(prestamo));
		double interesPrestamo = prestamo.getInteres() / 12 / 100;
		ArrayList<Cuota> cuotas = new ArrayList<>();

		for (int i = 0; i < prestamo.getPlazo(); i++) {
			Cuota cuota = new Cuota(i + 1);
			cuota.setCuota(valorCuota);

			if (i == 0) {
				cuota.setInicio(prestamo.getMonto());
				cuota.setSaldo(prestamo.getMonto());
			} else {
				cuota.setSaldo(cuotas.get(i - 1).getSaldo());
			}

			cuotas.add(cuota);
		}

		for (int i = 0; i < cuotas.size(); i++) {
			Cuota cuota = cuotas.get(i);
			if (i < cuotas.size() - 1) {
				calcularValoresCuota(interesPrestamo, cuota, cuotas.get(i + 1));
			} else {
				calcularValoresCuota(interesPrestamo, cuota, null);
			}
		}

		prestamo.setCuotas(cuotas);
	}

	public static void calcularValoresCuota(double interes, Cuota cuota, Cuota cuotaSiguiente) {
		double valorInteres = interes * cuota.getInicio();
		double abonoCapital = cuota.getCuota() - valorInteres;
		double saldo = cuota.getInicio() - abonoCapital;

		cuota.setInteres(valorInteres);
		cuota.setAbonoCapital(abonoCapital);
		cuota.setSaldo(saldo);

		if (cuotaSiguiente != null) {
			cuotaSiguiente.setInicio(saldo);
		} else {
			cuota.setCuota(cuota.getCuota() + saldo);
			cuota.setSaldo(0);
		}
	}

	public static void mostrarTabla(Prestamo pre) {
		System.out.println("Numero | Cuota | Inicio | Interes | Abono capital | Saldo |");
		ArrayList<Cuota> cuotas = new ArrayList<Cuota>();
		cuotas = pre.getCuotas();

		for (Cuota cuota : cuotas) {
			cuota.mostrarPrestamo();
		}
	}

}