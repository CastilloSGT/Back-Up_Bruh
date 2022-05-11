package Exercicio3;

public class Lampada {
	private String cor;
	private boolean ativo = false;
	
	public Lampada(String cor, boolean ativo) {
		setCor(cor);
		setAtivo(ativo);
		
	}
	
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public boolean isAtivo() {
		return ativo;
	}
	public void setAtivo(boolean ativo) {
		if(ativo == false) {
			throw new RuntimeException("A lampada já está desligada");
		}else {
			this.ativo = ativo;
		}
		
	}
	
	public void ToString() {
		System.out.println("Cor: "+cor + "\nAtivo: "+ativo);
	}
}
