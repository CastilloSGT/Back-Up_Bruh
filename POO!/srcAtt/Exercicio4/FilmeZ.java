package Exercicio4;

public class FilmeZ {
	private String titulo;
	private int DuracaoFilme;
	
	public FilmeZ(String titulo, int duracaoFilme) {
		setTitulo(titulo);
		setDuracaoFilme(duracaoFilme);
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

	public void exibirDuracaoHoras() {
		int hora=0,min=0;
		int h1[] = new int[2];
		h1[0] = DuracaoFilme/60;
		h1[1] = DuracaoFilme-(h1[0]*60);
		System.out.println("O filme " +titulo+" possui: "+h1[0]+" e "+h1[1]+" minutos de duração");
	}
}
