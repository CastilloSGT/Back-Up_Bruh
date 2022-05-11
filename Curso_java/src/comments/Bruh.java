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
	 * Comentários são informações incluídas no código-fonte que não interferem no programa
	 * É uma forma de melhorar a legibilidade e ajuda os desenvolvedores na organização e no entendimento do código
	 * Podemos utilizar os comentários para descrever o que for necesário, pois o compilador Java ignora totalmente os comentários ao preparar uma ver~soa executável de um programa Java
	 */
}
