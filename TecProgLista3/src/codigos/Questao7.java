package codigos;

public class Questao7 {

	public static void inverterVetores(int vetx[], int vety[]) {
		
		for(int i = 0; i < vetx.length; i++) {
			
			int aux = vetx[i];
			vetx[i] = vety[i];
			vety[i] = aux;
			
		}
		
		System.out.print("Vetor A: ");
		for(int i = 0; i<vetx.length; i++) {
			System.out.print(vetx[i] + " ");
		}
		
		System.out.print("\nVetor B: ");
		for(int i = 0; i<vetx.length; i++) {
			System.out.print(vety[i] + " ");
		}
		
	}
	
	public static void main(String[] args) {
		
		int vetorA[] = {1, 2, 4, 5, 6};
		int vetorB[] = {-9, -8, -7, 10, 11};
		
		inverterVetores(vetorA, vetorB);
		
	}

}
