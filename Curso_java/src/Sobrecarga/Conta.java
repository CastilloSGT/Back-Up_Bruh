package Sobrecarga;

public class Conta {
	double saldo;
	
	public void retirar(double valor) {
		saldo -= valor;
	}
	
	public void retirar(double valor, double taxa) {
		saldo = saldo - valor - taxa;
	}
	
	//int agencia;
	//this. palavra reservada do java, pode ser usada para diferenciar o atributo
	//Sobrecarregar um m�todo significa prover mais de uma vers�o de um mesmo m�todo
	//As vers�es devem, necessariamente, conter par�metros diferentes, seja no tipo ou n�mero deses par�metros. O tipo d retorno n�o � relevant
	//Duas caracter�sticas diferenciam os m�todos com o mesmo nome: o n�mero de par�metros e o tipo deles. Essas caracter�sticas fazem parte da assinatura de um m�todo.
	//O uso de v�rios m�todos com o mesmo nome e assinaturas diferentes � chamado de sobrecarga de m�todos;
}
