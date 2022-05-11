package teste;

import Interfaces.Interfaces;

public class Senior extends Funcionario implements Interfaces{

	public Senior(String Nome, double Salario) {
		super(Nome, Salario);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double bonificacao() {
		return getSalario()*0.30;
	}

	@Override
	public void Bruh() {
		System.out.println("Salario atual:"+getSalario()+ " e sua bonificação é: " + bonificacao());	
	}

	/**
	 * Classe BonusAnual
	 * @return double valor com base no salario
	 */
	@Override
	public double bonusAnual() {
		return super.getSalario()*.3;
	}

}
