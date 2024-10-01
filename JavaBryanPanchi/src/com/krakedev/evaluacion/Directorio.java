package com.krakedev.evaluacion;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Directorio {
	private ArrayList<Contacto> contactos = new ArrayList<>();
	private Date fechaModificacion = new Date();

	// Método agregarContacto
	public boolean agregarContacto(Contacto contacto) {
		Contacto elementoContacto;
		for (int i = 0; i < contactos.size(); i++) {
			elementoContacto = contactos.get(i);
			if (elementoContacto.getCedula().equals(contacto.getCedula())) {
				return false;
			}

		}
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

	// método consultarUltimaModificacion
	public String consultarUltimaModificacion() {
		SimpleDateFormat formato = new SimpleDateFormat("yyyy/MM/dd/ HH:mm:ss");
		String fechaFormateada = formato.format(fechaModificacion);
		return fechaFormateada;
	}

	// Método contarPedidos
	public int contarPerdidos() {
		int contador = 0;
		for (int i = 0; i < contactos.size(); i++) {
			Contacto numeroContactos = contactos.get(i);
			if (numeroContactos.getDireccion() == null) {
				contador++;
			}

		}
		return contador;
	}

	public ArrayList<Contacto> getContactos() {
		return contactos;
	}

	public void setContactos(ArrayList<Contacto> contactos) {
		this.contactos = contactos;
	}

	public Date getFechaModificacion() {
		return fechaModificacion;
	}

	public void setFechaModificacion(Date fechaModificacion) {
		this.fechaModificacion = fechaModificacion;
	}

}
