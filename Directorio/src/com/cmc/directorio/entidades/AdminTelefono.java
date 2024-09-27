package com.cmc.directorio.entidades;

public class AdminTelefono {
	public void activarMensajeria(Telefono telefono) {
		if (telefono.getOperadora() == "movi") {
			telefono.setTieneWhatsapp(true);
		}
	}

	// Método contarMovi
	public Telefono contarMovi(Telefono telf1, Telefono telf2, Telefono telf3) {

		Telefono operadora = null;

		if (telf1.getOperadora() == "movi") {
			System.out.println("El primer telefono es Movi");
			operadora = telf1;
		}
		if (telf2.getOperadora() == "movi") {
			System.out.println("El segundo telefono es Movi");
			operadora = telf2;
		}
		if (telf3.getOperadora() == "movi") {
			System.out.println("El tercer telefono es Movi");
			operadora = telf3;
		} else {
			operadora = null;
		}
		return operadora;
	}

	// Método contarClaro
	public Telefono contarClaro(Telefono telf1, Telefono telf2, Telefono telf3, Telefono telf4) {
		Telefono operador = null;
		if (telf1.getOperadora() == "claro") {
			System.out.println("Telefono 1 es calro");
			operador = telf1;
		}
		if (telf2.getOperadora() == "claro") {
			System.out.println("Telefono 2 es calro");
			operador = telf2;
		}
		if (telf3.getOperadora() == "claro") {
			System.out.println("Telefono 3 es calro");
			operador = telf3;
		}
		if (telf4.getOperadora() == "claro") {
			System.out.println("Telefono 4 es calro");
			operador = telf4;
		} else {
			operador = null;
		}
		return operador;
	}

}
