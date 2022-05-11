package CalcularIMC;

public class User {
	String nome,Bang;
	double peso, altura,IMC;
	
	double CalculaIMC() {
		IMC = peso / (altura*altura);
		return IMC;
	}

	String WhatIF() {
		CalculaIMC();
		if(IMC < 18.5) {
			System.out.println(IMC);
			this.Bang = "Abaixo do peso";
		}else if(IMC >= 18.5 && IMC <= 24.9) {
			this.Bang = "Peso Normal";
		}else if(IMC >= 25 && IMC <= 29.9) {
			this.Bang = "Sobrepeso";
		}else {
			this.Bang = "Obesidade";
		}
		return Bang;
	}
}
