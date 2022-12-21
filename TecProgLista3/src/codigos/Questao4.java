package codigos;

import java.util.Scanner;

public class Questao4 {
	
	public static int soma(int[] v) {
		
		int soma = 0;
		
		for (int i = 0; i < v.length; i++) {
			soma += v[i];
		}
		
		return soma;
		
	}

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int vetor[] = new int[5];

		System.out.println("Preencha o vetor: ");
		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = input.nextInt();
		}

		int x = soma(vetor);

		System.out.println("Resultado da soma: " + x);
		
	}
}