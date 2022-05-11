package Estructure;

import java.util.Arrays;

public class MetodosStrings {
	public static void main(String[] args) {
//		String nome = new String("Maça");
//		String nome1 = new String("maça");
//		String nome2 = new String("Maça");
//		
//		System.out.println(nome.equals(nome1));//false
//		
//		System.out.println(nome.equalsIgnoreCase(nome1));//true
//		
//		System.out.println(nome.equals(nome2));//true
//		
//		boolean teste = (nome == nome2);//comparando a posição dela em determinado lugar da memória
//		System.out.println(teste);//false
//		
//		String nome3 = "maça";
//		String nome4 = "maça";
//		
//		teste = (nome4 == nome3);//Pool de memória: ambas estão em um msm endereço de memória
//		System.out.println(teste);//true
		
//		String text =
//				new String("Maça Gala, a maça mais doce do mercado!");
//		
//		System.out.println(text.charAt(3));
//		System.out.println(text.indexOf("G"));
//		System.out.println(text.indexOf("Gala"));
//		System.out.println(text.lastIndexOf("a"));
		
//		String descricao = new String("Maça Gala, a maça mais doce do mercado!");
//		
//		System.out.println(descricao.replace("G", "g"));
//		System.out.println(descricao.replace("Gala", "Fuji"));
//		System.out.println(descricao.replace("a", "A"));
//		
//		System.out.println(descricao.split(" ").length);
//		int n = descricao.split("").length;
//		//System.out.println(n);
//		System.out.println(Arrays.toString(descricao.split(" ")));
		
		String descricao = new String("Maça Gala, a maça mais doce do mercado!");
		
		System.out.println(descricao.toUpperCase());
		System.out.println(descricao.toLowerCase());
		
		System.out.println(descricao.substring(0, 4));
		System.out.println(descricao.substring(4));
		
		System.out.println(descricao.substring(descricao.indexOf("Maça"), descricao.indexOf(" ")));
		System.out.println(descricao);
	}
}
