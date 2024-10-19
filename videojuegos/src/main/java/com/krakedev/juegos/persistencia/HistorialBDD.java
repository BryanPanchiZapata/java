package com.krakedev.juegos.persistencia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.krakedev.juegos.entidades.Personas;
import com.krakedev.juegos.excpciones.KrakeException;
import com.krakedev.juegos.utils.ConexionBDD;

public class HistorialBDD {

	// Insertar Persona
	public void insertarPersonas(Personas persona) throws KrakeException {
		Connection con = null;
		PreparedStatement ps = null;

		try {
			con = ConexionBDD.obtenerConexion();
			ps = con.prepareStatement("insert into personas (cedula, nombre, apellido, edad) values (?,?,?,?)");
			ps.setString(1, persona.getCedula());
			ps.setString(2, persona.getNombre());
			ps.setString(3, persona.getApellido());
			ps.setInt(4, persona.getEdad());

			ps.executeUpdate();
		} catch (KrakeException e) {
			e.printStackTrace();
			throw e;
		} catch (SQLException e) {
			e.printStackTrace();
			throw new KrakeException("Error al insertar una categoria " + e.getMessage());
		} finally {
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
				throw new KrakeException("Error en la base de datos. Detalle " + e.getMessage());
			}
		}
	}

	// Actualizar Persona
	public void actualizarPersona(Personas persona) throws KrakeException {
		Connection con = null;
		PreparedStatement ps = null;

		try {
			con = ConexionBDD.obtenerConexion();
			ps = con.prepareStatement("update personas set nombre=?, apellido=?,edad=? where cedula=?");
			ps.setString(1, persona.getNombre());
			ps.setString(2, persona.getApellido());
			ps.setInt(3, persona.getEdad());
			ps.setString(4, persona.getCedula());

			ps.executeUpdate();
		} catch (KrakeException e) {
			e.printStackTrace();
			throw e;
		} catch (SQLException e) {
			e.printStackTrace();
			throw new KrakeException("Error al actualizar " + e);
		} finally {
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
				throw new KrakeException("Error al cerrar la conexion" + e);
			}
		}
	}

	// Buscar Por ID
	public Personas buscarPorCedula(String cedulaPersona) throws KrakeException {
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		Personas persona = null;

		try {
			con = ConexionBDD.obtenerConexion();
			ps = con.prepareStatement("select cedula, nombre, apellido, edad from personas where cedula =?");
			ps.setString(1, cedulaPersona);

			rs = ps.executeQuery();

			if (rs.next()) {
				String cedula = rs.getString("cedula");
				String nombre = rs.getString("nombre");
				String apellido = rs.getString("apellido");
				int edad = rs.getInt("edad");
				persona = new Personas(cedula, nombre, apellido, edad);
			} else {
				return null;
			}
		} catch (KrakeException e) {
			e.printStackTrace();
			throw e;
		} catch (SQLException e) {
			e.printStackTrace();
			throw new KrakeException("Error al buscar" + e);
		} finally {
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
				throw new KrakeException("Error al cerrar conexion" + e);
			}
		}
		return persona;
	}

	// Método Buscar todos
	public ArrayList<Personas> buscarPersonas() throws KrakeException {
		ArrayList<Personas> personas = new ArrayList<>();
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		Personas persona = null;

		try {
			con = ConexionBDD.obtenerConexion();
			ps = con.prepareStatement("select cedula, nombre, apellido, edad from personas");
			rs = ps.executeQuery();

			while (rs.next()) {
				String cedula = rs.getString("cedula");
				String nombre = rs.getString("nombre");
				String apellido = rs.getString("apellido");
				int edad = rs.getInt("edad");
				persona = new Personas(cedula, nombre, apellido, edad);
				personas.add(persona);
			}
		} catch (KrakeException e) {
			e.printStackTrace();
			throw e;
		} catch (SQLException e) {
			e.printStackTrace();
			throw new KrakeException("Error al buscar" + e);
		} finally {
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
				throw new KrakeException("Error al cerrar conexion" + e);
			}
		}
		return personas;
	}

}
