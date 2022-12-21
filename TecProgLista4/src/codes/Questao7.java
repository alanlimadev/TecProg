package codes;

import java.util.Scanner;

public class Questao7 {

	public static String reverter(String str) {

		char aux[] = str.toCharArray();
		char aux2[] = new char[str.length()];

		for (int i = str.length() - 1, j = 0; i >= 0; i--, j++) {
			aux2[j] = aux[i];
		}

		String str2 = new String(aux2);

		return str2;
	}

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Digite a string: ");
		String str = input.nextLine();

		System.out.println("\nString normal: " + str);
		System.out.println("String invertida: " + reverter(str));

	}

}
