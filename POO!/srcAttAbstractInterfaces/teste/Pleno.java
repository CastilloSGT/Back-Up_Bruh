package teste;

import Interfaces.Interfaces;

public class Pleno extends Funcionario implements Interfaces{

	public Pleno(String Nome, double Salario) {
		super(Nome, Salario);
		setNome(Nome);
		setSalario(Salario);
	}

	@Override
	public double bonificacao() {
		return getSalario()*0.15;
	}

	@Override
	public void Bruh() {
			System.out.println("Salario atual:"+getSalario()+ " e sua bonificação é: " + bonificacao());	
	}

	/**
	 * Classe bonusAnual de Pleno
	 * @return double com base no getSalarioPleno
	 */
	@Override
	public double bonusAnual() {
		return super.getSalario()*.3;
	}
}
