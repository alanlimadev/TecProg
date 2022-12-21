package codes;

import java.util.Scanner;

public class Questao4 {

	public static void nomes(String[] str) {

		System.out.println();

		for (int i = 0; i < str.length; i++) {
			str[i] = str[i].toLowerCase();
		}

		int contador = 0;

		char[] vogais = { 'a', 'e', 'i', 'o', 'u' };

		for (int i = 0; i < str.length; i++) {

			char[] aux = str[i].toCharArray();
			System.out.println((i + 1) + "º NOME: ");

			for (int j = 0; j < aux.length; j++) {

				contador = 0;

				for (int k = 0; k < 5; k++) {

					if (aux[j] == ' ') {
						contador = -1;
					} else if (aux[j] == vogais[k]) {
						contador++;
					}

				}

				if (contador == -1) {
					System.out.println(aux[j] + " - espaço");
				} else if (contador != 0) {
					System.out.println(aux[j] + " - vogal");
				} else {
					System.out.println(aux[j] + " - consoante");
				}

			}

			System.out.print("\n");
		}

	}

	public static void main(String[] args) {
		Scanner inputInt = new Scanner(System.in);
		Scanner inputStr = new Scanner(System.in);

		System.out.print("Informe a quantidade de nomes: ");
		int quantidade = inputInt.nextInt();

		String str[] = new String[quantidade];

		for (int i = 0; i < str.length; i++) {
			System.out.print("Informe o " + (i + 1) + "º nome: ");
			str[i] = inputStr.nextLine();
		}

		nomes(str);

	}
}