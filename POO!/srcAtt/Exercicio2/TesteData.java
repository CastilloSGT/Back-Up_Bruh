package Exercicio2;

public class TesteData {
	public static void main(String[] args) {
		Data dt = new Data(75,32,2002);
		
		dt.ToString();
		
		Data dtCorreta = new Data(02,11,1999);
		
		dtCorreta.ToString();
		
		System.out.println("Saúl Gabriel Castillo Tercero");
		
		DataZ cs = new DataZ(02,12,2002);
		cs.ToString();
	}
}
