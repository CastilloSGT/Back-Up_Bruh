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
	 *  formas". Na programa��o orientada a objetos, polimorfismo significa ter m�lti
	 *  plos comportamentos.
	Um m�todo polim�rfico resulta em diferentes a��es dependendo do objeto que est� 
	sendo refenrenciado. A capacidade polim�rfica decorre diretamente da heran�a, 
	pois permite que uma vari�vel de refer�ncia e o objeto sejam diferentes.
	Com o polimorfismo, � poss�vel escrever um c�digo que n�o tenha que ser alterado 
	quandos novos tipo de subclasse forem introduzidos no sistema. Por�m, a utiliza
	��o mais importante do polimorfismo se d� quando dois objetos, sendo um da super
	classe e outro da subclasse, executam a��es diferentes quando o mesmo m�todo � 
	invocado.
	 */
}
