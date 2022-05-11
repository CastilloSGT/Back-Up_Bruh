package a;

import java.util.Scanner;

public class tsxA {
	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		a aobah = new a();
		aobah.ao = x.next();
		//aobah.aobah();
		
		double temp,a=0,b=0;
		System.out.println("Digite temperatura: ");
		temp = x.nextDouble();
		aobah.calc(a, b, temp);
	}
}
