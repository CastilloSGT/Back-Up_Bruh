package POOAtt;

public class Animal {
	protected String nome;
	protected float comprimento;
	protected int nPatas;
	protected String cor;
	protected String Ambiente;
	protected float VlMedia;
	
	public Animal(String nome, float comprimento, int nPatas, String Cor, String Ambiente, float VlMedia) {
		this.nome = nome;
		this.comprimento = comprimento;
		this.nPatas = nPatas;
		this.cor = Cor;
		this.Ambiente = Ambiente;
		this.VlMedia = VlMedia;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public float getComprimento() {
		return comprimento;
	}

	public void setComprimento(float comprimento) {
		this.comprimento = comprimento;
	}

	public int getnPatas() {
		return nPatas;
	}

	public void setnPatas(int nPatas) {
		this.nPatas = nPatas;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getAmbiente() {
		return Ambiente;
	}

	public void setAmbiente(String ambiente) {
		Ambiente = ambiente;
	}

	public float getVlMedia() {
		return VlMedia;
	}

	public void setVlMedia(float vlMedia) {
		VlMedia = vlMedia;
	}		

	public void dados() {
		System.out.println("Nome: "+nome+"\nComprimento: "+comprimento+"cm\nPatas: "+nPatas+"\nCor: "+cor+"\nAmbiente: "+Ambiente+"\nVelocidade: "+VlMedia+"m/s\n");
	}
	
	
}
