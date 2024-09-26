package com.cmc.repaso.test;

import com.cmc.repaso.entidades.Validacion;

public class testValidacion {

	public static void main(String[] args) {
		Validacion validar = new Validacion();
		
		System.out.println(validar.validarMonto(10));
		System.out.println(validar.validarMonto(-1));
	}

}
