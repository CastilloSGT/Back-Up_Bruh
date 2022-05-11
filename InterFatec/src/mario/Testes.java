package mario;

public class Testes {
	public static void main(String[] args) {
		int arr[] = {1,2,3,4};
		int i;
		try {
			for(i = 0; i < arr.length; i++) {
				if(i == arr.length-1) {
					if(arr[i] == arr[i-1]) {
						System.out.println("if");
						System.out.println(arr[i]);
					}
				}else {
					if(arr[i] == arr[i+1]) {
						System.out.println("else");
						System.out.println(arr[i]);
					}
					
				}
			}
		} catch (Exception e) {
			System.out.println("Erro: "+e);
		}
	}
}
