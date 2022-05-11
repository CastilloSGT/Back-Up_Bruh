package Modificadores;

import PolimorfismoException.SaldoInsuficienteException;

public class Teste {
	public static void main(String[] args) {
		ContaCorrente conta = new ContaCorrenteEspecial();
		try {
			conta.sacar(20);
		}catch (SaldoInsuficienteException e) {
			e.printStackTrace();
		}
	}
	/**
	 * Polimorfismo significa "qualidade ou estado de ser capaz de assumir diferentes
	 *  formas". Na programação orientada a objetos, polimorfismo significa ter múlti
	 *  plos comportamentos.
	Um método polimórfico resulta em diferentes ações dependendo do objeto que está 
	sendo refenrenciado. A capacidade polimórfica decorre diretamente da herança, 
	pois permite que uma variável de referência e o objeto sejam diferentes.
	Com o polimorfismo, é possível escrever um código que não tenha que ser alterado 
	quandos novos tipo de subclasse forem introduzidos no sistema. Porém, a utiliza
	ção mais importante do polimorfismo se dá quando dois objetos, sendo um da super
	classe e outro da subclasse, executam ações diferentes quando o mesmo método é 
	invocado.
	 */
}
