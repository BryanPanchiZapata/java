package com.clearminds.test;

import java.util.ArrayList;

import com.clearminds.componentes.Celda;
import com.clearminds.componentes.Producto;
import com.clearminds.maquina.MaquinaDulces;

public class TestBuscarMenores {

	public static void main(String[] args) {
		MaquinaDulces maquina = new MaquinaDulces();
		maquina.agregarCelda(new Celda("A1"));
		maquina.agregarCelda(new Celda("A2"));
		maquina.agregarCelda(new Celda("B1"));
		maquina.agregarCelda(new Celda("B2"));
		maquina.agregarCelda(new Celda("C1"));
		maquina.agregarCelda(new Celda("C2"));
		maquina.agregarCelda(new Celda("D1"));

		Producto productos = new Producto("Papitas", 0.85);
		maquina.cargarProducto(productos, "A1", 0);
		Producto productos1 = new Producto("Doritos", 0.5);
		maquina.cargarProducto(productos1, "A2", 0);
		Producto productos2 = new Producto("Jet", 0.25);
		maquina.cargarProducto(productos2, "B1", 0);
		Producto productos3 = new Producto("DeTodito", 0.65);
		maquina.cargarProducto(productos3, "B2", 0);
		Producto productos4 = new Producto("Galletas", 0.10);
		maquina.cargarProducto(productos4, "C1", 0);
		Producto productos5 = new Producto("Chitos", 0.90);
		maquina.cargarProducto(productos5, "C2", 0);
		Producto productos6 = new Producto("Caramelos", 8.15);
		maquina.cargarProducto(productos6, "D1", 0);

		ArrayList<Producto> menorPrecio = maquina.buscarMenores(10);
		if (menorPrecio != null) {
			System.out.println("PRODUCTOS MENORES: " + menorPrecio.size());
			maquina.mostrarProductosPrecio();
		} else {
			System.out.println("Todos los productos son mayores");
		}

	}

}
