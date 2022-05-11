package POOAtt;

public class TesteAnimal {
	public static void main(String[] args) {
		Animal testaAnimal = new Animal("Camelo", 1.50f, 4, "Amarelo", "Terra", 2);
		Peixe tubarao = new Peixe("Tubarão", 300f, 1,"Cinzento","Mar",1.5f, "Barbatanas e cauda");
		Mamifero ursocanada = new Mamifero("Urso-do-Canadá", 180f, 4,"Vermelho","Terra",0.5f,"Mel");
	
		testaAnimal.dados();
		tubarao.dadosPeixe();
		ursocanada.dadosAlimento();
	}
}
