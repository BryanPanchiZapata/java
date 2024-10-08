package com.krakedev.persistencia.servicios;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Time;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.krakedev.persistencia.entidades.Persona;
import com.krakedev.persistencia.entidades.Prestamo;
import com.krakedev.persistencia.utils.ConexionBDD;

public class AdminPrestamo {
	private static final Logger LOGGER = LogManager.getLogger(AdminPersonas.class);

	public static void insertarP(Prestamo prestamo) throws Exception {
		Connection connection = null;
		PreparedStatement ps = null;
		LOGGER.trace("Persona a insertar>>>>> " + prestamo);
		try {
			// Abrir la conexion
			connection = ConexionBDD.conectar();
			ps = connection.prepareStatement("insert into prestamo(id_prestamo, cedula_persona, monto, fecha_prestamo, "
					+ "hora_prestamo, garante)" + "values(?,?,?,?,?,?)");
			ps.setInt(1, prestamo.getId_prestamo());
			ps.setString(2, prestamo.getPersonas().getCedula());
			ps.setBigDecimal(3, prestamo.getMonto());
			ps.setDate(4, new java.sql.Date(prestamo.getFechaPrestamo().getTime()));
			ps.setTime(5, new Time(prestamo.getHoraPrestamo().getTime()));
			ps.setString(6, prestamo.getGarante());

			ps.executeUpdate();
		} catch (Exception e) {
			LOGGER.error("Error con al insertar", e);
			throw new Exception("Error al insertar Datos");

		} finally {
			// cerrar la conexion
			try {
				connection.close();
			} catch (SQLException e) {
				LOGGER.error("Error con la base de datos", e);
				throw new Exception("Error con la base de datos");
			}
		}
	}

	// Método actualizar
	public static void actualizar(Prestamo prestamo) throws Exception {
		Connection connection = null;
		PreparedStatement ps = null;
		LOGGER.trace("Preatmo a actualizar>>>>> " + prestamo);
		try {
			// Abrir la conexion
			connection = ConexionBDD.conectar();
			ps = connection.prepareStatement(
					"update prestamo set  cedula_persona = ?, monto= ?, fecha_prestamo = ?, hora_prestamo=?, garante=?  where id_prestamo= ?");
			ps.setString(1, prestamo.getPersonas().getCedula());
			ps.setBigDecimal(2, prestamo.getMonto());
			ps.setDate(3, new java.sql.Date(prestamo.getFechaPrestamo().getTime()));
			ps.setTime(4, new Time(prestamo.getHoraPrestamo().getTime()));
			ps.setString(5, prestamo.getGarante());
			ps.setInt(6, prestamo.getId_prestamo());

			ps.executeUpdate();
		} catch (Exception e) {
			LOGGER.error("Error al eliminar", e);
			throw new Exception("Error al eliminar Datos");
		} finally {
			// cerrar la conexion
			try {
				connection.close();
			} catch (SQLException e) {
				LOGGER.error("Error con la base de datos", e);
				throw new Exception("Error con la base de datos");
			}
		}
	}

	// Método eliminar
	public static void eliminarPrestamo(Prestamo id) throws Exception {
		Connection connection = null;
		PreparedStatement ps = null;
		LOGGER.trace("Eliminar persona>>>" + id.getId_prestamo());
		try {
			// Abrir la conexion
			connection = ConexionBDD.conectar();
			ps = connection.prepareStatement("delete from prestamo where id_prestamo= ?");
			ps.setInt(1, id.getId_prestamo());

			ps.executeUpdate();
		} catch (Exception e) {
			LOGGER.error("Error al eliminar", e);
			throw new Exception("Error al eliminar Datos");
		} finally {
			// cerrar la conexion
			try {
				connection.close();
			} catch (SQLException e) {
				LOGGER.error("Error con la base de datos", e);
				throw new Exception("Error con la base de datos");
			}
		}
	}
}
