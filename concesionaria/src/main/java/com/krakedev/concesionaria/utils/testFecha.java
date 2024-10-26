package com.krakedev.concesionaria.utils;

import java.util.Date;

public class testFecha {

	public static void main(String[] args) {
		String fecha = "2024/10/23 10:50";
		try {
			Date fechaImprimir = Convertidor.convertirFecha(fecha);
			System.out.println(fechaImprimir);

			long fechaMilis = fechaImprimir.getTime();
			System.out.println(fechaMilis);

			java.sql.Timestamp fechaSQL = new java.sql.Timestamp(fechaMilis);
			System.out.println(fechaSQL);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
