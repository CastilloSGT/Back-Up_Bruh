package POOAtt;

public class Mamifero extends Animal{
	private String alimento;
	
	public Mamifero(String nome,float comprimento,int nPatas,String Cor,String Ambiente,float VlMedia, String alimento){
		super(nome, comprimento, nPatas, Cor,Ambiente,VlMedia);
		this.nome = nome;
		this.comprimento = comprimento;
		this.nPatas = nPatas;
		this.cor = Cor;
		this.Ambiente = Ambiente;
		this.VlMedia = VlMedia;
		this.alimento = alimento;
	}

	public String getAlimento() {
		return alimento;
	}

	public void setAlimento(String alimento) {
		this.alimento = alimento;
	}

	public void dadosAlimento() {
		System.out.println("Nome: "+nome+"\nComprimento: "+comprimento+" cm\nPatas: "+nPatas+"\nCor: "+cor+"\nAmbiente: "+Ambiente+"\nVelocidade: "+VlMedia+" m/s\nAlimento: "+alimento+"\n");
	}
}
