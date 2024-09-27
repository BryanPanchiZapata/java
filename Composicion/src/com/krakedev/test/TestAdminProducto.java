package com.krakedev.test;

import com.krakedev.composicion.AdminProducto;
import com.krakedev.composicion.Producto;

public class TestAdminProducto {

	public static void main(String[] args) {
		AdminProducto admin = new AdminProducto();
		Producto productoA = new Producto("Deja", 0.80);
		Producto productoB = new Producto("Doritos", 0.80);

		// Método precio mas caro
		Producto mc = admin.buscarMasCaro(productoA, productoB);

		if (mc == null) {
			System.out.println("Los productos tienen el mismo precio");
		} else {
			System.out.println("El más caro es: " + mc.getNombe());
		}

	}

}
