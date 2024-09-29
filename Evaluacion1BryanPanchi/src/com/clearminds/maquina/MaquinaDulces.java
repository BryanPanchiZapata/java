package com.clearminds.maquina;

import java.util.ArrayList;

import com.clearminds.componentes.Celda;
import com.clearminds.componentes.Producto;

public class MaquinaDulces {
	private ArrayList<Celda> celdas;
	private double saldo;

	public MaquinaDulces() {
		celdas = new ArrayList<>();
	}

	public void agregarCelda(Celda codigo) {
		celdas.add(codigo);
	}

	public void mostrarConfiguracion() {
		Celda elementoCelda = null;
		for (int i = 0; i < celdas.size(); i++) {
			elementoCelda = celdas.get(i);
			System.out.println("Celda" + (i + 1) + ":" + elementoCelda.getCodigo());
		}
	}

	public Celda buscarCelda(String codigo) {
		Celda celdaEncontrada = null;
		Celda elementoCelda = null;
		for (int i = 0; i < celdas.size(); i++) {
			elementoCelda = celdas.get(i);
			if (codigo.equals(elementoCelda.getCodigo())) {
				celdaEncontrada = elementoCelda;
			}

		}
		return celdaEncontrada;
	}

	public void cargarProducto(Producto producto, String celda, int items) {
		Celda celdaRecuperada = buscarCelda(celda);
		celdaRecuperada.ingresarProducto(producto, items);
	}

	public void mostrarProductos() {

		for (int i = 0; i < celdas.size(); i++) {
			Celda elementoCelda = celdas.get(i);

			if (elementoCelda.getProducto() == null) {
				System.out.println("Celda:" + elementoCelda.getCodigo() + " Stock:" + elementoCelda.getStock() + " "
						+ "Sin Producto asignado");
			} else {
				System.out.println("Celda:" + elementoCelda.getCodigo() + " Stock:" + elementoCelda.getStock() + " "
						+ "Producto: " + elementoCelda.getProducto().getNombre() + " "
						+ elementoCelda.getProducto().getPrecio());
			}

		}

	}

	public Celda buscarProductoEnCelda(String codigo) {
		Celda celdaEncontrada = null;
		Celda elementoEncontrado = null;
		for (int i = 0; i < celdas.size(); i++) {
			elementoEncontrado = celdas.get(i);
			if (codigo.equals(elementoEncontrado.getCodigo())) {
				celdaEncontrada = elementoEncontrado;
			} else {
				return null;
			}
		}
		return celdaEncontrada;
	}
}
