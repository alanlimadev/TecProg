package codigos;

import java.util.Scanner;

public class Questao1 {

	public static int pesquisa(int vet[], int x) {

		for (int i = 0; i < vet.length; i++) {
			if (vet[i] == x) {
				System.out.println("Elemento encontrado no indice:");
				return i;
			}

		}
		return -100;
	}

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int vetor[] = new int[10];

		System.out.println("Preencha o vetor: ");
		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = input.nextInt();
		}

		System.out.println("Informe o elemento: ");
		int elemento = input.nextInt();

		System.out.println(pesquisa(vetor, elemento));

	}

}
