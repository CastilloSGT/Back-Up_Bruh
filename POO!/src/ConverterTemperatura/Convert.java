package ConverterTemperatura;

public class Convert {
	double ValorConvertido;
	double temperatura;
	int valor;
	
	void Verificar() {
		switch (valor) {
		case 1: CxK();
			break;
		
		case 2: CxF();
			break;
		
		case 3: KxF();
			break;
		
		case 4: KxF();
			break;
		
		case 5: FxC();
			break;
		
		case 6: FxK();
			break;

		default: System.out.println("Valor fora do padrão");
			break;
		}
		
		System.out.println("Valor Convertido: " + ValorConvertido);
	}
	double CxK(){
		ValorConvertido = temperatura + 273;// CxK
		return ValorConvertido;
	}

	double CxF() {
		ValorConvertido = (1.8 * temperatura) + 32;
		return ValorConvertido;
	}
	
	double KxC() {
		ValorConvertido = temperatura - 273;
		return ValorConvertido;
	}
	
	double KxF() {
		ValorConvertido = ((temperatura - 273) * 1.8) + 32;
		return ValorConvertido;
	}
	
	double FxC() {
		ValorConvertido = (temperatura - 32) / 1.8;
		return ValorConvertido;
	}
	
	double FxK() {
		ValorConvertido = ((temperatura - 32) * 5/9) + 273;
		return ValorConvertido;
	}
	
	
}
