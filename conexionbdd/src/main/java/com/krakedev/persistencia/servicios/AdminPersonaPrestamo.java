package com.krakedev.persistencia.servicios;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Time;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.krakedev.persistencia.entidades.Persona;
import com.krakedev.persistencia.entidades.Personas;
import com.krakedev.persistencia.utils.ConexionBDD;

public class AdminPersonaPrestamo {
	private static final Logger LOGGER = LogManager.getLogger(AdminPersonas.class);

	public static void insertarPersona(Personas persona) throws Exception {
		Connection connection = null;
		PreparedStatement ps = null;
		LOGGER.trace("Persona a insertar>>>>> " + persona);
		try {
			// Abrir la conexion
			connection = ConexionBDD.conectar();
			ps = connection.prepareStatement("insert into persona(cedula, nombre, apellido, estatura, "
					+ "fecha_nacimiento, hora_nacimiento, cantidad_ahorrada, numero_hijos)"
					+ "values(?,?,?,?,?,?,?,?)");
			ps.setString(1, persona.getCedula());
			ps.setString(2, persona.getNombre());
			ps.setString(3, persona.getApellido());
			ps.setDouble(4, persona.getEstatura());
			ps.setDate(5, new java.sql.Date(persona.getFechaNacimiento().getTime()));
			ps.setTime(6, new Time(persona.getHoraNacimiento().getTime()));
			ps.setBigDecimal(7, persona.getCantidadAhorrada());
			ps.setInt(8, persona.getNumeroHijos());

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
	public static void actualizar(Persona persona) throws Exception {
		Connection connection = null;
		PreparedStatement ps = null;
		LOGGER.trace("Persona a actualizar>>>>> " + persona);
		try {
			// Abrir la conexion
			connection = ConexionBDD.conectar();
			ps = connection.prepareStatement(
					"update personas set nombre = ?, apellido = ?, estado_civil_codigo= ?, numero_hijos = ?, estatura=?, cantidad_ahorrada=?, fecha_nacimiento=?, hora_nacimiento=? where cedula= ?");
			ps.setString(1, persona.getNombre());
			ps.setString(2, persona.getApellido());
			ps.setString(3, persona.getEstadoCivil().getCodigo());
			ps.setInt(4, persona.getNumeroHijos());
			ps.setDouble(5, persona.getEstatura());
			ps.setBigDecimal(6, persona.getCantidadAhorrada());
			ps.setDate(7, new java.sql.Date(persona.getFechaNacimiento().getTime()));
			ps.setTime(8, new Time(persona.getHoraNacimiento().getTime()));
			ps.setString(9, persona.getCedula());

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
	public static void eliminar(Persona cedula) throws Exception {
		Connection connection = null;
		PreparedStatement ps = null;
		LOGGER.trace("Eliminar persona>>>" + cedula);
		try {
			// Abrir la conexion
			connection = ConexionBDD.conectar();
			ps = connection.prepareStatement("delete from personas where cedula= ?");
			ps.setString(1, cedula.getCedula());

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
