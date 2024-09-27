package com.clearminds.test;

import com.clearminds.componentes.Celda;

public class TestCelda {
	public static void main(String[] args) {
		Celda celda = new Celda("A1");
		System.out.println(celda.getProducto().getNombre());
		// El error radico en la linea 8, en la clase Producto ya que estoy llamando
		// a atributos nullos.
		// Es decir utilizo la variable celda para acceder a los atributos de la clase
		// Producto
		// pero mantienes valores nulos, estoy apuntando a null y estoy tratando de
		// invocar a un método que no existe.

		System.out.println("CELDA:" + celda.getProducto());
		System.out.println("Nombre Producto:" + celda.getProducto().getNombre());
		System.out.println("Precio Producto:" + celda.getProducto().getPrecio());
		System.out.println("C�digo Producto:" + celda.getProducto().getCodigo());
		System.out.println("STOCK:" + celda.getStock());
		System.out.println("*************************************");

	}
}
