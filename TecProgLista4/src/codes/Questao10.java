package codes;

import java.util.Scanner;

import java.lang.Math;

public class Questao10 {

	public static void verificar(int n, int q) {

		String numStr = Integer.toString(n); // converte em string
		int arrInt[] = numStr.chars().map(c -> Character.getNumericValue((char) c)).toArray(); // converte de string
																								// para array de int
		int aux = 0;

		for (int i = 0; i < q; i++) {
			aux = (int) (aux + Math.pow(arrInt[i], q));
		}

		if (aux == n) {
			System.out.println(n + " é um número de Armstrong");
		} else {
			System.out.println(n + " não é um número de Armstrong");
		}

	}

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Informe um número: ");
		int numero = input.nextInt();

		// informa a quantidade de digitos do número informado
		String s = Integer.toString(numero);
		int quantidadeDeDigitos = s.length();

		verificar(numero, quantidadeDeDigitos);

	}

}