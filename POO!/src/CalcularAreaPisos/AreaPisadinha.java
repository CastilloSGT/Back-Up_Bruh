package CalcularAreaPisos;

public class AreaPisadinha {
	double lrg, alt;
	double lrgT, altT;
	double largura, altura;
	double quantPec,pso;
	double valorFinal;
	
	void CalculaPiso() {
		pso = lrg * alt;
	}
	
	double CalculaExato() {
		largura = lrgT / lrg;
		largura = Math.round(largura);
		System.out.println(largura);
		altura = altT / alt;
		System.out.println(altura);
		altura = Math.round(altura);
		System.out.println(altura);
		quantPec = altura * largura;
		CalculaPiso();
		
		return valorFinal = quantPec * pso;
	}

}
