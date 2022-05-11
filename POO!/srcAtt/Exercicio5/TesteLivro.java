package Exercicio5;

public class TesteLivro {
	public static void main(String[] args) {
		Livro pequenoPrincipe = new Livro("O Pequeno Príncipe");
		pequenoPrincipe.setQtPags(98);
		pequenoPrincipe.ToString();
		pequenoPrincipe.setPgLds(20);
		pequenoPrincipe.verificarProgresso();
		pequenoPrincipe.setPgLds(50);
		pequenoPrincipe.verificarProgresso();
		
		Livro meuLivro = new Livro("Bruh", 100, 12);
		meuLivro.ToString();
		
		System.out.println("Saúl Gabriel Castillo Tercero");
	}
}
