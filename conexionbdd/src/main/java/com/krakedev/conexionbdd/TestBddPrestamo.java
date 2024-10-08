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

public class TestBddPrestamo {

	public static void main(String[] args) {
		Connection connection = null;
		PreparedStatement ps = null;

		try {
			Class.forName("org.postgresql.Driver");
			connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres",
					"postgres");
			System.out.println("Conexión éxitosa");
			ps = connection.prepareStatement(
					"insert into prestamo (id_prestamo, cedula_persona, monto, fecha_prestamo, hora_prestamo, garante)"
							+ "values(?,?,?,?,?,?)");
			ps.setInt(1, 2000);
			ps.setString(2, "1726010752");
			ps.setBigDecimal(3, new BigDecimal(900));
			ps.setString(6, "Alan Franco");
			
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd hh:mm:ss");
			String fechaStr = "1999/09/13 13:30:01";
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

				ps.setDate(4, fechaSql);
				ps.setTime(5, timeSql);

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
