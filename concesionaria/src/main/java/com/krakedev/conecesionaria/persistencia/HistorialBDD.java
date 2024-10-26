package com.krakedev.conecesionaria.persistencia;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.krakedev.concesionaria.entidades.Empresa;
import com.krakedev.concesionaria.excepciones.KrakeException;
import com.krakedev.concesionaria.utils.ConexionBDD;

public class HistorialBDD {
	public void insertar(Empresa empresa) throws KrakeException {
		Connection con = null;
		PreparedStatement ps = null;

		try {
			con = ConexionBDD.obtenerConexion();
			ps = con.prepareStatement(
					"insert into empresas (id, nombre, fecha_creacion, telefono, precio) values (?,?,?,?,?)");
			ps.setString(1, empresa.getId());
			ps.setString(2, empresa.getNombre());
			ps.setTimestamp(3, new java.sql.Timestamp(empresa.getFecha_creacion().getTime()));
			ps.setString(4, empresa.getTelefono());
			ps.setBigDecimal(5, empresa.getPrecio());

			ps.executeUpdate();
		} catch (KrakeException e) {
			e.printStackTrace();
			throw e;
		} catch (SQLException e) {
			e.printStackTrace();
			throw new KrakeException("Error al insertar la empresa. Detalle " + e.getMessage());
		} finally {
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
				throw new KrakeException("Error al cerrar la conexión. Detalle " + e.getMessage());
			}
		}
	}

	// Actualizar
	public void actualizar(Empresa empresa) throws KrakeException {
		Connection con = null;
		PreparedStatement ps = null;

		try {
			con = ConexionBDD.obtenerConexion();
			ps = con.prepareStatement(
					"update empresas set nombre=?, fecha_creacion=?, telefono=?, precio=? where id=?");
			ps.setString(1, empresa.getNombre());
			ps.setTimestamp(2, new java.sql.Timestamp(empresa.getFecha_creacion().getTime()));
			ps.setString(3, empresa.getTelefono());
			ps.setBigDecimal(4, empresa.getPrecio());
			ps.setString(5, empresa.getId());
			ps.executeUpdate();
		} catch (KrakeException e) {
			e.printStackTrace();
			throw e;
		} catch (SQLException e) {
			e.printStackTrace();
			throw new KrakeException("Error al actualizar el resgistro. Detalle " + e.getMessage());
		} finally {
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
				throw new KrakeException("Error al conectar con la DB. Detalle " + e.getMessage());
			}
		}

	}

	// Buscar por ID
	public Empresa buscarPorId(String idEmpresa) throws KrakeException {
		Connection con = null;
		PreparedStatement ps = null;
		Empresa empresas = null;
		ResultSet rs = null;

		try {
			con = ConexionBDD.obtenerConexion();
			ps = con.prepareStatement(
					"select id, nombre, fecha_creacion, telefono, precio::numeric from empresas where id=?");
			ps.setString(1, idEmpresa);

			rs = ps.executeQuery();

			if (rs.next()) {
				String id = rs.getString("id");
				String nombre = rs.getString("nombre");
				Date fecha_creacion = rs.getDate("fecha_creacion");
				String telefono = rs.getString("telefono");
				BigDecimal precio = rs.getBigDecimal("precio");
				empresas = new Empresa(id, nombre, fecha_creacion, telefono, precio);

			} else {
				return null;
			}
		} catch (KrakeException e) {
			e.printStackTrace();
			throw e;
		} catch (SQLException e) {
			e.printStackTrace();
			throw new KrakeException("Error al buscar por ID. Detalle " + e.getMessage());
		} finally {
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
				throw new KrakeException("Error al conectar con la DB. Detalle " + e.getMessage());
			}
		}
		return empresas;
	}

	// BuscarTodos
	public ArrayList<Empresa> buscarTodos() throws KrakeException {
		ArrayList<Empresa> empresas = new ArrayList<>();
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		Empresa empresa = null;

		try {
			con = ConexionBDD.obtenerConexion();
			ps = con.prepareStatement("select id, nombre, fecha_creacion, telefono, precio::numeric from empresas");
			rs = ps.executeQuery();

			while (rs.next()) {
				String id = rs.getString("id");
				String nombre = rs.getString("nombre");
				Date fecha_creacion = rs.getDate("fecha_creacion");
				String telefono = rs.getString("telefono");
				BigDecimal precio = rs.getBigDecimal("precio");
				empresa = new Empresa(id, nombre, fecha_creacion, telefono, precio);
				empresas.add(empresa);
			}

		} catch (KrakeException e) {
			e.printStackTrace();
			throw e;
		} catch (SQLException e) {
			e.printStackTrace();
			throw new KrakeException("Error al buscar los registros. Detalle " + e.getMessage());
		} finally {
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
				throw new KrakeException("Error al conectar con la DB. Detalle " + e.getMessage());
			}
		}
		return empresas;
	}

}
