package Classes;

public class TesteConta {
	public static void main(String[] args) {
		Conta cc = new Conta();//gerar o objeto em memoria
		cc.numero = 1;
		cc.saldo = 100;
		cc.cliente.nome = "Raul";
		cc.cliente.idade = 19;
	}
}
