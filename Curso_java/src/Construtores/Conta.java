package Construtores;

public class Conta {
	private int numero;
	private double saldo;
	
	public Conta (){
		
	}
	
	public Conta(int numero) {
		this.numero = numero;
		this.saldo = 0;
	}
	
	public Conta(int numero, double saldo){
		this.numero = numero;
		this.saldo = saldo;
	}
	
	public double recuperarSaldo() {
		return saldo;
	}
	
	public void depositar(double valor) {
		saldo = saldo + valor;
	}
	
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public int getNumero() {
		return numero;
	}
	
	//Podemos construir m�todos especiais, chamados de construtores, que s�o executados automaticamente quando os objetos dessa classe s�o criados. Esses m�todos auxiliam na constru��o do objeto, podendo ser utilizados para inicializar os atributos e/ou chamar m�todos
	//Um m�todo construtor � chamado quando o objeto � constru�do, ou seja, � invocado quando utilizamos a instru��o NEW para criar uma inst�ncia da classe;
	//Os construtores se parecem muito com m�todos comuns, mas t�m tr�s diferen�as b�sicas:
	//Possuem o mesmo nome da classe
	//N�o t�m tipo de retorno (nem mesmo void)
	//N�o podem retornar valor no m�todos usando a instru��o return
}
