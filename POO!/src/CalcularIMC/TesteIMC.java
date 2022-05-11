package CalcularIMC;

import java.util.Scanner;

public class TesteIMC {
	public static void main(String[] args) {
		Scanner sx = new Scanner(System.in);
		User usuario = new User();
		//System.out.println("Digite seu nome: ");
		//usuario.nome = "Rodolpho";
		System.out.println("Digite seu peso: Exem(85,1)");
		usuario.peso = sx.nextDouble();
		System.out.println("Digite sua altura: Exem(1,7)");
		usuario.altura = sx.nextDouble();
		System.out.println(usuario.WhatIF());
	}
}