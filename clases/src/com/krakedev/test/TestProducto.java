package com.krakedev.test;

import com.krakedev.Producto;

public class TestProducto {

	public static void main(String[] args) {
		Producto productoA = new Producto("Paracetamol", "Producto Farmacia", 0.80, 900); // instancio el objeto Producto y referencio a la variable
		Producto productoB = new Producto("Alcóhol", "Producto", 1.60, 300); // instancio el objeto Producto y referencio a la variable																			
		Producto productoC = new Producto("Ibuproféno", "Producto", 2.30, 100); // instancio el objeto Producto y referencio a la variable
																				 

		// Set modificar valores
		productoA.setNombre("Pedialyte");
		productoA.setDescripcion("Producto para mejorar la hidratación");
		productoA.setPrecio(3.60);
		productoA.setStockActual(60);

		// Setter modificar
		productoB.setNombre("Finalin");
		productoB.setDescripcion("Al dolor ponle fin");
		productoB.setPrecio(1.10);
		productoB.setStockActual(130);

		// Settter modificar
		productoC.setNombre("Curitas");
		productoC.setDescripcion("Producto para protejer una herida pequeña");
		productoC.setPrecio(0.30);
		productoC.setStockActual(300);

		System.out.println("-----productoA-----");
		// Getter recuperar
		System.out.println("Nombre: " + productoA.getNombre());
		System.out.println("Descripción: " + productoA.getDescripcion());
		System.out.println("Precio: " + productoA.getPrecio());
		System.out.println("Stock Actual: " + productoA.getStockActual());

		System.out.println("-----productoB-----");
		// Getter recuperar
		System.out.println("Nombre: " + productoB.getNombre());
		System.out.println("Descripción: " + productoB.getDescripcion());
		System.out.println("Precio: " + productoB.getPrecio());
		System.out.println("Stock Actual: " + productoB.getStockActual());

		System.out.println("-----productoC-----");
		// Getter recuperar
		System.out.println("Nombre: " + productoC.getNombre());
		System.out.println("Descripción: " + productoC.getDescripcion());
		System.out.println("Precio: " + productoC.getPrecio());
		System.out.println("Stock Actual: " + productoC.getStockActual());
	}

}
