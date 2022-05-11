package TratamentoAndClassException;

public class Ex {
	public static void main(String[] args) throws DivisaoPorZeroException{
//		try {
//			//trecho onde à exceção pode ocorrer
//			int val = 10/0;
//			System.out.println(val);
//		} catch (Exception e) { 
//			//tratamento da exceção
//			e.printStackTrace();
//		}
		
		//uma exceção é um objeto do tipo exception
		//unchecked e error
		//CHECKED - é tratar uma linha de cod pode gerar uma exceção
		//é uma linha q vc n é obrigad a tratar, geralmente é herdada da classe runtimeexcception
		//é um erro q n pode ser tratado na sua codificação
		
		
		//Exceções UNCHECKED
		try {
			int val = 10/0;
			int []valores = new int[3];
			System.out.println(valores[4]);
			
			String nome = null;
			System.out.println(nome.length());
			
			int numero = Integer.parseInt("Zero");
		} catch (ArithmeticException e) {
			System.out.println("Não é possível realizar a divisão por zero!");
			
			//mensagem com a lista de erros
			System.out.println(e.getMessage());
			//imprime a pilha de erro da exceção
			e.printStackTrace();
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Não é possivel acessar a posição 4 do array!");
		}catch (NullPointerException e) {
			System.out.println("Não foi possivel retornar o lenth, variável nome não instanciada!");
		}catch (NumberFormatException e) {
			System.out.println("Não foi possivel realizar a conversão!");
		}catch (Exception e) {
			System.out.println("ERRO na execução do programa");
		}
		
//		finally {
//		System.out.println("Sempre passara por aqui");	
//		}
		
		/**
		 * Durante a execução de um programa é possível que algumas exceções ou erros aconteçam. Os mais comuns são:
		- Falha na aquisição de algum recurso
		- Tentiva de realizar algo impossível
		- Condições inválidas
		
		Em linhas gerais, o fluxo para o tratamento de exceções no Java ocorre em três passos:
		1 - Uma exceção é lançada: Um comando do código dispara uma condição inesperada de erro
		2 - A exceção é capturada: em algum ponto do código, podemos adicionar um comando para capturar a possível exceção
		3 - O tratamento de erro é realizado: após a captura da exceção, o tratamento de erro adequado é executado
		
		Dentro da plataforma Java, podemos classificar as exceções em:
		- Checked: Exceção que deve ser tratada ou relançada pelo desenvolvedor
		- Unchecked: Exceção que pode ser tratada ou relançada pelo programador. Se a exceção não for tratada, ela será automaticamente relançada
		- Error: erro crítico, utilizado pela JVM para indicar que existe um problema que não permite a execução do programa continuar
		 */
	}
}
