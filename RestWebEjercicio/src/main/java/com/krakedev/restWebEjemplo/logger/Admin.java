package com.krakedev.restWebEjemplo.logger;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Admin {
	private static Logger Logger = LogManager.getLogger(Admin.class);
	
	public void probarLog() {
		Logger.warn("Mensaje de warn");
		Logger.info("Mensaje de info");
		Logger.debug("Mensaje de debug");
		Logger.trace("Mensaje de trace");
		Logger.error("Mensaje de error");
	}

}
