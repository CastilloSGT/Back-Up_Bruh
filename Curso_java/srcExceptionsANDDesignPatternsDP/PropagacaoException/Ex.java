package PropagacaoException;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Ex {
	public static void main(String[] args) throws IOException {
		FileWriter fw = new FileWriter("c:\\nota.txt");
		
		PrintWriter print = new PrintWriter(fw);
		
		print.println("Ma�a = R$: 4,00");
		print.println("Morango = R$: 6,50");
		print.println("Total = R$: 10,50");
		print.close();
		fw.close();
		
		/**
		 * Um m�todo pode optar por n�o tratar a exce��o e simplesmente propag�-la, ou melhor, delegar para o m�todo que a chamou.
		A cl�usula throws declara exce��es que podem ser lan�adas em determinados m�todos
		*/
	}
}
