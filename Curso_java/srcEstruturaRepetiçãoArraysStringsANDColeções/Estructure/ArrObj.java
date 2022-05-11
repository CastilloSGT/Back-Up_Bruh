package Estructure;

import Produt.Produto;

public class ArrObj {
	public static void main(String[] args) {
		Produto[] prod = new Produto[2];
		Produto pt1 = new Produto();
		pt1.setNome("Limão");
		pt1.setDescricao("Galego");
		pt1.setValor(10.1f);
		
		Produto pt2 = new Produto();
		pt2.setNome("Maça");
		pt2.setDescricao("Gala");
		pt2.setValor(5.10f);
		
		prod[0] = pt1;
		prod[1] = pt2;
		
//		for (int i = 0; i < prod.length; i++) {
//			System.out.println(prod[i].toString());
//		}
//		for (Produto produto : prod) {
//			System.out.println(produto.toString());
//		}

		Produto [][] localizProduto = new Produto [10][3];
		
		localizProduto[0][1] = pt1;
		localizProduto[1][1] = pt2; 
		
		System.out.println(localizProduto[0][1].getNome());
	}
}
