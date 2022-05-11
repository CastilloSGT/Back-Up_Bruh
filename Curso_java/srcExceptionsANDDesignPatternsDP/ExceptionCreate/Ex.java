package ExceptionCreate;

public class Ex {
	public static void main(String[] args) throws Divis�oPorZeroException{
		try {
			int val = 10/0;
			System.out.println(val);
		} catch (Exception e) {
			throw new Divis�oPorZeroException(); //runtimeexception
		}
		
		/**
		 * Para criar uma exce��o, basta criar uma classe que herde de Exception<CHECKED> ou RunTimeException<UNCHECKED>
		Por padr�o, as exce��es no Java terminam com Exception
		 */
	}
}
