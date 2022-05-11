package TratamentoAndClassException;

public class Ex {
	public static void main(String[] args) throws DivisaoPorZeroException{
//		try {
//			//trecho onde � exce��o pode ocorrer
//			int val = 10/0;
//			System.out.println(val);
//		} catch (Exception e) { 
//			//tratamento da exce��o
//			e.printStackTrace();
//		}
		
		//uma exce��o � um objeto do tipo exception
		//unchecked e error
		//CHECKED - � tratar uma linha de cod pode gerar uma exce��o
		//� uma linha q vc n � obrigad a tratar, geralmente � herdada da classe runtimeexcception
		//� um erro q n pode ser tratado na sua codifica��o
		
		
		//Exce��es UNCHECKED
		try {
			int val = 10/0;
			int []valores = new int[3];
			System.out.println(valores[4]);
			
			String nome = null;
			System.out.println(nome.length());
			
			int numero = Integer.parseInt("Zero");
		} catch (ArithmeticException e) {
			System.out.println("N�o � poss�vel realizar a divis�o por zero!");
			
			//mensagem com a lista de erros
			System.out.println(e.getMessage());
			//imprime a pilha de erro da exce��o
			e.printStackTrace();
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("N�o � possivel acessar a posi��o 4 do array!");
		}catch (NullPointerException e) {
			System.out.println("N�o foi possivel retornar o lenth, vari�vel nome n�o instanciada!");
		}catch (NumberFormatException e) {
			System.out.println("N�o foi possivel realizar a convers�o!");
		}catch (Exception e) {
			System.out.println("ERRO na execu��o do programa");
		}
		
//		finally {
//		System.out.println("Sempre passara por aqui");	
//		}
		
		/**
		 * Durante a execu��o de um programa � poss�vel que algumas exce��es ou erros aconte�am. Os mais comuns s�o:
		- Falha na aquisi��o de algum recurso
		- Tentiva de realizar algo imposs�vel
		- Condi��es inv�lidas
		
		Em linhas gerais, o fluxo para o tratamento de exce��es no Java ocorre em tr�s passos:
		1 - Uma exce��o � lan�ada: Um comando do c�digo dispara uma condi��o inesperada de erro
		2 - A exce��o � capturada: em algum ponto do c�digo, podemos adicionar um comando para capturar a poss�vel exce��o
		3 - O tratamento de erro � realizado: ap�s a captura da exce��o, o tratamento de erro adequado � executado
		
		Dentro da plataforma Java, podemos classificar as exce��es em:
		- Checked: Exce��o que deve ser tratada ou relan�ada pelo desenvolvedor
		- Unchecked: Exce��o que pode ser tratada ou relan�ada pelo programador. Se a exce��o n�o for tratada, ela ser� automaticamente relan�ada
		- Error: erro cr�tico, utilizado pela JVM para indicar que existe um problema que n�o permite a execu��o do programa continuar
		 */
	}
}
