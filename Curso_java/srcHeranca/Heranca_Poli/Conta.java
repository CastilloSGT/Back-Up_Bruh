package Heranca_Poli;

public class Conta {

	//private static final long serialVersionUID = 1l;
	
	private int agencia;
	private int numero;
	private double saldo;
	
	public Conta() {
		
	}
	
	public Conta(int agencia, int numero, double saldo) {
		this.agencia = agencia;
		this.numero = numero;
		this.saldo = saldo;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	/**
	 * Acrescenta valor ao Saldo da Conta
	 * @param valor que será depositado
	 */
	public void depositar(int valor) {
		this.saldo += valor;
	}
	
	/**
	 * Retira um valor do Saldo da Conta
	 * @param valor que será retirado
	 * @see depositar
	 */
	public void retirar(double valor) {
		this.saldo -= valor;
	}
	
	/**
	 * Verifica o Saldo da Conta
	 * @return Valor do Saldo da Conta
	 */
	public double getSaldo() {
		return this.saldo;
	}
}
