package teste;

public class Estagiario extends Funcionario{

	public Estagiario(String Nome, double Salario) {
		super(Nome, Salario);
		setNome(Nome);
		setSalario(Salario);
	}

	@Override
	public double bonificacao() {
		return getSalario()*0;
	}
	
	public void Bruh() {
		System.out.println("Salario atual:"+getSalario()+ " e sua bonificação é: " + bonificacao());
	}

}
