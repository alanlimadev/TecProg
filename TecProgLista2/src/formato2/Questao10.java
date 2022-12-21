package formato2;

import java.util.Scanner;

public class Questao10 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe o teto dos pares da esquerda e direita: ");
		int n = entrada.nextInt();
		
		int i = 0;
		int j = 0;
		for(i = 0; i <= (n + 1); i++) {
			for(j = 0; j <= n; j++) {
				
				System.out.print(i + " - " + j + "\n");
				
			}
		}

		entrada.close();
		
	}
}
