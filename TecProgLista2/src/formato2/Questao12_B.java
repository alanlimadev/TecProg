package formato2;

import java.util.Scanner;

public class Questao12_B {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe o valor das dimensões: ");
		int n = entrada.nextInt();
				
		for (int i = 0; i <= n-1; i++) {
			for(int j = 0; j<= n-1; j++) {
				if(j == i) {
					System.out.print(" # ");
				}else if(j + i == n-1){
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
