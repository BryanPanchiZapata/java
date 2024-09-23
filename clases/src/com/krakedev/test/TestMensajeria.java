package com.krakedev.test;

import com.krakedev.Mensajeria;

public class TestMensajeria {

	public static void main(String[] args) {
		Mensajeria m = new Mensajeria();// instancio el objero Mensajeria
		m.saludar();
		m.saludarAmigos("Marcos", "Rivera");
	}

}
