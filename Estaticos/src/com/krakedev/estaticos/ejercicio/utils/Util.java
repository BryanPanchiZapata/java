package com.krakedev.estaticos.ejercicio.utils;

public class Util {
	public static String formatearHora(int numero) {
		if (numero >= 0 && numero <= 9) {
	        return "0" + numero;
	    } else {
	        return numero + "";
	    }

	}

	public static String formatearDia(int valor) {
		if (valor == 0) {
			return "Lunes";
		} else if (valor == 1) {
			return "Martes";
		} else if (valor == 2) {
			return "Miercoles";
		} else if (valor == 3) {
			return "Jueves";
		} else if (valor == 4) {
			return "Viernes";
		} else if (valor == 5) {
			return "Sabado";
		} else if (valor == 6) {
			return "Domingo";
		} else {
			return "";
		}
	}

}
