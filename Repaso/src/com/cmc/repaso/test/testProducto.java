package com.cmc.repaso.test;

import com.cmc.repaso.entidades.Producto;

public class testProducto {

	public static void main(String[] args) {
		// Instanciar el objeto
		Producto prod = new Producto("Sneakers", 60);

		// Llamar a los metodos
		prod.calcularPrecioPromo(10);
		prod.setPrecio(-20);

		// imprimir en consola el nombre
		System.out.println("Nombre: " + prod.getNombre());

	}

}
