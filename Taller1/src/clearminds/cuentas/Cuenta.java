package clearminds.cuentas;

public class Cuenta {
	private String id;
	private String tipo = "A";
	private double saldo;

	// Construtores
	public Cuenta(String id) {
		this.id = id;
	}

	public Cuenta(String id, String tipo, double saldo) {
		this.id = id;
		this.tipo = tipo;
		this.saldo = saldo;
	}

	// Método para imprimir
	public void imprimir() {
		System.out.println("****************");
		System.out.println("");
		System.out.println("CUENTA");
		System.out.println("");
		System.out.println("****************");
		System.out.println("");
		System.out.println("Numero de cuenta: " + this.id);
		System.out.println("Tipo: " + this.tipo);
		System.out.println("Saldo: " + this.saldo);
		System.out.println("");
		System.out.println("****************");
	}

	// Método imprimirConMiEstilo
	public void imprimirConMiEstilo() {
		System.out.println("==========================");
		System.out.println("           BANCO          ");
		System.out.println("==========================");
		System.out.println("     ESTADO DE CUENTA     ");
		System.out.println("--------------------------");
		System.out.println("");
		System.out.println("Numero de cuenta: " + this.id);
		System.out.println("Tipo: " + this.tipo);
		System.out.println("Saldo: " + this.saldo);
		System.out.println("");
		System.out.println("--------------------------");
		System.out.println("GRACIAS POR SU CONFIANZA :)");
		System.out.println("==========================");
	}

	// Getter and Setter
	public String getId() {
		return id;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

}
