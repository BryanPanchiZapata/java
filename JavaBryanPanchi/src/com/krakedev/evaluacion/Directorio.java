package com.krakedev.evaluacion;

import java.util.ArrayList;
import java.util.Date;

public class Directorio {
	private ArrayList<Contacto> contactos = new ArrayList<>();
	private Date fechaModificacion;

	// Método agregarContacto
	public boolean agregarContacto(Contacto contacto) {
		contactos.add(contacto);
		return true;

	}

	// método buscarPorCedula
	public Contacto buscarPorCedula(String cedula) {
		Contacto elementoContacto;
		for (int i = 0; i < contactos.size(); i++) {
			elementoContacto = contactos.get(i);
			if (elementoContacto.getCedula().equals(cedula)) {
				return elementoContacto;
			}
		}

		return null;
	}
}
