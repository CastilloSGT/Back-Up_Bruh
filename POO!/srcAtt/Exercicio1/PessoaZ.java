package Exercicio1;

import java.time.LocalDate;

public class PessoaZ {
	private String nome;
	private String dataNascto;
	private float altura;
	public static int idade;
	
	public PessoaZ(String nome, String DataNascto, float altura) {
		setNome(nome);
		setDataNascto(DataNascto);
		setAltura(altura);
	}

	public String getNome() {
		return nome;
	}
	public String getDataNascto() {
		return dataNascto;
	}
	public float getAltura() {
		return altura;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setDataNascto(String dataNascto) {
		this.dataNascto = dataNascto;
	}
	public void setAltura(float altura) {
		this.altura = altura;
	}

	public void calculaIdade() {
		try {
			LocalDate sc = LocalDate.parse(dataNascto);
			LocalDate nw = LocalDate.now();
			idade = nw.getYear() - sc.getYear();
			System.out.println("Você tem: "+idade+" Anos");
		} catch (Exception e) {
			System.out.println("Erro: " +e);
		}

	}
}
