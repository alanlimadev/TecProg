package codes;

import java.util.Scanner;

public class Questao9 {

	public static void desenho(int h) {

		for (int i = 0; i <= h; i++) {
			for (int j = h - i; j >= 1; j--) {
				System.out.print(" ");
			}
			for (int j = 0; j < i; j++) {
				if (j > 0)
					System.out.print("*");
			}
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Informe a altura do triângulo:");
		int altura = input.nextInt();

		desenho(altura);

	}
}
