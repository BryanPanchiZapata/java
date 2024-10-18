package com.pokemons.test;

import com.pokemons.AdminProducto;
import com.pokemons.Producto;

public class TestAdminProducto {

	public static void main(String[] args) {
		Producto p1 = new Producto("Doritos", 0.60);
		Producto p2 = new Producto("Papitas", 0.90);
		AdminProducto ad = new AdminProducto();

		Producto mc = ad.masCaro(p1, p2);

		if (mc == null) {
			System.out.println("Productos con el mismo valor");
		} else {
			System.out.println(mc.getNombre());
		}

	}

}
