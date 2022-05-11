package JAVADOC;
/**
 * Classe que abstrai uma Conta Banc�ria
 * @author Gabriel zin
 * @version 1.0
 */
public class Conta {
	int agencia;
	int numero;
	double saldo;
	
	Conta (){
		
	}
	
	public Conta(int agencia, int numero, double saldo){
		this.agencia = agencia;
		this.numero = numero;
		this.saldo = saldo;
	}
	
	/**
	 * Acrescenta valor ao Saldo da Conta
	 * @param valor que ser� depositado
	 */
	public void depositar(double valor){
		this.saldo += valor;
	}
	
	/**
	 * Retira um valor do Saldo da Conta
	 * @param valor que ser� retirado
	 * @see depositar 
	 */
	public void retirar(double valor) {
		this.saldo -= valor;
	}
	
	/**
	 * Verifica o saldo da Conta
	 * @return Valor do saldo da Conta
	 */
	public double verificarSaldo() {
		return saldo;
	}
}
