package codigos;

import java.util.Scanner;

public class Questao5 {
	
	public static void juncao(int[] v1, int[] v2, int[] v3) {
		
		for(int i=0;i<5;i++) {
			v3[i]=v1[i];
		}
		
		for(int j=5,k=0;j<10 && k<5;j++, k++) {
			v3[j]=v2[k];
		}
		
	}
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

		int vet1[] = new int[5];
		int vet2[] = new int[5];
		int vetJuncao[] = new int[10];
		
		System.out.println("Preencha o vetor 1: ");
		for (int i = 0; i < vet1.length; i++) {
			vet1[i] = input.nextInt();
		}
		
		System.out.println("Preencha o vetor 2: ");
		for (int i = 0; i < vet2.length; i++) {
			vet2[i] = input.nextInt();
		}
		
		juncao(vet1, vet2, vetJuncao);
		
		System.out.println("resultado da juncao: ");
		for(int x : vetJuncao) {
		      System.out.print(x + " ");
		}
		
	}
	
}