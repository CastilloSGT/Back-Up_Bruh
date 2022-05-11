package CalcularAreaRetangulo;

import java.util.Scanner;

public class TesteRetangulo {
	public static void main(String[] args) {
		Scanner sx = new Scanner(System.in);
		CalcRetangulo area = new CalcRetangulo();
		
		System.out.println("Digita a base do Retangulo:");
		area.base = sx.nextDouble();
		
		System.out.println("Digita a altura do Retangulo:");
		area.altura = sx.nextDouble();
		System.out.println("Deseja calc: Area de um Retangulo[1], Perimetro de um Retangulo[2], Diagonal de um Retangulo[3]");
		area.verifica = sx.nextInt();
		
		area.Verificar();
	}
}
