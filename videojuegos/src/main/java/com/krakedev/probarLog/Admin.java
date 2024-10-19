package com.krakedev.probarLog;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.krakedev.juegos.utils.Convertidor;

public class Admin {
	private static Logger Logger = LogManager.getLogger(Admin.class);

	public void agregar() {
		Logger.warn("Mensaje de warn");
		Logger.info("Mensaje de info");
		Logger.debug("Mensaje de debug");
		Logger.trace("Mensaje de trace");
		Logger.error("Mensaje de error...");
	}

}
