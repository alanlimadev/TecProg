package codigos;

public class Questao17 {

	public static void explosao(int vet[]) {

		int vetorResultante[] = new int[100];

		int contador = 0;

		for (int i = 0; i < vet.length; i++) {

			for (int j = 0; j < vet[i]; j++) {

				vetorResultante[contador] = vet[i];
				contador++;
			}

		}

		for (int i = 0; i < contador; i++) {

			System.out.print(vetorResultante[i]);

		}

	}

	public static void main(String[] args) {

		int vetor[] = { 3, 5, 6, 1, 7 };

		explosao(vetor);

	}

}
