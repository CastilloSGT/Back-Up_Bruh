package Aulas;

public class TesteAlarme {
	public static void main(String[] args) {
		Alarme a = new Alarme();
		a.ligar();
		a.desligar();
		a.ligar();
		
		System.out.println(a.statusAlarme);
	}
}
