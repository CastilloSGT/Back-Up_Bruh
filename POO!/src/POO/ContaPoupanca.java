package POO;

public class ContaPoupanca extends Conta{
	public ContaPoupanca(int nConta, String titular, double saldo) {
		super(nConta, titular, saldo);
		this.saldo += 100;
		this.nConta = nConta;
		this.titular = titular;
		this.tipoConta = "CP";
	}
}
