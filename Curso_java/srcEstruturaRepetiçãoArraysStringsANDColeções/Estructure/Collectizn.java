package Estructure;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Collectizn {
	public static void main(String[] args) {
		//ArrayList
//		ArrayList carrinho = new ArrayList();
//		double valor = 100.3;
//		int valor2 = 1;
//		int valor3;
//		
//		carrinho.add(valor);
//		carrinho.add("Uva");
//		carrinho.add(valor2);
//		
//		System.out.println(carrinho.get(1));
//		
//		valor3 = (int) carrinho.get(2); //Cast
//		System.out.println(valor3);
		
		//============================================================\\
		
		//Interface List e uso de Generics
		//Generics n�o permite tipos primitivos
//		List<String> carrinho1 = new ArrayList<String>();
//		
//		System.out.println(carrinho1.isEmpty());
//		
//		carrinho1.add("Ma�a");
//		carrinho1.add("Morango");
//		carrinho1.add("Uva");
//		carrinho1.set(1,"Pera");
//		
//		System.out.println(carrinho1.isEmpty());
//		System.out.println(carrinho1.size());
		
		//============================================================\\
		
//		List<String> carrinho = new ArrayList<String>();
//		carrinho.add("Ma�a");
//		carrinho.add("Morango");
//		carrinho.add("Ma�a");
//		
//		System.out.println(carrinho.contains("Ma�a"));//return se exist Ma�a
//		System.out.println(carrinho.indexOf("Ma�a"));//return a psi��o da palavra
//		System.out.println(carrinho.get(carrinho.indexOf("Ma�a")));//get busca a palavra ma�a a partir da posi��o indexOf
//		System.out.println(carrinho.lastIndexOf("Ma�a"));//return a ultima ocorrencia da palavra ma�a dentro do arrayList
//		
//		carrinho.remove(carrinho.indexOf("Ma�a"));
//		System.out.println(carrinho.get(0));
//		
//		carrinho.clear();
//		System.out.println(carrinho.isEmpty());
		
		/**
		 * M�todos herdados da interface collections
		add - Adiciona um objeto no set
		clear - remove todos os objetos do set
		contains - verifica se o objeto possui um objeto determinado
		isEmpity - verifica se o set est� vazio
		remove - remove um objeto do set
		size - retorna a quantidade de objetos no set
		toArray - retorna um array contendo os objetos do set
		 */
		
		//============================================================\\
		
//		Set<String> cesta = new HashSet<String>();
//		System.out.println(cesta.isEmpty());//classe hashset n permite dados duplicados
//		cesta.add("Ma�a");
//		cesta.add("Ma�a");
//		cesta.add("ma�a");
//		System.out.println(cesta.isEmpty());
//		
//		System.out.println(cesta.size());
//		System.out.println(cesta);
		
		//============================================================\\
		
//		Map<String, String> caixa = new HashMap<String, String>();
//		caixa.put("m22", "Fernando");
//		caixa.put("m23", "Fernanda");
//		caixa.put("m24", "Pablo");
//		
//		System.out.println(caixa.isEmpty());
//		System.out.println(caixa.size());
//		System.out.println(caixa.containsKey("m22"));
//		System.out.println(caixa.containsValue("Fernando"));
//		System.out.println(caixa);
		
		/**
		 * M�todos herdados da interface MAP
		clear - remove todos os mapeamentos
		containsKey - verifica se uma chave j� est� presente no mapeamento
		containsValue - verifica se um valor j� est� presente no mapeamento
		get - retorna o valor associado a uma chave determinada
		isEmpity - verfica se o mapeamento est� vazio
		kaySet - retorna um set contendo as chaves
		put - adiciona um mapeamento
		remove - remove um mapeamento
		size - retorna o n�mero de mapeamentos
		values - retorna o n�mero de mapeamentos
		 */
		
	}
}
