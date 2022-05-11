package a;

public class a {
	String ao;
	double a = 2, b = 3, res = 0;
	
	void aobah(){
		if(ao.equals("aobah")) {
			res = a+b;
			System.out.println("Equals");
		}else {
			res = a-b;
			System.out.println("Diferente dnv");
		}
		
		System.out.println(res);
		System.out.println(ao);
	}
	
	void calc (double a, double b, double temp) {
		if(ao.equals("a")) {
			a = temp*b;
		}else if(ao.equals("b")) {
			a = temp+b;
		}else {
			System.out.println("Avulso");;
		}
		System.out.println(a);
	}
}
