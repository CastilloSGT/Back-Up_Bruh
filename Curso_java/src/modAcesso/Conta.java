package modAcesso;

public class Conta {
	private int agencia;
	protected int numero;  // msm pacote n gera erro
	public double saldo;//Double == maior precisão
	//Os modificadores são palavras-chave que alteram as definições de uma calsse, método, atributo ou construtor
	//Existem vários tipos de modificadores na linguagem Java, da qual fazem parte: Static, abstract e final
	//Os modificadores de acesso são as palavras-chave utilizadas para controlar o acesso a uma classe, variável de instância, método ou construtor
	//A linguagem Java disponibiliza três modificadores de acesso: public, protected e private
	//Quando nenhum modificador é utilizado, o nível de acesso padrão [default] é utilizado. Esse nível de acesso também é conhecido como package
	
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
}
