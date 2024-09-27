package com.cmc.directorio.entidades;

public class AdminTelefono {
	public void activarMensajeria(Telefono telefono) {
		if (telefono.getOperadora() == "Movi") {
			telefono.setTieneWhatsapp(true);
		}
	}
}
