package codigos_da_lista;

import java.util.Scanner;

public class Questao5 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe o valor de A: ");
		int A = entrada.nextInt();
		System.out.println("Informe o valor de B: ");
		int B = entrada.nextInt();
		
		if(A > 10 || (A + B) == 20) {
			System.out.println("número válido");
		}else {
			System.out.println("número não válido");
		}
		
		entrada.close();
		
	}

}
