package codes;

import java.util.Scanner;

public class Questao6 {

	public static void tempo(double m) {

		int tempoTotalEmSegundos = 0;

		while (m >= 0.5) {

			m = m / 2;
			tempoTotalEmSegundos += 50;

		}

		System.out.println(tempoTotalEmSegundos);

		int minutos = tempoTotalEmSegundos / 60;

		int segundos = tempoTotalEmSegundos % 60;

		int horas = minutos / 60;

		minutos = minutos % 60;

		System.out.println("Massa Final: " + m);
		System.out.println("Horas: " + horas);
		System.out.println("Minutos: " + minutos);
		System.out.println("Segundos: " + segundos);

	}

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		double massa = input.nextFloat();

		System.out.println("Massa Inicial: " + massa);

		tempo(massa);

	}

}
