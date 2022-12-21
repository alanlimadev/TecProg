package codes;

public class Questao11 {

	public static void modificarMatriz(int[][] matriz) {
		
		for (int j = 0; j < matriz[0].length; j++) {
			
			System.out.print("[");
			
			for (int i = matriz.length - 1; i >= 0; i--) {
				System.out.print(matriz[i][j]);
				if (i < 0 || i > 0)
					System.out.print(", ");
			}
			
			System.out.println("]");
			
		}
		
	}

	public static void main(String[] args) {
		
		int matriz[][] = { { 5, 3 }, { 8, 2 }, { 3, 9 } };
		
		System.out.println("Matriz Original: ");
		for (int i = 0; i < matriz.length; i++) {
			System.out.print("[");
			for (int j = 0; j < matriz[0].length; j++) {
				System.out.print(matriz[i][j]);
				if (j % 2 == 0)
					System.out.print(", ");
			}
			System.out.print("]");
			System.out.println();
		}
		
		System.out.println("\nMatriz Modificada: ");
		modificarMatriz(matriz);
	}

}
