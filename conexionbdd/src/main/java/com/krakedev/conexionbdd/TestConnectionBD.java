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

public class TestConnectionBD {

	public static void main(String[] args) {
		Connection connection = null;
		PreparedStatement ps = null;

		try {
			Class.forName("org.postgresql.Driver");
			connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres",
					"postgres");
			System.out.println("Conexión éxitosa");
			ps = connection
					.prepareStatement("insert into persona (cedula, nombre, apellido, estatura, fecha_nacimiento,"
							+ "hora_nacimiento, cantidad_ahorrada, numero_hijos)" + "values(?,?,?,?,?,?,?,?)");
			ps.setString(1, "1726010752");
			ps.setString(2, "Juan");
			ps.setString(3, "Torres");
			ps.setDouble(4, 1.60);
			ps.setBigDecimal(7, new BigDecimal(1000));
			ps.setInt(8, 4);

			SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd hh:mm:ss");
			String fechaStr = "2001/12/30 09:30:09";
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

				ps.setDate(5, fechaSql);
				ps.setTime(6, timeSql);

				ps.executeUpdate();
				System.out.println("Ejecuta insert");
			} catch (ParseException e) {
				e.printStackTrace();
			}

		} catch (ClassNotFoundException |

				SQLException e) {
			e.printStackTrace();
		}

	}
}
