package codigos_da_lista;

import java.util.Scanner;

public class Questao13 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe o valor de A: ");
		int A = entrada.nextInt();
		System.out.println("Informe o valor de B: ");
		int B = entrada.nextInt();
		
		if(A > 10 || (A + B) == 20){
			if(A > 10) {
				System.out.println("A > 10");
			}
			if((A + B) == 20) {
				System.out.println("A + B == 20");
			}
		}else {
			System.out.println("números não válidos");
		}
		
		entrada.close();	
	}
}