package codes;

import java.util.Scanner;
import java.util.*;

public class Questao8 {

	public static void telefone(String[] cod, char[] c) {

		for (int i = 0; i < c.length; i++) {
			c[i] = Character.toLowerCase(c[i]);
			for (int j = 0; j < cod.length; j++) {
				if ((cod[j].indexOf(c[i])) != (-1)) {
					if (i == 0)
						System.out.print("(");
					if (i == 3)
						System.out.print(")");
					System.out.print(j);
				}
			}
		}
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		String cod[] = { "0+", "1#", "2abc", "3def", "4ghi", "5jkl", "6mno", "7pqrs", "8tuv", "9wxyz" };
		char[] c = new char[12];

		for (int i = 0; i < 12; i++) {
			c[i] = input.next().charAt(0);
		}

		telefone(cod, c);

	}

}
