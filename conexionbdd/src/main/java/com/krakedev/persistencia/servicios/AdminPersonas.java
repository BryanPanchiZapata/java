package com.krakedev.persistencia.servicios;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Time;
import java.util.ArrayList;
import java.util.Date;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.krakedev.persistencia.entidades.EstadoCivil;
import com.krakedev.persistencia.entidades.Persona;
import com.krakedev.persistencia.utils.ConexionBDD;

public class AdminPersonas {
	private static final Logger LOGGER = LogManager.getLogger(AdminPersonas.class);

	public static void insertar(Persona persona) throws Exception {
		Connection connection = null;
		PreparedStatement ps = null;
		LOGGER.trace("Persona a insertar>>>>> " + persona);
		try {
			// Abrir la conexion
			connection = ConexionBDD.conectar();
			ps = connection.prepareStatement("insert into personas(cedula, nombre, apellido, estado_civil_codigo, "
					+ "numero_hijos, estatura, cantidad_ahorrada, fecha_nacimiento, hora_nacimiento)"
					+ "values(?,?,?,?,?,?,?,?,?)");
			ps.setString(1, persona.getCedula());
			ps.setString(2, persona.getNombre());
			ps.setString(3, persona.getApellido());
			ps.setString(4, persona.getEstadoCivil().getCodigo());
			ps.setInt(5, persona.getNumeroHijos());
			ps.setDouble(6, persona.getEstatura());
			ps.setBigDecimal(7, persona.getCantidadAhorrada());
			ps.setDate(8, new java.sql.Date(persona.getFechaNacimiento().getTime()));
			ps.setTime(9, new Time(persona.getHoraNacimiento().getTime()));

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
				throw new Exception("Error con la base de datos. Detalle: " + e.getMessage());
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

	// Consultas con ArrayList
	public static ArrayList<Persona> buscarPorNombre(String nombreBusqueda) throws Exception {
		ArrayList<Persona> personas = new ArrayList<>();
		Connection connection = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			connection = ConexionBDD.conectar();
			ps = connection.prepareStatement("select * from personas where nombre like ?");
			ps.setString(1, "%" + nombreBusqueda + "%");
			rs = ps.executeQuery();

			while (rs.next()) {
				String nombre = rs.getString("nombre");
				String cedula = rs.getString("cedula");
				Persona p = new Persona();
				p.setNombre(nombre);
				p.setCedula(cedula);
				personas.add(p);
			}

		} catch (Exception e) {
			LOGGER.error("Error al consultar por nombre", e);
			throw new Exception("Error al consultar por nombre");
		} finally {
			// cerrar la conexion
			try {
				connection.close();
			} catch (SQLException e) {
				LOGGER.error("Error con la base de datos", e);
				throw new Exception("Error con la base de datos");
			}
		}

		return personas;
	}

	// -------------------------CONSULTAS DEL EJERCICIO
	// ----------------------------------

	// Buscar por clave primaria
	public static Persona buscarPorClave(String cedula) throws Exception {
		Connection connection = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		Persona persona = null;
		try {
			connection = ConexionBDD.conectar();
			ps = connection.prepareStatement("select * from personas where cedula = ?");
			ps.setString(1, cedula);
			rs = ps.executeQuery();

			if (rs.next()) {
				String cedulaP = rs.getString("cedula");
				String nombre = rs.getString("nombre");
				String apellido = rs.getString("apellido");
				String codigo = rs.getString("estado_civil_codigo");
				EstadoCivil ec = new EstadoCivil(codigo, "");
				int estatura = rs.getInt("estatura");
				Date fechal = rs.getDate("fecha_nacimiento");
				int numeroHijos = rs.getInt("numero_hijos");
				Date horaN = rs.getTime("hora_nacimiento");

				persona = new Persona(cedulaP, nombre, apellido, ec, numeroHijos, estatura, fechal, horaN);
				
			}

		} catch (Exception e) {
			LOGGER.error("Error al consultar por cedula", e);
			throw new Exception("Error al consultar por cedula");
		} finally {
			// cerrar la conexion
			try {
				connection.close();
			} catch (SQLException e) {
				LOGGER.error("Error con la base de datos", e);
				throw new Exception("Error con la base de datos");
			}
		}

		return persona;
	}

	// Consultas con ArrayList
	public static ArrayList<Persona> buscarPorNombreR(String nombreBusqueda) throws Exception {
		ArrayList<Persona> personas = new ArrayList<>();
		Connection connection = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			connection = ConexionBDD.conectar();
			ps = connection.prepareStatement("select * from personas where nombre like ?");
			ps.setString(1, "%" + nombreBusqueda + "%");
			rs = ps.executeQuery();

			while (rs.next()) {
				String cedula = rs.getString("cedula");
				String nombre = rs.getString("nombre");
				String apellido = rs.getString("apellido");
				int estatura = rs.getInt("estatura");
				Date fechaN = rs.getDate("fecha_nacimiento");
				Date horaN = rs.getTime("hora_nacimiento");
				int numeroHijos = rs.getInt("numero_hijos");
				BigDecimal money = rs.getBigDecimal("canyidad_ahorrada");
				String codigo = rs.getString("estado_civil_codigo");
				EstadoCivil ec = new EstadoCivil(codigo, "");
				Persona p = new Persona();
				p.setCedula(cedula);
				p.setNombre(nombre);
				p.setApellido(apellido);
				p.setEstatura(estatura);
				p.setFechaNacimiento(fechaN);
				p.setHoraNacimiento(horaN);
				p.setCantidadAhorrada(money);
				p.setNumeroHijos(numeroHijos);
				p.setEstadoCivil(ec);
				personas.add(p);
			}

		} catch (Exception e) {
			LOGGER.error("Error al consultar por nombre", e);
			throw new Exception("Error al consultar por nombre");
		} finally {
			// cerrar la conexion
			try {
				connection.close();
			} catch (SQLException e) {
				LOGGER.error("Error con la base de datos", e);
				throw new Exception("Error con la base de datos");
			}
		}

		return personas;
	}
}
