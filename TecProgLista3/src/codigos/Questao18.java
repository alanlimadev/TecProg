package codigos;

public class Questao18 {

	public static void organizacao(int vet[]) {

		int vetorResultante[] = new int[8];

		for (int i = 0; i < vet.length; i++) {

			for (int j = i + 1; j < vet.length; j++) {

				if (vet[i] >= vet[j]) {

					int aux = vet[i];
					vet[i] = vet[j];
					vet[j] = aux;

				}

			}

		}

		for (int i = 0; i < vet.length; i++) {
			System.out.print(vet[i] + " ");
		}

	}

	public static void main(String[] args) {

		int vetor[] = { 1, 2, 3, 1, 2, 3, 4, 5 };

		organizacao(vetor);

	}

}
