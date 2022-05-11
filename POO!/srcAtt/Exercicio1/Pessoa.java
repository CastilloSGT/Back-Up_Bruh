package Exercicio1;

public class Pessoa {
	public static final int ANO = 2022;
	private String nome;
	private String dataNascto;
	private float altura;
	public static int idade;
	
	public Pessoa(String nome, String dataNascto, float altura) {
		this.nome = nome;
		this.dataNascto = dataNascto;
		this.altura = altura;
	}
	public Pessoa() {
		
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDataNascto() {
		return dataNascto;
	}
	public void setDataNascto(String dataNascto) {
		this.dataNascto = dataNascto;
	}
	public float getAltura() {
		return altura;
	}
	public void setAltura(float altura) {
		this.altura = altura;
	}
	
	public String toString() {
		return "Nome: "+ nome + "\nData nascimento: "+ dataNascto + "\nAltura: "+ altura;
	}

	public int calcularIdade() {
		String recort = dataNascto.substring(6);
		int Year = Integer.parseInt(recort);
		idade = ANO - Year;
		return idade;
	}

	
}
