package Aulas;

public class Alarme {
	boolean statusAlarme = false;
	
	public void ligar() {
		statusAlarme = true;
		System.out.println("Alarme: " + mostraStatus());
	}
	
	public void desligar() {
		statusAlarme = false;
		System.out.println("Alarme: " + mostraStatus());
	}
	
	public boolean mostraStatus() {
		return statusAlarme;
	}
}
