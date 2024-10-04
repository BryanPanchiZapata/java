package com.cmc.evaluacion.servicios;

import java.util.ArrayList;

import com.cmc.evaluacion.entidades.Clientes;
import com.cmc.evaluacion.entidades.Prestamo;

public class Banco {
	ArrayList<Prestamo> prestamos = new ArrayList<>();
	ArrayList<Clientes> clientes = new ArrayList<>();

	public ArrayList<Prestamo> getPrestamos() {
		return prestamos;
	}

	public void setPrestamos(ArrayList<Prestamo> prestamos) {
		this.prestamos = prestamos;
	}

	public ArrayList<Clientes> getClientes() {
		return clientes;
	}

	public void setClientes(ArrayList<Clientes> clientes) {
		this.clientes = clientes;
	}

	public Clientes buscarCliente(String cedula) {
		Clientes clienteCedula = null;
		Clientes elementoEncontrado = null;
		for (int i = 0; i < clientes.size(); i++) {
			elementoEncontrado = clientes.get(i);
			if (elementoEncontrado.getCedula().equals(cedula)) {
				clienteCedula = elementoEncontrado;
			}
		}
		return clienteCedula;
	}

	public void registrarCliente(Clientes cliente) {
		for (int i = 0; i < clientes.size(); i++) {
			Clientes elementoEncontrado = clientes.get(i);
			if (cliente.getCedula().equals(elementoEncontrado.getCedula())) {
				System.out.println("Ya existe un cliente con la cédula: " + cliente.getCedula());
				return;
			}
		}

		clientes.add(cliente);
		System.out.println("Cliente registrado con éxito: " + cliente.getNombre() + " " + cliente.getApellido());
	}

	public void asignarPrestamo(String cedulaCliente, Prestamo cedulaPrestamo) {
		Clientes clienteEcontrado = buscarCliente(cedulaCliente);
		if (clienteEcontrado == null) {
			System.out.println("No es cliente del banco");
		} else {
			clienteEcontrado.agregarPrestamo(cedulaPrestamo);

		}
	}

	public ArrayList<Prestamo> buscarPrestamos(String cedula) {
		ArrayList<Prestamo> prestamos = null;
		Clientes cl = buscarCliente(cedula);
		if (cl != null) {
			if (cl.getPrestamos().size() > 0 || cl.getPrestamos() != null) {
				prestamos = cl.getPrestamos();
			} else {
				System.out.println("El cliente no tiene prestamos");
			}
		}
		return prestamos;
	}

}
