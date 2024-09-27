package com.krakedev.clearminds.test;

import com.krakedev.clearminds.componentes.Producto;

public class prueba {

	public static void main(String[] args) {
		// Instanciar los objetos de la calse Producto
		Producto prod = new Producto("cama", 0.50, "098");
		Producto prod1 = new Producto("sneakers", 90, "098");

		// Llamo al métdo incrementoPrecio
		prod.incrementoPrecio(10);
		// Imprimir el valor de incremneto precio
		System.out.println("Precio con incremento: " + prod.getPrecio());

		// Llamo al método disminuirPrecio
		prod1.disminuirPrecio(20);
		// Imprimir el valor disminuirPrecio
		System.out.println("Precio con descuento: " + prod1.getPrecio());

	}

}
