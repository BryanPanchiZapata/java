package com.krakedev.evaluacion;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Directorio {
	private ArrayList<Contacto> contactos = new ArrayList<>();
	private ArrayList<Contacto> incorrectos = new ArrayList<>();
	private ArrayList<Contacto> correctos = new ArrayList<>();
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
		SimpleDateFormat fechaFormato = new SimpleDateFormat("yyyy/MM/dd/ HH:mm:ss");
		String fechaFormateada = fechaFormato.format(fechaModificacion);
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

	// Método contarFijos
	public int contarFijos() {
		int contarTelefono = 0;
		for (int i = 0; i < contactos.size(); i++) {
			Contacto contarFijo = contactos.get(i);
			for (int a = 0; a < contarFijo.getTelefono().size(); a++) {
				Telefono telefono = contarFijo.getTelefono().get(a);
				if (telefono.getTipo().equalsIgnoreCase("convencional") && telefono.getEstado().equals("C")) {
					contarTelefono++;
				}

			}

		}
		return contarTelefono;
	}

	// Método depurar
	public void depurar() {
		for (int i = 0; i < contactos.size(); i++) {
			Contacto validar = contactos.get(i);
			if (validar.getDireccion() != null) {
				correctos.add(validar);
			} else {
				incorrectos.add(validar);
			}
		}
		contactos.clear();
	}

	public ArrayList<Contacto> getIncorrectos() {
		return incorrectos;
	}

	public void setIncorrectos(ArrayList<Contacto> incorrecto) {
		this.incorrectos = incorrecto;
	}

	public ArrayList<Contacto> getCorrectos() {
		return correctos;
	}

	public void setCorrectos(ArrayList<Contacto> correcto) {
		this.correctos = correcto;
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
