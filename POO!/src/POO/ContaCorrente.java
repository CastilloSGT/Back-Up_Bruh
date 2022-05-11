package POO;

public class ContaCorrente extends Conta{
	public ContaCorrente(int nConta, String titular, double saldo) {
		super(nConta, titular, saldo);
		this.nConta = nConta;
		this.titular = titular;
		this.tipoConta = "CC";
	}
	
	public void transferir(double valor, Conta dest) {
		dest.depositar(valor);
		super.saldo -= 5.50;
	}
	
	public void retirar(double valor) {
		double aux = getSaldo() - (valor + 3.50);
		setSaldo(aux);
	}
}
