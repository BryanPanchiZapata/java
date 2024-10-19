package com.krakedev.juegos.utils;

import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Convertidor {

	// Se cambio el métdo que era Date por el timeStamp
	private static final String FORMATO_FECHA = "yyyy/MM/dd hh:mm";

	public static Timestamp convertirFecha(String fechaStr) throws Exception {
		SimpleDateFormat simplef = new SimpleDateFormat(FORMATO_FECHA);
		Timestamp fechaDate = null;
		try {
			fechaDate = new Timestamp(simplef.parse(fechaStr).getTime());
		} catch (ParseException e) {
			throw new Exception("La fecha no tiene el formato correcto " + fechaStr);
		}
		return fechaDate;
	}

}
