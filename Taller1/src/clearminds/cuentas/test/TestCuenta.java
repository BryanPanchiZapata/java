package clearminds.cuentas.test;

import clearminds.cuentas.Cuenta;

public class TestCuenta {

	public static void main(String[] args) {
		Cuenta cuenta1 = new Cuenta("03476"); // Instanciar el objeto de la clase cuenta cuenta1
		Cuenta cuenta2 = new Cuenta("03476", "C", 98); // Instanciar el objeto de la clase Cuenta cuenta2
		Cuenta cuenta3 = new Cuenta("03476"); // Instanciar el objeto de la clase Cuenta cuenta3
		Cuenta cuenta4 = new Cuenta("0987"); // Instanciar el objeto de la clase Cuenta cuenta4
		Cuenta cuenta5 = new Cuenta("0557", "C", 10); // Instanciar el objeto de la clase Cuenta cuenta5
		Cuenta cuenta6 = new Cuenta("0666"); // Instanciar el objeto de la clase Cuenta cuenta6

		// Setter modificar valor cuenta1
		cuenta1.setSaldo(675);

		// Setter modificar valor cuenta3
		cuenta3.setTipo("C");

		// Setter modificar valores cuenta4
		cuenta4.setSaldo(10);

		// Mostrar los valores
		System.out.println("--------Valores iniciales--------");
		cuenta1.imprimir();
		System.out.println("");
		cuenta2.imprimir();
		System.out.println("");
		cuenta3.imprimir();
		System.out.println("");

		// Setter modificar valor cuenta1
		cuenta1.setSaldo(444);

		// Setter modificar valor cuenta2
		cuenta2.setTipo("D");

		// Setter modificar valor cuenta3
		cuenta3.setSaldo(597);

		// Imprimir valores
		System.out.println("--------Valores Modificados-------");
		cuenta1.imprimir();
		System.out.println("");
		cuenta2.imprimir();
		System.out.println("");
		cuenta3.imprimir();
		System.out.println("");

		// Imprimir valores
		System.out.println("--------Valores con método imprimirConMiEstilo-------");
		cuenta4.imprimirConMiEstilo();
		System.out.println("");
		cuenta5.imprimirConMiEstilo();
		System.out.println("");
		cuenta6.imprimirConMiEstilo();
		System.out.println("");
	}

}
