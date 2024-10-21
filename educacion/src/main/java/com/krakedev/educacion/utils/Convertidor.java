package com.krakedev.educacion.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Convertidor {

	// Formato de fecha y hora que se espera recibir
	private static final String FORMATO_FECHA = "yyyy-MM-dd HH:mm:ss";

	public static Date convertirFecha(String fechaStr) throws Exception {
		SimpleDateFormat simplef = new SimpleDateFormat(FORMATO_FECHA);
		Date fechaDate = null;
		try {
			fechaDate = simplef.parse(fechaStr);
		} catch (ParseException e) {
			throw new Exception("La fecha no tiene el formato correcto: " + fechaStr);
		}
		return fechaDate;
	}

}
