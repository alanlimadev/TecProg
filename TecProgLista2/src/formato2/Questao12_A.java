package formato2;

import java.util.Scanner;

public class Questao12_A {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe o valor das dimensões: ");
		int n = entrada.nextInt();
		
		for(int i = 0; i <= n; i++) {
			
			for(int j = 0; j < i; j++) {
				System.out.print(" * ");
			}
			System.out.print("\n");
		
		}
		
		entrada.close();
		
	}

}
