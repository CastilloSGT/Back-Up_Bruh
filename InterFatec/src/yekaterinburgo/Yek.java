package yekaterinburgo;

public class Yek {
	/**
	 * Para indicar a posição do dígito que você deve calcular, eles estão numerados 
	 * de 1 a 4, do mais significativopara o mesmo. Por exemplo, para o ano de 2013 
	 * o dígito 1 é ‘2’, o 2 é ‘0’, o 3 é ‘1’ e o 4 é ‘3’.
	 * 1723
	 * A entrada é uma linha contendo um inteiro 1 ≤D ≤4 indicando a posição do do 
	 * dígito a ser calculado.
	*/
	public String ano[] = {"1","7","2","3"}; //
	public String aux;
	
	public boolean ver(int valor){
		if(valor >= 1 && valor <= 4) {
			return true;
		}else {
			return false;
		}
	}
	
	public void retornPosic(int valor) {
		boolean x = ver(valor);
		if(x == true) {
			switch (valor) {
			case 1: aux = ano[0];	
				break;
			
			case 2: aux = ano[1];	
				break;

			case 3: aux = ano[2];	
				break;

			case 4: aux = ano[3];	
				break;
			default:
				break;
			}
			System.out.println(aux);
		}else {
			System.out.println("Else");
		}
		
	}
	
}
