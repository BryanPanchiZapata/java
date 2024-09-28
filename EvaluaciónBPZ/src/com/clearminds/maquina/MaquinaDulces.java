package com.clearminds.maquina;

import com.clearminds.componentes.Celda;
import com.clearminds.componentes.Producto;

public class MaquinaDulces {

	private Celda celda1;
	private Celda celda2;
	private Celda celda3;
	private Celda celda4;
	private double saldo;

	// método configurarMaquina
	public void configurarMaquina(String codigo1, String codigo2, String codigo3, String codigo4) {
		this.celda1 = new Celda(codigo1);
		this.celda2 = new Celda(codigo2);
		this.celda3 = new Celda(codigo3);
		this.celda4 = new Celda(codigo4);
	}

	// método mostrarConfiguracion
	public void mostrarConfiguracion() {
		System.out.println(celda1.getCodigo());
		System.out.println(celda2.getCodigo());
		System.out.println(celda3.getCodigo());
		System.out.println(celda4.getCodigo());
	}

	// método buscarCelda
	public Celda buscarCelda(String codigo) {
		if (celda1.getCodigo() == codigo) {
			return celda1;
		} else if (celda2.getCodigo() == codigo) {
			return celda2;
		} else if (celda3.getCodigo() == codigo) {
			return celda3;
		} else if (celda4.getCodigo() == codigo) {
			return celda4;
		} else {
			return null;
		}
	}

	// método cargarProducto
	public void cargarProducto(Producto producto, String codigo, int cantidadItems) {
		Celda celdaRecuperada = buscarCelda(codigo);
		celdaRecuperada.ingresarProducto(producto, cantidadItems);
	}

	// Método mostrarProductos
	public void mostrarProductos() {

		if (celda1.getProducto() == null) {
			System.out.println("*********CELDA " + celda1.getCodigo());
			System.out.println("Saldo: " + saldo);
			System.out.println("Stock: " + celda1.getStock());
			System.out.println("La celda no tiene Productos!!!");
		} else {
			System.out.println("*********CELDA " + celda1.getCodigo() + "\n" + "Saldo: " + saldo + "\n" + "Stock: "
					+ celda1.getStock() + "\n" + "Nombre Producto: " + celda1.getProducto().getNombre() + "\n"
					+ "Precio Producto: " + celda1.getProducto().getPrecio() + "\n" + "Código: "
					+ celda1.getProducto().getCodigo());
		}
		if (celda2.getProducto() == null) {
			System.out.println("*********CELDA " + celda2.getCodigo());
			System.out.println("Saldo: " + saldo);
			System.out.println("Stock: " + celda2.getStock());
			System.out.println("La celda no tiene Productos!!!");
		} else {
			System.out.println("*********CELDA " + celda2.getCodigo() + "\n" + "Saldo: " + saldo + "\n" + "Stock: "
					+ celda2.getStock() + "\n" + "Nombre Producto: " + celda2.getProducto().getNombre() + "\n"
					+ "Precio Producto: " + celda2.getProducto().getPrecio() + "\n" + "Código: "
					+ celda2.getProducto().getCodigo());
		}
		if (celda3.getProducto() == null) {
			System.out.println("*********CELDA " + celda3.getCodigo());
			System.out.println("Saldo: " + saldo);
			System.out.println("Stock: " + celda3.getStock());
			System.out.println("La celda no tiene Productos!!!");
		} else {
			System.out.println("*********CELDA " + celda3.getCodigo() + "\n" + "Saldo: " + saldo + "\n" + "Stock: "
					+ celda3.getStock() + "\n" + "Nombre Producto: " + celda3.getProducto().getNombre() + "\n"
					+ "Precio Producto: " + celda3.getProducto().getPrecio() + "\n" + "Código: "
					+ celda3.getProducto().getCodigo());
		}
		if (celda4.getProducto() == null) {
			System.out.println("*********CELDA " + celda4.getCodigo());
			System.out.println("Stock: " + celda4.getStock());
			System.out.println("La celda no tiene Productos!!!");
		} else {
			System.out.println("*********CELDA " + celda4.getCodigo() + "\n" + "Saldo: " + saldo + "\n" + "\n"
					+ "Stock: " + celda4.getStock() + "Nombre Producto: " + celda4.getProducto().getNombre() + "\n"
					+ "Precio Producto: " + celda4.getProducto().getPrecio() + "\n" + "Código: "
					+ celda4.getProducto().getCodigo());
		}
		System.out.println("Saldo: " + saldo);
	}

