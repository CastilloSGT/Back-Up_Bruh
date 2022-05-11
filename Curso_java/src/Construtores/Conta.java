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
	
	//Podemos construir métodos especiais, chamados de construtores, que são executados automaticamente quando os objetos dessa classe são criados. Esses métodos auxiliam na construção do objeto, podendo ser utilizados para inicializar os atributos e/ou chamar métodos
	//Um método construtor é chamado quando o objeto é construído, ou seja, é invocado quando utilizamos a instrução NEW para criar uma instância da classe;
	//Os construtores se parecem muito com métodos comuns, mas têm três diferenças básicas:
	//Possuem o mesmo nome da classe
	//Não têm tipo de retorno (nem mesmo void)
	//Não podem retornar valor no métodos usando a instrução return
}
