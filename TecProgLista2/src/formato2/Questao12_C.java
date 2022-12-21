package formato2;

import java.util.Scanner;

public class Questao12_C {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe o valor das dimensões: ");
		int n = entrada.nextInt();
			
		for (int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++){
				if(i%2 == 0) {
					System.out.print(" # ");
				}else {
					System.out.print(" * ");
				}	
			}
			System.out.print("\n");	
		}
		
		entrada.close();

	}

}
