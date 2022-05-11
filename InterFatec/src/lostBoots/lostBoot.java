package lostBoots;

public class lostBoot {
	public int M;
	public char L;
	
	lostBoot(int tamanho, char ladoCorrespondente){
		this.M = tamanho;
		this.L = ladoCorrespondente;
	}
	
	lostBoot(){
		
	}
	
	public void setData(int tamanho, char ladoCorrespondente){
	        this.M= tamanho;
	        this.L = ladoCorrespondente;
	}

	public void display() {
		{
	        System.out.println("Student tamanho is: " + M + " "
	                           + "and Student name is: "
	                           + L);
	        System.out.println();
	    }
	}
}
