package com.krakedev.estaticos;

public class TestEstaticos {

	public static void main(String[] args) {
		// Para invocar a un metodo estatico
		// se lo hace directamente desde la clase
		// NO HACE FALTA INSTANCIAR UN OBJETO
		double numero = Math.random();
		System.out.println(numero);

		// Ejemplo
		int radio = 10;
		double area = Math.PI * radio;
		System.out.println(area);
	}

}
