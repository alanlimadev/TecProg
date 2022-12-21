package codigos;

public class Questao15 {

	public static void complementacao(int vetx[], int vety[]) {
		
		int vetorResultante[] = new int[vetx.length];
		
		for(int i = 0; i < vetx.length; i++) {
			
			vetorResultante[i] = 10 - (vetx[i] + vety[i]); 
			
		}
		
		for(int i = 0; i < vetx.length; i++) {
			
			System.out.print(vetorResultante[i] + " ");
			
		}
		
	}
	
	
	public static void main(String[] args) {

		int vetorA[] = {1, 2, 4, 5, 6};
		int vetorB[] = {5, 1, 9, 4, 2};
		
		complementacao(vetorA, vetorB);
		
	}

}
