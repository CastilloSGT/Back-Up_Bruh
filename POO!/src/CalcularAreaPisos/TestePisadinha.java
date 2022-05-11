package CalcularAreaPisos;
import java.util.Scanner;
public class TestePisadinha {
	public static void main(String[] args) {
		Scanner mx = new Scanner(System.in);
		AreaPisadinha area = new AreaPisadinha();
		
		System.out.println("Primeiro devemos pegar os valores do piso!");
		System.out.println("Digite a largura do piso: ");
		area.lrg = mx.nextDouble();
		System.out.println("Digite a altura do piso: ");
		area.alt = mx.nextDouble();
		
		System.out.println("Digite a largura da area: ");
		area.lrgT = mx.nextDouble();
		System.out.println("Digite a altura da area: ");
		area.altT = mx.nextDouble();
		
		System.out.println(area.CalculaExato());
	}
}
