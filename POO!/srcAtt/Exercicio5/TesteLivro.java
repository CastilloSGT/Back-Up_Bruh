package Exercicio5;

public class TesteLivro {
	public static void main(String[] args) {
		Livro pequenoPrincipe = new Livro("O Pequeno Pr�ncipe");
		pequenoPrincipe.setQtPags(98);
		pequenoPrincipe.ToString();
		pequenoPrincipe.setPgLds(20);
		pequenoPrincipe.verificarProgresso();
		pequenoPrincipe.setPgLds(50);
		pequenoPrincipe.verificarProgresso();
		
		Livro meuLivro = new Livro("Bruh", 100, 12);
		meuLivro.ToString();
		
		System.out.println("Sa�l Gabriel Castillo Tercero");
	}
}