	// Método buscarProductoEnCelda
	public Producto buscarProductoEnCelda(String codigo) {
		if (celda1.getCodigo() == codigo) {
			return celda1.getProducto();
		} else if (celda2.getCodigo() == codigo) {
			return celda2.getProducto();
		} else if (celda3.getCodigo() == codigo) {
			return celda3.getProducto();
		} else if (celda4.getCodigo() == codigo) {
			return celda4.getProducto();
		} else {
			return null;
		}
	}

	// Método consultarPrecio
	public double consultarPrecio(String codigo) {
		if (celda1.getCodigo() == codigo) {
			return celda1.getProducto().getPrecio();
		} else if (celda2.getCodigo() == codigo) {
			return celda2.getProducto().getPrecio();
		} else if (celda3.getCodigo() == codigo) {
			return celda3.getProducto().getPrecio();
		} else if (celda4.getCodigo() == codigo) {
			return celda4.getProducto().getPrecio();
		} else {
			return 0.0;
		}
	}

	// Método buscarCeldaProducto
	public Celda buscarCeldaProducto(String codigoProducto) {
		if (celda1.getProducto() != null && celda1.getProducto().getCodigo() == codigoProducto) {
			return celda1;
		} else if (celda2.getProducto() != null && celda2.getProducto().getCodigo() == codigoProducto) {
			return celda2;
		} else if (celda3.getProducto() != null && celda3.getProducto().getCodigo() == codigoProducto) {
			return celda3;
		} else if (celda4.getProducto() != null && celda4.getProducto().getCodigo() == codigoProducto) {
			return celda4;
		} else {
			return null;
		}
	}

	// método incrementarProductos
	public void incrementarProductos(String codigoProducto, int cantidadItems) {
		Celda celdaEncontrada = buscarCeldaProducto(codigoProducto);
		celdaEncontrada.setStock(celdaEncontrada.getStock() + cantidadItems);
	}

	// Método vender
	public void vender(String codigoCelda) {
		Celda celdaEncontrada = buscarCelda(codigoCelda);
		double valorProducto = celdaEncontrada.getProducto().getPrecio();
		celdaEncontrada.setStock(celdaEncontrada.getStock() - 1);
		saldo = getSaldo() + valorProducto;
		mostrarProductos();
	}

	// método venderConCambio
	public double venderConCambio(String codigoCelda, double valorCliente) {
		Celda celdaEncontrada = buscarCelda(codigoCelda);
		double valorProducto = celdaEncontrada.getProducto().getPrecio();
		celdaEncontrada.setStock(celdaEncontrada.getStock() - 1);
		saldo = getSaldo() + valorProducto;
		return valorCliente - valorProducto;
	}

	// Getters and Setters
	public Celda getCelda1() {
		return celda1;
	}

	public void setCelda1(Celda celda1) {
		this.celda1 = celda1;
	}

	public Celda getCelda2() {
		return celda2;
	}

	public void setCelda2(Celda celda2) {
		this.celda2 = celda2;
	}

	public Celda getCelda3() {
		return celda3;
	}

	public void setCelda3(Celda celda3) {
		this.celda3 = celda3;
	}

	public Celda getCelda4() {
		return celda4;
	}

	public void setCelda4(Celda celda4) {
		this.celda4 = celda4;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

}
