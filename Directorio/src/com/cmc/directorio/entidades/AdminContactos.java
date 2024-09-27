package com.cmc.directorio.entidades;

public class AdminContactos {
	// método buscarMasPesado
	public Contacto buscarMasPesado(Contacto per1, Contacto per2) {
		if (per1.getPeso() > per2.getPeso()) {
			return per1;
		} else if (per2.getPeso() > per1.getPeso()) {
			return per2;
		} else {
			return null;
		}
	}

	// método compararOperadoras
	public boolean compararOperadoras(Contacto per1, Contacto per2) {
		if (per1.getTelefono().getOperadora() == "movi" && per2.getTelefono().getOperadora() == "movi") {
			return true;
		} else if (per1.getTelefono().getOperadora() == "claro" && per2.getTelefono().getOperadora() == "claro") {
			return true;
		} else {
			return false;
		}
	}

	// método activar Usuario
	public void activarUsuario(Contacto per1) {
		if (per1.getTelefono().isTieneWhatsapp() == true) {
			per1.setActivo(true);
		}
	}
}
