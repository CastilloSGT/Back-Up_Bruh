package lostBoots;

import java.util.Scanner;

public class TesteLost {
	
	public static void main(String[] args) {
		Scanner lr = new Scanner(System.in);
		int n = 6,contador = 0;
		lostBoot[] arr =  new lostBoot[n];
		
//		arr[0] = new lostBoot(1,'D');
//		arr[1] = new lostBoot(2,'E');
//		arr[2] = new lostBoot(1,'E');
		//arr[0] = new Student(1701289270, "Satyabrata");
		  
        // Initializing the second element
        // of the array
//        arr[3] = new lostBoot(3,'D');
		//arr[1] = new Student(1701289219, "Omm Prasad");
		
        // Displaying the student data       
		for(int i = 0; i < n; i++) {
			int x = lr.nextInt();
			char aux = lr.next().charAt(0); 
			arr[i] = new lostBoot(x, aux);
		}

		for(int i = 0; i < n; i++) {
			for(int j = 1+i; j < n; j++) {
				if(arr[i].M == arr[j].M && arr[i].L != arr[j].L) {
					System.out.println(arr[i].M +" "+  arr[i].L + " é igual a "+ arr[j].M +" "+ arr[j].L);
					contador++;
					arr[j].M = 57+i;
				}
			}
		}
		
		System.out.println(contador);
		
//		for(int i = 0; i < n; i++) {
//			arr[i] = new lostBoot(1+i, 'D');
//			if(arr[i].L == 'D') {
//				System.out.println("Deu certo");
//				contador++;
//			}
//		}
       
//		System.out.println(
//            "lostBoot data in student arr 0: ");
//        arr[0].display();
//  
//        System.out.println(
//            "Student data in student arr 1: ");
//        arr[1].display();
        
        /**
         * // Creating actual student objects
        	arr[0] = new Student();
        	arr[1] = new Student();
  
        	// Assigning data to student objects
        	arr[0].setData(1701289270, "Satyabrata");
        	arr[1].setData(1701289219, "Omm Prasad");
        */
       
    	
	}
}
