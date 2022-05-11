package teste;

import java.util.Date;
import java.text.SimpleDateFormat;

public class Data {
	public static void main(String[] args) {
		Date data = new Date();
		
		System.out.println(data.toString());
		
		SimpleDateFormat sd = new SimpleDateFormat("dd/MM/yyyy");
		System.out.println(sd.format(data));
	}
}
