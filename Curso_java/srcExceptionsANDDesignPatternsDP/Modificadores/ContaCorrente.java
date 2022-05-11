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
	 * O modificar "static" pode ser aplicado aos membros de uma classe: métodos e 
	 * atributos.
	Um atributo ou método estático são compartilhados por todas as instâncias de 
	uma determinada classe.
	 */
}
