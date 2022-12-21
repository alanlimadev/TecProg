package codigos;

import java.util.Scanner;

public class Questao6 {
	
	public static void inverter(int[] v) {
		
		for (int i = 0, j = (v.length - 1); i < j; i++, j--) {
			int aux = v[i];
			v[i] = v[j];
			v[j] = aux;
			
		}
		
	}

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int vetor[] = new int[5];

		System.out.println("Preencha o vetor: ");
		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = input.nextInt();
		}

		inverter(vetor);

		System.out.println("resultado da invercao: ");
		for (int x : vetor) {
			System.out.print(x + " ");
		}
		
	}

}
