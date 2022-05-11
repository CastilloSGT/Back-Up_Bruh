package CalcularAreaRetangulo;

public class CalcRetangulo {
	//dados de um retangulo
	double altura, base,valorFinal;
	int verifica;
	
	void Verificar() {
		switch (verifica) {
		case 1: System.out.println("Area total é igual "+ areaRetangulo(altura, base)); 	
			break;
			
		case 2: System.out.println("Perimetro total é igual "+ perimetroRetangulo(altura, base)); 
			break;
		
		case 3: System.out.println("Diagonal total é igual "+ diagonalRetangulo(altura, base)); 
			break;

		default: System.out.println("Valor und");
			break;
		}
	}
	
	double areaRetangulo(double ltura, double base){
		valorFinal = altura * base;
		return valorFinal;
	}
	
	double perimetroRetangulo(double altura, double base) {
		valorFinal = 2 *(base+altura);
		return valorFinal;
	}
	
	double diagonalRetangulo(double base, double altura) {
		valorFinal = (base * base) + (altura * altura);
		valorFinal = (int) Math.sqrt(valorFinal);
		return valorFinal;
	}
	
	
}
