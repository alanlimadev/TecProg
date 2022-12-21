package codigos;

public class Questao10 {
	
	public static void compactarVetor(int vet[]) {
		
		int contador = 1, contador2 = 2;
		
		for(int i = 0; i < vet.length-1; i++) {
			
			if(vet[i] != vet[i+1]) {
				System.out.print(vet[i]);
				System.out.print(contador + " ");
				contador = 1;
			}else if(contador2 == vet.length){
				contador++;
				System.out.print(vet[i]);
				System.out.print(contador + " ");
			}else {
				contador++;
			}
			contador2++;
		}
		
	}

	public static void main(String[] args) {
		int vetor[] = {0, 0, 0, 1, 1, 1, 1, 0, 0, 1, 0, 0, 0};
		
		compactarVetor(vetor);

	}

}
