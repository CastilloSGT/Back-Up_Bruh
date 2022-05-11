package POO;

public class TesteConta {
	public static void main(String[] args) {
		//Conta cc = new Conta(1, "Z� paulo", 100,"CP");
		//Conta cc1 = new Conta(2, "Geovaninha", 0,"CV");
		ContaCorrente cc = new ContaCorrente(1, "Drogado", 100);
		ContaPoupanca cc1 = new ContaPoupanca(1, "Geovaninha", 0);
		cc.saldo();
		cc.depositar(50);
		cc.saldo();
		cc.retirar(50);
		cc.saldo();
		cc.transferir(100, cc1);
		cc1.saldo();
		cc.saldo();
	}
}
