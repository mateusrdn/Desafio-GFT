package exercicio4;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite um valor entre 3 e 999: ");
		int valor = sc.nextInt();
			int[] n = new int[valor];
		
			for (int i = 3; i <= valor; i++) {
				boolean primo = true;        
		            for(int j = 3; j < i; j++) {            
		                if(i % j == 0) {
		                    primo = false;
		                }
		            }
		            if(primo) {
		                System.out.println(i);
		            }         

			}	
			
			sc.close();
	}

}
