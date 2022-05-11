package ExceptionCreate;

public class Ex {
	public static void main(String[] args) throws DivisãoPorZeroException{
		try {
			int val = 10/0;
			System.out.println(val);
		} catch (Exception e) {
			throw new DivisãoPorZeroException(); //runtimeexception
		}
		
		/**
		 * Para criar uma exceção, basta criar uma classe que herde de Exception<CHECKED> ou RunTimeException<UNCHECKED>
		Por padrão, as exceções no Java terminam com Exception
		 */
	}
}
