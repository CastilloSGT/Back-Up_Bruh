package ConverterTemperatura;
import java.util.Scanner;
public class TesteConvert {
	public static void main(String[] args) {
		Scanner sx = new Scanner(System.in);
		Convert conv = new Convert();

		System.out.println("Digita o valor para a conversão: ");
		conv.temperatura = sx.nextDouble();
		
		System.out.println("Digite o que deseja fazer: \n\t Celsius para Kelvin [1] \n\t Celsius para fahrenheit [2] \n\t Kelvin para celsius [3] \n\t Kelvin para fahrenheit [4] \n\t fahrenheit para celsius [5] \n\t fahrenheit para kelvin [6]");
		conv.valor = sx.nextInt();
		
		conv.Verificar();
	}
}
