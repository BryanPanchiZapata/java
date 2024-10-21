package com.krakedev.educacion.persistencia;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;

import com.krakedev.educacion.entidades.Cursos;
import com.krakedev.educacion.entidades.Estudiantes;
import com.krakedev.educacion.entidades.Inscripciones;
import com.krakedev.educacion.excepciones.KrakeException;
import com.krakedev.educacion.utils.ConexionBDD;
import com.krakedev.educacion.utils.Convertidor;

public class HistorialInscripcion {
	// Métdo insertar
	public void insertar(Inscripciones inscripcion) throws KrakeException {
		Connection con = null;
		PreparedStatement ps = null;

		try {
			con = ConexionBDD.obtenerConexion();
			ps = con.prepareStatement(
					"insert into inscripciones (cedula_estudiante, id_cursos, costo, fecha_inscripcion) values(?,?,?,?)");
			ps.setString(1, inscripcion.getCedula_estudiante().getCedula());
			ps.setString(2, inscripcion.getId_cursos().getId());
			ps.setBigDecimal(3, inscripcion.getCosto());
			ps.setTimestamp(4, new java.sql.Timestamp(inscripcion.getFecha_inscripcion().getTime()));
			ps.executeUpdate();
		} catch (KrakeException e) {
			e.printStackTrace();
			throw e;
		} catch (SQLException e) {
			e.printStackTrace();
			throw new KrakeException("Error al insertar la inscripcion. Detalle" + e.getMessage());
		} finally {
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
				throw new KrakeException("Error con la conexión. Deatlle " + e.getMessage());
			}
		}
	}

	// Método eliminar
	public void eliminar(String cedula) throws KrakeException {
		Connection con = null;
		PreparedStatement ps = null;
		try {
			con = ConexionBDD.obtenerConexion();
			ps = con.prepareStatement("delete from inscripciones where cedula_estudiante=?");
			ps.setString(1, cedula);
			ps.executeUpdate();
		} catch (KrakeException e) {
			e.printStackTrace();
			throw e;
		} catch (SQLException e) {
			e.printStackTrace();
			throw new KrakeException("Error al eliminar " + cedula + e.getMessage());
		}finally {
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
				throw new KrakeException("Error al cerrar la conexion. Detalle " + e.getMessage());
			}
			
		}
	}

	// Método actulizar
	public void actulizar(Inscripciones inscripcion) throws KrakeException {
		Connection con = null;
		PreparedStatement ps = null;
		try {
			con = ConexionBDD.obtenerConexion();
			ps = con.prepareStatement(
					"update inscripciones set id_cursos=?, costo=?, fecha_inscripcion=? where cedula_estudiante=?");
			ps.setString(1, inscripcion.getId_cursos().getId());
			ps.setBigDecimal(2, inscripcion.getCosto());
			ps.setTimestamp(3, new java.sql.Timestamp(inscripcion.getFecha_inscripcion().getTime()));
			ps.setString(4, inscripcion.getCedula_estudiante().getCedula());
			ps.executeUpdate();
		} catch (KrakeException e) {
			e.printStackTrace();
			throw e;
		} catch (SQLException e) {
			e.printStackTrace();
			throw new KrakeException("Error al actualizar. Detalle: " + e.getMessage());
		} finally {
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
				throw new KrakeException("Error en la conexion. Deatlle" + e.getMessage());
			}
		}
	}

	// Método BuscarPorID
	public Inscripciones buscarPorID(String cedulaInscripcion) throws KrakeException {
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		Inscripciones inscripcion = null;

		try {
			con = ConexionBDD.obtenerConexion();
			ps = con.prepareStatement(
					"select cedula_estudiante, id_cursos, costo::numeric as costo, fecha_inscripcion from inscripciones where cedula_estudiante =?");
			ps.setString(1, cedulaInscripcion);
			rs = ps.executeQuery();

			if (rs.next()) {
				String cedula_estudiante = rs.getString("cedula_estudiante");
				String id_cursos = rs.getString("id_cursos");
				BigDecimal costo = rs.getBigDecimal("costo");
				Timestamp fecha_inscripcion_Date = rs.getTimestamp("fecha_inscripcion");
				java.sql.Timestamp fecha_inscripcion = new java.sql.Timestamp(fecha_inscripcion_Date.getTime());
				Estudiantes es = new Estudiantes(cedula_estudiante, "", "");
				Cursos cur = new Cursos(id_cursos, "", "");
				inscripcion = new Inscripciones(es, cur, costo, fecha_inscripcion);
			} else {
				return null;
			}
		} catch (KrakeException e) {
			e.printStackTrace();
			throw e;
		} catch (SQLException e) {
			e.printStackTrace();
			throw new KrakeException("Error al buscar por ID. Detalle" + e.getMessage());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
				throw new KrakeException("Error con la conexión. Detalle " + e.getMessage());
			}
		}
		return inscripcion;

	}

	// Método BuscarTodos
	public ArrayList<Inscripciones> buscarTodos() throws KrakeException {
		ArrayList<Inscripciones> inscripciones = new ArrayList<>();
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		Inscripciones inscripcion = null;
		try {
			con = ConexionBDD.obtenerConexion();
			ps = con.prepareStatement(
					"select cedula_estudiante, id_cursos, costo::numeric as costo, fecha_inscripcion from inscripciones");
			rs = ps.executeQuery();
			while (rs.next()) {
				String cedula_estudiante = rs.getString("cedula_estudiante");
				String id_cursos = rs.getString("id_cursos");
				BigDecimal costo = rs.getBigDecimal("costo");
				String fechaStr = rs.getString("fecha_inscripcion");

				System.out.println("Fecha obtenida de la base de datos: " + fechaStr);

				Date fecha_inscripcion = Convertidor.convertirFecha(fechaStr);

				java.sql.Timestamp fechaInscripcion = new java.sql.Timestamp(fecha_inscripcion.getTime());

				Estudiantes es = new Estudiantes(cedula_estudiante, "", "");
				Cursos cur = new Cursos(id_cursos, "", "");
				inscripcion = new Inscripciones(es, cur, costo, fechaInscripcion);
				inscripciones.add(inscripcion);
			}
		} catch (KrakeException e) {
			e.printStackTrace();
			throw e;
		} catch (SQLException e) {
			e.printStackTrace();
			throw new KrakeException("Error al buscar. Detalle" + e.getMessage());
		} catch (Exception e) {
			e.printStackTrace();
			throw new KrakeException("Error con el formato Fecha: " + e.getMessage());

		} finally {
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
				throw new KrakeException("Error con la conexión. Deatlle " + e.getMessage());
			}
		}
		return inscripciones;
	}
}
