package questao6;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		Elevador elevador = new Elevador();

		elevador.setCapacidade(input.nextInt());
		elevador.setTotalAndares(input.nextInt());

	}

}