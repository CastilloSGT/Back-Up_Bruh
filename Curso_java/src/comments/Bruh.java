package comments;

public class Bruh {
	//Comment a line
	int agencia;
	int numero;
	double saldo;//Double == more precision
	
	Bruh (){
		
	}
	/*Class Constructor
	 * Class Bruh
	 */
	public Bruh(int agencia, int numero, double saldo){
		this.agencia = agencia;
		this.numero = numero;
		this.saldo = saldo;
	}
	
	/**
	 * Bruh Class Deposit
	 * @param amount to be deposited
	 */
	public void depositar(double valor){
		this.saldo += valor;
	}
	//select torch crlt + shift
	//Documentation comment == /**
	/*
	 * Coment�rios s�o informa��es inclu�das no c�digo-fonte que n�o interferem no programa
	 * � uma forma de melhorar a legibilidade e ajuda os desenvolvedores na organiza��o e no entendimento do c�digo
	 * Podemos utilizar os coment�rios para descrever o que for neces�rio, pois o compilador Java ignora totalmente os coment�rios ao preparar uma ver~soa execut�vel de um programa Java
	 */
}
