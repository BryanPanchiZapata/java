package clearminds.cuentas;

public class Cuenta {
	private String id;
	private String tipo = "A";
	private double saldo;
	
	//Continuar con los Construtores
	

	
	// Los getter y setter ya estan definidos
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
