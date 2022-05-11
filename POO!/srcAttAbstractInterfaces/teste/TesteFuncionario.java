package teste;

public class TesteFuncionario {
	public static void main(String[] args) {
		int i = 0;
		boolean bobo = false;	
		Estagiario e = new Estagiario("Bruh-1", 900);
		Junior jn = new Junior("Bruh", 1000);
		Pleno pl = new Pleno("Bruh2", 2000);
		Senior sn = new Senior("Bruh3", 3000);
		folhaDePagamento fg = new folhaDePagamento();
//		fg.somaSalarios(e);
//		fg.somaSalarios(jn);
		fg.somaSalarios(pl);
		fg.somaSalarios(sn);
//		fg.somaBonificacoes(jn);
//		fg.somaBonificacoes(e);
		fg.somaBonificacoes(pl);
		fg.somaBonificacoes(sn);
//		fg.ToString();
		fg.bonusAnualSenior(sn);
		fg.bonusAnualPleno(pl);
		
		while (fg.bruh != true) {
			System.out.println("\tMês:"+ (i+1));
			fg.FolhaDePagamentos(); // fg.month = 1
			i = folhaDePagamento.month; // i = 1
		}
		
	}
}
