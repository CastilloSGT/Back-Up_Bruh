package Exercicio4;

public class Filme {
	private String titulo;
	private int DuracaoFilme;

	public Filme() {
		
	}	
	public Filme(String Titulo, int durFilme) {
		this.titulo = Titulo;
		this.DuracaoFilme = durFilme;
	}
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public int getDuracaoFilme() {
		return DuracaoFilme;
	}
	public void setDuracaoFilme(int duracaoFilme) {
		DuracaoFilme = duracaoFilme;
	}

	public void exibirDuracaoEmHoras() {
		int horas= DuracaoFilme / 60;
		int min=DuracaoFilme-(horas*60);
		System.out.println("O filme " +titulo+" possui: "+horas+" e "+min+" minutos de duração");
	}
}
