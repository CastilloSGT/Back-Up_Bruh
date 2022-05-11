package Produt;

public class Produto {
	public String nome;
	public String descricao;
	public float valor;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public float getValor() {
		return valor;
	}
	public void setValor(float valor) {
		this.valor = valor;
	}

	public String toString() {
		return "Produto [nome=" + nome +", descrição="+descricao+", valor="+valor+"]";
	}
}
