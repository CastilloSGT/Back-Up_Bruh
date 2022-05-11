package Metodos;

public class Conta {
	//Metodos: Os programas em Java s�o escritos combinando m�todos e classes que s�o predefinidos na API do Java (Java Application Programming Interface ou bibliotecas de classes Java). Em constru��es de grandes softwares, s�o criadas em classes pequenas partes de c�digo, que s�o identificados como m�todos.
	//<modificador><tipo de retorn><nomeDoMetodo>([lista de argumentos])
	//lowerCamelCase come�ar com letras min e verbos ou substantivos em main
	double saldo;
	
	public double recuperarSaldo() {
		return saldo;
	}
	public void depositar(int agencia, String nConta, double valor) {
		saldo += valor;
	}
	
	//M�todos definem os comportamentos que o objeto possui. O comportamento pode ser entendido como uma a��o ou servi�o
	//Podemos definir um m�rtodo como um comportamento espec�fico, residente no objeto, que define como ele deve agir quando exigido, definindo assim as habilidades do objeto;
}
