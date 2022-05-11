package Metodos;

public class Conta {
	//Metodos: Os programas em Java são escritos combinando métodos e classes que são predefinidos na API do Java (Java Application Programming Interface ou bibliotecas de classes Java). Em construções de grandes softwares, são criadas em classes pequenas partes de código, que são identificados como métodos.
	//<modificador><tipo de retorn><nomeDoMetodo>([lista de argumentos])
	//lowerCamelCase começar com letras min e verbos ou substantivos em main
	double saldo;
	
	public double recuperarSaldo() {
		return saldo;
	}
	public void depositar(int agencia, String nConta, double valor) {
		saldo += valor;
	}
	
	//Métodos definem os comportamentos que o objeto possui. O comportamento pode ser entendido como uma ação ou serviço
	//Podemos definir um mértodo como um comportamento específico, residente no objeto, que define como ele deve agir quando exigido, definindo assim as habilidades do objeto;
}
