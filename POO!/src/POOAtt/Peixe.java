package POOAtt;

public class Peixe extends Animal{
	private String Caract;
	
	public Peixe(String nome, float comprimento, int nPatas,String Cor, String Ambiente, float VlMedia, String caract){
		super(nome,comprimento,nPatas,Cor,Ambiente,VlMedia);
		this.nome = nome;
		this.comprimento = comprimento;
		this.nPatas = nPatas;
		this.cor = Cor;
		this.Ambiente = Ambiente;
		this.VlMedia = VlMedia;
		this.Caract = caract;
	}

	public String getCaract() {
		return Caract;
	}

	public void setCaract(String caract) {
		Caract = caract;
	}

	public void dadosPeixe() {
		System.out.println("Nome: "+nome+"\nComprimento: "+comprimento+" cm\nPatas: "+nPatas+"\nCor:"+cor+"\nAmbiente: "+Ambiente+"\nVelocidade: "+VlMedia+" m/s\nCaracteristicas: "+Caract+"\n");
	}
}
