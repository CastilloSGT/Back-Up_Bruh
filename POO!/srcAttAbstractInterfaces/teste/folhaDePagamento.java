package teste;

public class folhaDePagamento {
	public static int month = 0;
	public boolean bruh = false;
	private double somaSalarios;
	private double somaBonificacoes;
	private double bonusAnual;
	
	public double getBonusAnual() {
		return bonusAnual;
	}
	public void setBonusAnual(double bonusAnual) {
		this.bonusAnual = bonusAnual;
	}
	public double getSomaSalarios() {
		return somaSalarios;
	}
	public void setSomaSalarios(double somaSalarios) {
		this.somaSalarios = somaSalarios;
	}
	public double getSomaBonificacoes() {
		return somaBonificacoes;
	}
	public void setSomaBonificacoes(double somaBonificacoes) {
		this.somaBonificacoes = somaBonificacoes;
	}
	
	public double somaSalarios(Funcionario f) {
		return this.somaSalarios += f.getSalario();
	}
	
	public double somaBonificacoes(Funcionario f) {
		return this.somaBonificacoes += f.bonificacao();
	}
	
	/**
	 * Classe BonusAnualSenior
	 * @param s Objeto do tipo Senior
	 * @return valor bonusAnual com base no salario do Senior
	 */
	public double bonusAnualSenior(Senior s) {
		return this.bonusAnual += s.bonusAnual();
	}
	
	/**
	 * Classe bonusAnual 
	 * @param p Objeto do tipo Pleno
	 * @return valor bonusAnual com base no salario do Pleno
	 */
	public double bonusAnualPleno(Pleno p) {
		return this.bonusAnual += p.bonusAnual();
	}
	
	public void ToString () {
		System.out.println("Total de salarios: "+ getSomaSalarios()+"\nTotal das bonificações: "+getSomaBonificacoes()+"\nTotal de gasto com os pgt: "+ (somaSalarios + somaBonificacoes));
	}
	
	public void FolhaDePagamentos() {
		month++;
		System.out.println("\t======================\n");
		if(month == 11) {
			System.out.println("\tTotal de salarios: "+ getSomaSalarios()+"\n\tTotal das bonificações: "+getSomaBonificacoes()+"\n\tTotal de gasto com bonusAnual: "+ getBonusAnual()+"\n\tTotal de gasto com os pgt: "+ (getSomaSalarios() + getSomaBonificacoes() + getBonusAnual()+"\n"));	
		}else {
			System.out.println("\tTotal de salarios: "+ getSomaSalarios()+"\n\tTotal das bonificações: "+getSomaBonificacoes()+"\n\tTotal de gasto com os pgt: "+ (somaSalarios + somaBonificacoes+"\n"));
		}
		if(month == 12) {
			bruh = true;
		}
	}
}
