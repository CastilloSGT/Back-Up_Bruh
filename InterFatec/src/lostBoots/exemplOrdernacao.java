package lostBoots;

import java.util.Arrays;

public class exemplOrdernacao {
	public static void main(String[] args) {
		int numero[] = {1,2,2,7,1,3,1,2,1};
		int contador = 0;
		int i, j;
		for(i=0;i<numero.length;i++){
			System.out.println(numero[i]);
			for(j = i+1; j < numero.length;j++){
				System.out.println(numero[j]);
				 if (numero[i] == numero[j]) {
					 System.out.println("O elemento " +numero[i] + " se repete \n");
					 numero[j] = 61 + i;
					 numero[i] = 100 + j;
					 contador++;
				 }
				 System.out.println(Arrays.toString(numero));
			}
			System.out.println(Arrays.toString(numero));
			System.out.println("\n");
		}
		
		System.out.println(contador);
	}
}
