package codigos;

import java.util.Random;

public class Questao16 {
	
	public static void polarizacao(int vet[]) {
		
		System.out.println("Vetor Original: ");
		for(int i = 0; i < vet.length; i++) {
			System.out.print(vet[i] + " ");
		}
		
		//polarizador
		for(int i = 0; i < vet.length; i++) {

			for(int j = i+1; j < vet.length; j++) {
				
				if(vet[j]%2 != 0) {
					int aux = vet[i];
					vet[i] = vet[j];
					vet[j] = aux;
				}
				
			}
			
		}
		
		System.out.println("\nVetor polarizado: ");
		for(int i = 0; i < vet.length; i++) {
			System.out.print(vet[i] + " ");
		}
		
		
		
	}
	
	public static void main(String[] args) {
		
		Random input = new Random();
		
		int vetor[] = new int[10];
		
		for(int i = 0; i < vetor.length; i++) {
			vetor[i] = input.nextInt(100);
		}
		
		polarizacao(vetor);

	}

}
