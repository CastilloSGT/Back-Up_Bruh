package teste;

public class Junior extends Funcionario{
	public Junior(String Nome, double Salario) {
		super(Nome, Salario);
		setNome(Nome);
		setSalario(Salario);
	}

	@Override
	public double bonificacao() {
		return getSalario()*0.05;
	}
	
	public void Bruh() {
		System.out.println("Salario atual:"+getSalario()+ " e sua bonificação é: " + bonificacao());
	}

}
