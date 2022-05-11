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
	//Sobrecarregar um método significa prover mais de uma versão de um mesmo método
	//As versões devem, necessariamente, conter parâmetros diferentes, seja no tipo ou número deses parâmetros. O tipo d retorno não é relevant
	//Duas características diferenciam os métodos com o mesmo nome: o número de parâmetros e o tipo deles. Essas características fazem parte da assinatura de um método.
	//O uso de vários métodos com o mesmo nome e assinaturas diferentes é chamado de sobrecarga de métodos;
}
