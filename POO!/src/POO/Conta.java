package POO;

public class Conta {
	protected int nConta;
	protected String titular;
	protected double saldo;
	protected String tipoConta;
	
	/**Class construtor 
	 * Recebe todos os parametros
	 * @param nConta
	 * @param titular
	 * @param saldo
	 */
	Conta(int nConta, String titular, double saldo){
		this.nConta = nConta;
		this.saldo = saldo;
		this.titular = titular;
	}
	
	//Getter and Setts
	public int getnConta() {
		return nConta;
	}
	public void setnConta(int nConta) {
		this.nConta = nConta;
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
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	/**
	 * Método Depositar
	 * @param valor a ser depositado
	 */
	void depositar(double valor) {
		if(valor > 0){
			double aux = getSaldo() + valor;
			setSaldo(aux);
		}
	}
	
	/**
	 * Método Retirar
	 * @param valor a ser retirado de Saldo
	 * @throws Exception 
	 */
	public void retirar(double valor) throws Exception {
		double aux = 0; 
		if(valor>this.saldo) {
			throw new Exception("Saldo insuficiente");
		}
		
		switch (this.tipoConta) {
		case "CP": aux = getSaldo() - valor + 3.5;
			
			break;
			
		case "CC": aux = getSaldo() - valor;
			
			break;

		default:
			break;
		}
		
		setSaldo(aux);
	}
	
	//saldo
	public void saldo() {
		System.out.println(getSaldo());
	}
	
	//transferir
	void transferir(double valor, Conta dest) throws Exception {
		dest.depositar(valor);
		retirar(valor);
	}
	
	public String toString() {
		return "Conta [nConta = "+ nConta + ", titular = "+ titular + ", saldo = "+saldo+"]";
	}
}
