package Exercicio1;

public class TestePessoa {
	public static void main(String[] args) {
//		Pessoa ps = new Pessoa("Gabriel","11/22/2002",1.74f);
//		
//		System.out.println(ps.toString());
//		
//		System.out.println(ps.calcularIdade());
		System.out.println("Saúl Gabriel Castillo Tercero");
		PessoaZ sc = new PessoaZ("Julinho","2003-03-01", 1.5f);
		sc.calculaIdade();
		PessoaZ c = new PessoaZ("Julinho","02-05-2002", 1.5f);
		c.calculaIdade();
	}
}
