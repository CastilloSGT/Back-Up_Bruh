package Estructure;

public class lacos_Rep {
	public static void main(String[] args) {
		int quat= 5;
		int registro = 0;
		
		while(registro < quat) {
			registro++;
			System.out.println("O produto n�mero: "+ registro + " foi registrado");
		}
		
		do {
			registro++;
			System.out.println("O produto n�mero: "+ registro + " foi registrado");
		} while (registro < quat);
		//la�os doWhile and While s�o mais usados quando n sabemos o num total de rep
		
		for (int i = 0; i < quat; i++) {
			System.out.println("O caixa registrou o produto: "+i);
		}
	}
}
