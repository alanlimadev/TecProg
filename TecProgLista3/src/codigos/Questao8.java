package codigos;

public class Questao8 {

	public static void priorizacao(int vet[]) {
		
		int tamanho = 2, j = 2, valorInicial = 0;
		
		int vetorResultante[] = new int[9];
		
		for(int i = 0; i < tamanho; i++) {
			valorInicial += vet[i];
			vetorResultante[i] = vet[i];
		}
		
		for(int i = 2; i < vet.length; i++) {
			
			if( (valorInicial + vet[i])/(tamanho + 1) > (valorInicial)/(tamanho) ) {
				
				tamanho += 1;
				
				int aux = vet[i];
				vetorResultante[j] = aux;
				valorInicial += vetorResultante[j];
				j++;
			}
				
		}
		
		for(int i = 0; i < j; i++) {
			System.out.print(vetorResultante[i] + " ");
			
		}
		
	}
	
	public static void main(String[] args) {
		
		int vetorA[] = {1, 3, 2, 8, -1, 4, 10, 20, 6};
		
		priorizacao(vetorA);

	}

}
