package com.krakedev.conexionbdd;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestConexion {

	public static void main(String[] args) {
		Connection connection = null;
		PreparedStatement ps = null;
		try {
			Class.forName("org.postgresql.Driver");
			connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", 
					"postgres",
					"postgres");
			System.out.println("Conexión éxitosa");
			ps = connection.prepareStatement(
					"insert into personas(cedula, nombre, apellido, estado_civil_codigo, "
					+ "numero_hijos, estatura, cantidad_ahorrada, fecha_nacimiento, hora_nacimiento)"
							+ "values(?,?,?,?,?,?,?,?,?)");
			ps.setString(1, "172678981");
			ps.setString(2, "Camila");
			ps.setString(3, "Vargas");
			ps.setString(4, "C");
			ps.setInt(5, 2);
			ps.setDouble(6, 1.60);
			ps.setBigDecimal(7, new BigDecimal(1200.45));

			SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd hh:mm:ss");
			String fechaStr = "2020/03/22 10:15:09";
			try {
				Date fecha = sdf.parse(fechaStr);
				System.out.println(fecha);
				long fechaMilis = fecha.getTime();
				System.out.println(fechaMilis);
				// crea un java.sql.Date, partiendo de un java.util.Date
				java.sql.Date fechaSql = new java.sql.Date(fechaMilis);
				System.out.println(fechaSql);

				Time timeSql = new Time(fechaMilis);
				System.out.println(timeSql);

				ps.setDate(8, fechaSql);
				ps.setTime(9, timeSql);

				ps.executeUpdate();
				System.out.println("Ejecuta insert");
			} catch (ParseException e) {
				e.printStackTrace();
			}

		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}

	}

}
