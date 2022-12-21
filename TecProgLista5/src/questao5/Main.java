package questao5;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		Empregado empregado = new Empregado("Alan", "Lima", 7);
		empregado.setSalarioMensal(4000);
		empregado.setDiasDeServico(20);
		
		System.out.print("Informe a quantidade de dias trabalhados: ");
		int diasDeServico = input.nextInt();

	}

}
