package codigos;

import java.util.Scanner;

public class Questao3 {

	public static void separacao(int[] v) {
		
		for (int i = 0; i < v.length - 1; i++) {

			for (int j = 0; j < v.length - 1 - i; j++) {

				if (v[j] > v[j + 1]) {
					int aux = v[j];
					v[j] = v[j + 1];
					v[j + 1] = aux;
				}
			}
		}
	}

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int vetor[] = new int[5];

		System.out.println("Preencha o vetor: ");
		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = input.nextInt();
		}

		separacao(vetor);

		System.out.println("Resultado da separação: ");
		for (int x : vetor) {
			System.out.print(x + " ");
		}
	}
}