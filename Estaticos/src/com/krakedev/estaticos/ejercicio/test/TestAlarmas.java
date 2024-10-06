package com.krakedev.estaticos.ejercicio.test;

import java.util.ArrayList;

import com.krakedev.estaticos.ejercicio.entidades.Alarma;
import com.krakedev.estaticos.ejercicio.logica.AdminAlarmas;
import com.krakedev.estaticos.ejercicio.utils.DiasSemana;

public class TestAlarmas {

	public static void main(String[] args) {
		Alarma alarma1 = new Alarma(DiasSemana.LUNES, 5, 45);
		Alarma alarma2 = new Alarma(DiasSemana.MARTES, 8, 30);
		Alarma alarma3 = new Alarma(DiasSemana.MIERCOLES, 9, 15);

		AdminAlarmas adminA = new AdminAlarmas();

		adminA.agregarAlarma(alarma1);
		adminA.agregarAlarma(alarma2);
		adminA.agregarAlarma(alarma3);

		ArrayList<Alarma> alarmasActuales = adminA.getAlarmas();

		System.out.println(alarmasActuales);
	}

}
