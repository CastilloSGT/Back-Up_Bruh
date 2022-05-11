package modAcesso;

public class Conta {
	private int agencia;
	protected int numero;  // msm pacote n gera erro
	public double saldo;//Double == maior precis�o
	//Os modificadores s�o palavras-chave que alteram as defini��es de uma calsse, m�todo, atributo ou construtor
	//Existem v�rios tipos de modificadores na linguagem Java, da qual fazem parte: Static, abstract e final
	//Os modificadores de acesso s�o as palavras-chave utilizadas para controlar o acesso a uma classe, vari�vel de inst�ncia, m�todo ou construtor
	//A linguagem Java disponibiliza tr�s modificadores de acesso: public, protected e private
	//Quando nenhum modificador � utilizado, o n�vel de acesso padr�o [default] � utilizado. Esse n�vel de acesso tamb�m � conhecido como package
	
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
