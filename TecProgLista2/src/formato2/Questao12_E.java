package formato2;

import java.util.Scanner;

public class Questao12_E {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe o valor das dimensões: ");
		int n = entrada.nextInt();
			
		for (int i = 1; i <= n; i++) {
			for(int j = 1; j <= n; j++) {
				if(i <= n/2) {
					System.out.print(" * ");
				}else if(i > n/2) {
					if(j%2 != 0) {
						System.out.print(" # ");
					}else {
						System.out.print(" $ ");
					}
				}
			}
			System.out.println("\n");
		}
		
		entrada.close();

	}

}
