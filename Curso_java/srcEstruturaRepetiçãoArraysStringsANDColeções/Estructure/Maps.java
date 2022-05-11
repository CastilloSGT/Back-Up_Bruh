package Estructure;

import java.awt.color.ICC_ProfileGray;

public class Maps {
	public static void main(String[] args) {
		String nome;
		nome = new String();
		nome = "Buff";
		System.out.println(nome);
		
		String nome2 = new String("Buff2");//declarar, instanciar e inicializar 1 linha
		System.out.println(nome2);
		//um objeto do tipo String() utiliza um pool de memoria para armazenar o conteúdo maça
		String nome3 = "Buff3";//declaração da var tip String e atribuição do Conteúdo
		System.out.println(nome3);
		
		String nome4 = null;
		System.out.println(nome4.length());
		
		String descricao = "Tipo Gala \nA maça mais doce do mercado";
		System.out.println(descricao);
		
		descricao = "Tipo Gala \tA maça mais doce do mercado";
		System.out.println(descricao);
		
		descricao = "Tipo Gala: \"A maça mais doce do mercado\"";
		System.out.println(descricao);
		
		//formas para concatenação de Strings
		String propaganda = nome + " " + descricao;
		System.out.println(propaganda);
		
		propaganda = nome.concat(" ").concat(descricao);
		System.out.println(propaganda);
		
		propaganda += "!";
		System.out.println(propaganda);
		

	}
}
