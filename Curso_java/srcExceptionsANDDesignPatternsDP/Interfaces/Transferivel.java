package Interfaces;

public interface Transferivel {
	public boolean realizarDoc(int nrBanco, int nrAgencia, int nrConta, double valor);
	
	public boolean realizarTed(int nrBanco, int nrAgencia, int nrConta, double valor);

	default boolean realizarTransferenciaInterna(int nrAgenciaDestino, int nrContaDestino, double valor) {
		//regra de negocio
		return true;
	}
	
	/**
	 * "Interface" define um conjunto de requisitos para as classes implementá-las. 
	 * Uma "Interface" não é uma classe.
	Quando uma classe implementa uma "Interface" ela está comprometida a fornecer 
	todos os comportamentos definidos na "Interface".
	Assim como as classes, uma "Interface" pode ser composta por atributos´e métodos.
	 Porém, como ela não é instanciada, não apresenta construtores.
	 */
}
