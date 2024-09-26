package com.cmc.repaso.test;

import com.cmc.repaso.entidades.Item;

public class testItem {

	public static void main(String[] args) {
		Item item = new Item();
		Item item1 = new Item();

		// setter modificar valor nombre
		item.setNombre("Hoodie");
		System.out.println(item.getNombre());
		// Llamar a los métodos
		item.vender(10);
		item.devolver(5);
		item.imprimir();
		item.setProductosActuales(20);
		System.out.println("-------Producto 2-------");
		// setter modificar valor nombre
		item.setNombre("Sneakers");
		System.out.println(item.getNombre());
		// Llamar a los métodos
		item.vender(10);
		item.devolver(5);
		item.imprimir();
		item.setProductosActuales(40);
	}

}
