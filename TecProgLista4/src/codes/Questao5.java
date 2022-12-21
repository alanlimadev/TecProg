package codes;

import java.util.Scanner;

public class Questao5 {

	public static int calculoSoma(int[] vet) {
		int soma = 0;

		for (int i = 0; i < vet.length; i++) {
			soma += vet[i];
		}

		return soma;
	}

	public static int calculoProduto(int[] vet) {
		int produto = 1;

		for (int i = 0; i < vet.length; i++) {
			produto *= vet[i];
		}

		return produto;
	}

	public static double calculoMedia(int[] vet) {
		double media = 0;

		for (int i = 0; i < vet.length; i++) {
			media += vet[i];
		}

		return (media / vet.length);
	}

	public static double calculoMediaFinal(double[] vet) {
		double media = 0;

		for (int i = 0; i < vet.length; i++) {
			media += vet[i];
		}

		return (media / vet.length);
	}

	public static void interfaceGeral(int[] vetor1, int[] vetor2, int[] vetor3) {
		System.out.println("Soma dos elementos do vetor1: " + calculoSoma(vetor1));
		System.out.println("Produto dos elementos do vetor1: " + calculoProduto(vetor1));
		System.out.println("Média dos elementos do vetor1: " + calculoMedia(vetor1));

		System.out.println("Soma dos elementos do vetor2: " + calculoSoma(vetor2));
		System.out.println("Produto dos elementos do vetor2: " + calculoProduto(vetor2));
		System.out.println("Média dos elementos do vetor2: " + calculoMedia(vetor2));

		System.out.println("Soma dos elementos do vetor3: " + calculoSoma(vetor3));
		System.out.println("Produto dos elementos do vetor3: " + calculoProduto(vetor3));
		System.out.println("Média dos elementos do vetor3: " + calculoMedia(vetor3));

		int[] vetorTodasSomas = { calculoSoma(vetor1), calculoSoma(vetor2), calculoSoma(vetor3) };
		int[] vetorTodosProdutos = { calculoProduto(vetor1), calculoProduto(vetor2), calculoProduto(vetor3) };
		double[] vetorTodasMedias = { calculoMedia(vetor1), calculoMedia(vetor2), calculoMedia(vetor3) };

		System.out.println("Soma das somas de cada vetor: " + calculoSoma(vetorTodasSomas));
		System.out.println("Produto dos produtos de cada vetor: " + calculoProduto(vetorTodosProdutos));
		System.out.println("Soma das somas de cada vetor: " + calculoMediaFinal(vetorTodasMedias));
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Informe o tamanho do vetor 1, 2 e 3: ");
		int tamanhoVetor1 = input.nextInt();
		int tamanhoVetor2 = input.nextInt();
		int tamanhoVetor3 = input.nextInt();

		int[] vetor1 = new int[tamanhoVetor1];
		int[] vetor2 = new int[tamanhoVetor2];
		int[] vetor3 = new int[tamanhoVetor3];

		System.out.println("Informe os valores do primeiro vetor");
		for (int i = 0; i < vetor1.length; i++) {
			vetor1[i] = input.nextInt();
		}

		System.out.println("Informe os valores do segundo vetor");
		for (int i = 0; i < vetor2.length; i++) {
			vetor2[i] = input.nextInt();
		}

		System.out.println("Informe os valores do terceiro vetor");
		for (int i = 0; i < vetor3.length; i++) {
			vetor3[i] = input.nextInt();
		}

		interfaceGeral(vetor1, vetor2, vetor3);

	}

}
