package TrabObjetos;

public class Conta {
	int agencia;
	int numero;
	double saldo;//Double == maior precisão
	
	Conta (){
		
	}
	
	public Conta(int agencia, int numero, double saldo){
		this.agencia = agencia;
		this.numero = numero;
		this.saldo = saldo;
	}
	
	public void depositar(double valor){
		this.saldo += valor;
	}
	
	public void retirar(double valor) {
		this.saldo -= valor;
	}
	
	public double verificarSaldo() {
		return saldo;
	}
	
//	public int getAgencia() {
//		return agencia;
//	}
//
//	public void setAgencia(int agencia) {
//		this.agencia = agencia;
//	}
//
//	public int getNumero() {
//		return numero;
//	}
//
//	public void setNumero(int numero) {
//		this.numero = numero;
//	}
//
//	public double getSaldo() {
//		return saldo;
//	}
//
//	public void setSaldo(double saldo) {
//		this.saldo = saldo;
//	}
	
	
}
