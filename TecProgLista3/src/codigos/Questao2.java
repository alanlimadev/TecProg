package codigos;

import java.util.Scanner;

public class Questao2 {

	public static int pesquisaPorIndice(int vet[], int x) {

		for (int i = 0; i < vet.length; i++) {
			if (i == x) {
				System.out.printf("O elemento de indice %d é:\n", x);
				return vet[i];
			}

		}
		return x;

	}

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int vetor[] = new int[10];

		System.out.println("Preencha o vetor: ");
		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = input.nextInt();
		}

		System.out.println("Informe o indice: ");
		int indice = input.nextInt();

		System.out.println(pesquisaPorIndice(vetor, indice));

	}

}
