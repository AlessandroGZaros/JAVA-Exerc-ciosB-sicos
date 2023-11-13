package entities;

public class Cliente {
	private int numeroConta;
	private String titular;
	private double saldo;
	
	public Cliente(int numConta, String titular, double depositoInicial) {
		this.numeroConta = numConta;
		this.titular = titular;
		deposito(depositoInicial);
	}
	
	public Cliente(int numConta, String titular) {
		this.numeroConta = numConta;
		this.titular = titular;
	}
	public Cliente() {
		
	}

	public int getNumeroConta() {
		return numeroConta;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public double getSaldo() {
		return saldo;
	}

	public void deposito(double valor) {
		saldo = saldo + valor;
	}
	public void saque(double valor) {
		saldo = saldo - valor - 5.00;
	}

	@Override
	public String toString() {
		return  "Conta numero : " 
				+ numeroConta 
				+ "\n"
				+ "Titular : "
				+ titular
				+"\n"
				+ "Saldo : R$ " 
				+ saldo ;}
	}
	
	
	
	
	

