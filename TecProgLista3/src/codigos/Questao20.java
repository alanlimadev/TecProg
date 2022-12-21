package codigos;

import java.util.Scanner;

public class Questao20 {

	public static void compararVetores(int vetx[], int vety[]) {
		
		for(int i = 0; i < vetx.length; i++) {
			
			int contador = 0;
			
			for(int j = 0; j < vety.length; j++) {
				
				//se o contador atingir o mesmo valor do tamanho do vetorB
				//então o valor do vetor A não existe no vetorB
				if(vetx[i] != vety[j]) 
					contador++;
			}
			
			//imprime o valor do vetorA que não está presente no vetorB
			if(contador == vety.length)
				System.out.println(vetx[i]);
			
		}

	}

	public static void main(String[] args) {
		
		int vetorA[] = {1, 5, 6, -1, -2};
		
		int vetorB[] = {50, -1, 5, 4, 10};

		System.out.println("Elementos que não estão presentes no VetorB: ");
		
		compararVetores(vetorA, vetorB);
		
	}
	
}
