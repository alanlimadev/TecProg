package codigos;

public class Questao11 {

	public static void descompactarVetor(int vet[]) {
		
		int contador = 0, k = 0;
		
		int vetorResultante[] = new int[100];
		
		int vetorAux1[] = new int [10];
		
		
		for(int i = 0; i < vet.length; i++) {
			int aux = 0;
			
			if(i == 0) {
				vetorAux1[k] = vet[i];
				k++;
			}else if((vet[i-1] > 0) && (vet[i] == 0) && (vet[i+1] != 0)) {
				
			}else if((vet[i-1] > 0) && (vet[i] == 1)) {
				
			}
				
		}	
		
	}
	
	public static void main(String[] args) {
		
		int vetorA[] = {1, 5, 0, 1, 2, 1, 1, 0, 4};
		
		descompactarVetor(vetorA);
		
	}

}
