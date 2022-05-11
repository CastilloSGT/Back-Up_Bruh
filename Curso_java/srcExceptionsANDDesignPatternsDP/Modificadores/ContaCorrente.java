package Modificadores;

import PolimorfismoException.SaldoInsuficienteException;

public abstract class ContaCorrente {
	protected double saldo;
	public static final int BANCC = 33; //Static sera compartilhada por todas as istancias de contaCorrente
	
	public void sacar(double valor) throws SaldoInsuficienteException {
		if (valor > saldo) {
			throw new SaldoInsuficienteException();
		}
		
		saldo = saldo - valor;
	}
	/**
	 * O modificar "static" pode ser aplicado aos membros de uma classe: m�todos e 
	 * atributos.
	Um atributo ou m�todo est�tico s�o compartilhados por todas as inst�ncias de 
	uma determinada classe.
	 */
}
