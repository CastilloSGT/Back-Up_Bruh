package Interfaces;

public interface Transferivel {
	public boolean realizarDoc(int nrBanco, int nrAgencia, int nrConta, double valor);
	
	public boolean realizarTed(int nrBanco, int nrAgencia, int nrConta, double valor);

	default boolean realizarTransferenciaInterna(int nrAgenciaDestino, int nrContaDestino, double valor) {
		//regra de negocio
		return true;
	}
	
	/**
	 * "Interface" define um conjunto de requisitos para as classes implement�-las. 
	 * Uma "Interface" n�o � uma classe.
	Quando uma classe implementa uma "Interface" ela est� comprometida a fornecer 
	todos os comportamentos definidos na "Interface".
	Assim como as classes, uma "Interface" pode ser composta por atributos�e m�todos.
	 Por�m, como ela n�o � instanciada, n�o apresenta construtores.
	 */
}
