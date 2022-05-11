package teste;

public abstract class Funcionario {
	protected double salario;
	protected String nome;
	//private double bonificacao;
	
	public Funcionario(String Nome, double Salario) {
		setNome(Nome);
		setSalario(Salario);
	}

	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public abstract double bonificacao();
	
	public abstract void Bruh();
	
}
