package codigos;

import java.util.Scanner;

public class Questao19 {

	public static void funcaoAgrupamento(int x, int vet[]) {
		
		int elementosDivididos[][] = new int [vet.length/x][x];
		
		int cont = 0;
		
		for(int i = 0; i < x; i++) {
			
			for(int j = 0; j < (vet.length/x); j++) {
				
				elementosDivididos[j][i] = vet[cont];
				cont++;
			}
			
		}
		
		for(int i = 0; i < x; i++) {
			
			for(int j = 0; j < (vet.length/x); j++) {
				System.out.print(elementosDivididos[j][i] + " ");
			}
			System.out.println();
		}
		
	}
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int vetorExemplo[] = {1, 2, 3, -6, -10, 5, -12, 6, 67, 71, 12, 13, 14, 15, 90, -100};
		
		System.out.print("Informe a quantidade de agrupamentos desejados: ");
		
		int agrupamento = input.nextInt();
		
		funcaoAgrupamento(agrupamento, vetorExemplo);
		
	}

}
