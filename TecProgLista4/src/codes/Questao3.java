package codes;

import java.util.ArrayList;
import java.util.Random;

public class Questao3 {

	public static void comparador(int[] vetor) {

		ArrayList<Integer> numPositivosMultiplos3 = new ArrayList<>();
		ArrayList<Integer> numPositivosNaoMultiplos3 = new ArrayList<>();
		ArrayList<Integer> numNegativosMultiplos3 = new ArrayList<>();
		ArrayList<Integer> numNegativosNaoMultiplos3 = new ArrayList<>();

		for (int i = 0; i < vetor.length; i++) {

			if (vetor[i] >= 0 && vetor[i] % 3 == 0) {
				numPositivosMultiplos3.add(vetor[i]);
			} else if (vetor[i] >= 0 && vetor[i] % 3 != 0) {
				numPositivosNaoMultiplos3.add(vetor[i]);
			} else if (vetor[i] < 0 && vetor[i] % 3 == 0) {
				numNegativosMultiplos3.add(vetor[i]);
			} else if (vetor[i] < 0 && vetor[i] % 3 != 0) {
				numNegativosNaoMultiplos3.add(vetor[i]);
			}
		}

		for (int i = 0; i < numPositivosMultiplos3.size(); i++) {
			System.out.println("Positivo e múltiplo de 3: " + numPositivosMultiplos3.get(i));
		}

		for (int i = 0; i < numPositivosNaoMultiplos3.size(); i++) {
			System.out.println("Positivo e não múltiplo de 3: " + numPositivosNaoMultiplos3.get(i));
		}

		for (int i = 0; i < numNegativosMultiplos3.size(); i++) {
			System.out.println("Negativo e múltiplo de 3: " + numNegativosMultiplos3.get(i));
		}

		for (int i = 0; i < numNegativosNaoMultiplos3.size(); i++) {
			System.out.println("Negativo e não múltiplo de 3: " + numNegativosNaoMultiplos3.get(i));
		}

	}

	public static void main(String[] args) {

		Random random = new Random();

		int[] vetor = new int[100];

		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = random.nextInt();
		}

		comparador(vetor);

	}

}
