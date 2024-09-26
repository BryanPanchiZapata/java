package com.krakedev.controlflujo.test;

import com.krakedev.controlflujo.Validador;

public class TestValidador {

	public static void main(String[] args) {
		Validador validador = new Validador();

		validador.validarEdad(10);
		validador.validarEdad(20);
		validador.validarEdad(18);
		validador.validarEdad(12);
		validador.validarEdad(17);
		validador.validarEdad(3);
		validador.validarEdad(-1);
		validador.validarEdad(0);

	}

}
