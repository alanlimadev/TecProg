package codigos_da_lista;

import java.util.Scanner;

public class Questao4 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe o valor de A: ");
		int A = entrada.nextInt();
		System.out.println("Informe o valor de B: ");
		int B = entrada.nextInt();
		
		if(A > 10 || (A + B) == 20) {
			System.out.println("número válido");
		}else {
			if(A == B) {
				System.out.println("A é igual B\nA e B são diferentes de 10\nA é menor que 10");
			}else {
				System.out.println("número não válido");
			}			
		}
		
		entrada.close();
	}
}