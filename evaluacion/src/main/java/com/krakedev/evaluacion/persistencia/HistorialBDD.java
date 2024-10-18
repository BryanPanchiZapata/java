package com.krakedev.evaluacion.persistencia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.krakedev.evaluacion.entidades.Categoria;
import com.krakedev.evaluacion.excepciones.KrakeException;
import com.krakedev.evaluacion.utils.ConexionBDD;

public class HistorialBDD {

	public void insertar(Categoria categoria) throws KrakeException {
		Connection con = null;
		PreparedStatement ps = null;
		try {
			con = ConexionBDD.obtenerConexion();
			ps = con.prepareStatement("insert into categorias (id, nombre) values (?,?)");
			ps.setString(1, categoria.getId());
			ps.setString(2, categoria.getNombre());

			ps.executeUpdate();
		} catch (KrakeException e) {
			e.printStackTrace();
			throw e;
		} catch (SQLException e) {
			e.printStackTrace();
			throw new KrakeException("Error al insertar una categoria " + e.getMessage());
		} finally {
			if (con != null) {
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}

	// Método ACTUALIZAR
	public void actualizar(Categoria categoria) throws KrakeException {
		Connection con = null;
		PreparedStatement ps = null;

		try {
			con = ConexionBDD.obtenerConexion();
			ps = con.prepareStatement("update categorias set nombre = ? where id=?");
			ps.setString(1, categoria.getNombre());
			ps.setString(2, categoria.getId());

			ps.executeUpdate();
		} catch (KrakeException e) {
			e.printStackTrace();
			throw e;
		} catch (SQLException e) {
			e.printStackTrace();
			throw new KrakeException("Error al actualizar la categoria");
		} finally {
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
				throw new KrakeException("Error con la base de datos " + e.getMessage());
			}
		}
	}

	// Método Buscar Por ID
	public Categoria buscarPorId(String idBusqueda) throws KrakeException {
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		Categoria categoria = null;
		try {
			con = ConexionBDD.obtenerConexion();
			ps = con.prepareStatement("Select id, nombre from categorias where id = ?");
			ps.setString(1, idBusqueda);

			rs = ps.executeQuery();

			if (rs.next()) {
				String id = rs.getString("id");
				String nombre = rs.getString("nombre");
				categoria = new Categoria(id, nombre);

			} else {
				return null;
			}
		} catch (KrakeException e) {
			e.printStackTrace();
			throw e;
		} catch (SQLException e) {
			e.printStackTrace();
			throw new KrakeException("Error al consulatr por ID");
		} finally {
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
				throw new KrakeException("Error con la base de datos " + e.getMessage());
			}
		}
		return categoria;
	}

	// Métdo RECUPERAR TODOS GET
	public ArrayList<Categoria> recuperarTodos() throws KrakeException{
		ArrayList<Categoria> categorias = new ArrayList<>();
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		Categoria categoria = null;
		try {
			con = ConexionBDD.obtenerConexion();
			ps = con.prepareStatement("Select id, nombre from categorias");
			rs = ps.executeQuery();

			while (rs.next()) {
				String id = rs.getString("id");
				String nombre = rs.getString("nombre");
				categoria = new Categoria(id, nombre);
				categorias.add(categoria);
			}

		} catch (KrakeException e) {
			e.printStackTrace();
			throw e;
		} catch (SQLException e) {
			e.printStackTrace();
			throw new KrakeException("Error al obtener categorias" + e.getMessage());
		} finally {
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
				throw new KrakeException("Error al obtener conexión" + e.getMessage());
			}
		}
		return categorias;
	}
}
