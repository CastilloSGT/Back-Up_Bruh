package Exercicio5;

public class Livro {
	private String titulo;
	private int QtPags;
	private int PgLds;
	
	public Livro(String tit, int Qt, int Pg) {
		setTitulo(tit);
		setQtPags(Qt);
		setPgLds(Pg);
	}
	public Livro(String tit) {
		setTitulo(tit);
	}
	public Livro() {
		
	}
	
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public int getQtPags() {
		return QtPags;
	}
	public void setQtPags(int qtPags) {
		QtPags = qtPags;
	}
	public int getPgLds() {
		return PgLds;
	}
	public void setPgLds(int pgLds) {
		PgLds = pgLds;
	}
	
	
	public void verificarProgresso() {
		int porcentagem = getPgLds() * 100 / getQtPags();
		System.out.println("Você já leu "+porcentagem+"% do livro");
	}
	
	public void ToString() {
		System.out.println("O filme: "+getTitulo() +" possui "+getQtPags()+" páginas");
	}
}
