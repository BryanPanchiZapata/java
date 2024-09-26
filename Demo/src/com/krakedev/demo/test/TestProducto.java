package com.krakedev.demo.test;

import com.krakedev.demo.Producto;

public class TestProducto {

	public static void main(String[] args) {
		Producto prod = new Producto(1230, "Azúcar");
		
		//Setter modificar valores
		prod.setDescripcion("Producto");
		prod.setPeso(20.8);
		
		// Getter recuperar los valores
		System.out.println("Codigo: " + prod.getCodigo());
		System.out.println("Nombre: " + prod.getNombre());
		System.out.println("Descripcion: " + prod.getDescripcion());
		System.out.println("Peso: " + prod.getPeso());

	}

}
