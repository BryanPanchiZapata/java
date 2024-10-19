package com.krakedev.juegos.persistencia;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.krakedev.juegos.entidades.VideoJuegos;
import com.krakedev.juegos.excpciones.KrakeException;
import com.krakedev.juegos.utils.ConexionBDD;

public class HistorialBDDV {
	private static final Logger LOGGER = LogManager.getLogger(HistorialBDDV.class);

	// Insertar videoJuego
	public void insertarVideojuego(VideoJuegos juego) throws KrakeException {
		Connection con = null;
		PreparedStatement ps = null;

		try {
			con = ConexionBDD.obtenerConexion();
			ps = con.prepareStatement(
					"insert into videojuegos(id, cedula_persona, nombre, precio, fecha_compra) values(?,?,?,?,?)");
			ps.setString(1, juego.getId());
			ps.setString(2, juego.getCedula_persona());
			ps.setString(3, juego.getNombre());
			ps.setBigDecimal(4, juego.getPrecio());
			ps.setTimestamp(5, juego.getFecha_compra());

			ps.executeUpdate();

		} catch (KrakeException e) {
			LOGGER.error("Error al insertar datos", e);
			throw e;
		} catch (SQLException e) {
			LOGGER.error("Error al insertar datos", e);
			throw new KrakeException("Error al insertar datos. Detalle " + e.getMessage());
		} finally {
			try {
				con.close();
			} catch (SQLException e) {
				LOGGER.error("Error al cerrar la conexion " + e);
				throw new KrakeException("Error con la base de datos. Detalle " + e.getMessage());
			}
		}
	}

	// Métdo Actualizar
	public void actualizarJuego(VideoJuegos juego) throws KrakeException {
		Connection con = null;
		PreparedStatement ps = null;
		try {
			con = ConexionBDD.obtenerConexion();
			ps = con.prepareStatement(
					"update videojuegos set cedula_persona=?, nombre=?, precio=?,fecha_compra=" + "? where id=?");
			ps.setString(1, juego.getCedula_persona());
			ps.setString(2, juego.getNombre());
			ps.setBigDecimal(3, juego.getPrecio());
			ps.setTimestamp(4, juego.getFecha_compra());
			ps.setString(5, juego.getId());
			ps.executeUpdate();
		} catch (KrakeException e) {
			e.printStackTrace();
			throw e;
		} catch (SQLException e) {
			e.printStackTrace();
			throw new KrakeException("Error al actulizar" + e);
		} finally {
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
				throw new KrakeException("Error al cerrar la conexion");
			}
		}
	}

	// Buscar videojuego por id
	public VideoJuegos BuscarPorIdJuego(String idJuego) throws KrakeException {
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		VideoJuegos videoJuego = null;

		try {
			con = ConexionBDD.obtenerConexion();
			ps = con.prepareStatement(
					"select id, cedula_persona, nombre, precio::numeric as precio, fecha_compra from videojuegos where id=?");
			ps.setString(1, idJuego);
			rs = ps.executeQuery();
			if (rs.next()) {
				String id = rs.getString("id");
				String cedula_persona = rs.getString("cedula_persona");
				String nombre = rs.getString("nombre");
				BigDecimal precio = rs.getBigDecimal("precio");
				Timestamp fecha_compra = rs.getTimestamp("fecha_compra");
				videoJuego = new VideoJuegos(id, cedula_persona, nombre, precio, fecha_compra);
			} else {
				return null;
			}
		} catch (KrakeException e) {
			e.printStackTrace();
			throw e;
		} catch (SQLException e) {
			e.printStackTrace();
			throw new KrakeException("Error al buscar por ID" + e.getMessage());
		} finally {
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
				throw new KrakeException("Error al cerrar la conexion");
			}
		}
		return videoJuego;
	}

	// Método buscarTodos
	public ArrayList<VideoJuegos> buscarTodos() throws KrakeException {
		ArrayList<VideoJuegos> videojuegos = new ArrayList<>();
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		VideoJuegos juego = null;

		try {
			con = ConexionBDD.obtenerConexion();
			ps = con.prepareStatement(
					"select id, cedula_persona, nombre, precio::numeric as precio, fecha_compra from videojuegos");
			rs = ps.executeQuery();

			while (rs.next()) {
				String id = rs.getString("id");
				String cedula_persona = rs.getString("cedula_persona");
				String nombre = rs.getString("nombre");
				BigDecimal precio = rs.getBigDecimal("precio");
				Timestamp fecha_compra = rs.getTimestamp("fecha_compra");
				juego = new VideoJuegos(id, cedula_persona, nombre, precio, fecha_compra);
				videojuegos.add(juego);
			}
		} catch (KrakeException e) {
			e.printStackTrace();
			throw e;
		} catch (SQLException e) {
			e.printStackTrace();
			throw new KrakeException("Error al buscar todos" + e);
		} finally {
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
				throw new KrakeException("Error al buscar todos" + e.getMessage());
			}
		}
		return videojuegos;
	}
}
