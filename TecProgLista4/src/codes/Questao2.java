package codes;

import java.util.Scanner;

public class Questao2 {

	public static float CalculoDoAluguel(float precoNormal, String diaDaSemana, String condicaoDaFerramenta) {

		float aluguel, desconto = 0, acrescimo = 0;

		if (diaDaSemana.equals("segunda") || diaDaSemana.equals("terça") || diaDaSemana.equals("quinta"))
			desconto = (float) (precoNormal * 0.4);
		if (condicaoDaFerramenta.equals("nova"))
			acrescimo = (float) (precoNormal * 0.15);

		aluguel = precoNormal + acrescimo - desconto;

		return aluguel;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Informe o preço normal: ");
		float PrecoNormal = Float.parseFloat(input.nextLine());

		System.out.print("Informe o dia da semana(digite em letra minúscula): ");
		String diaDaSemana = input.nextLine();

		System.out.print("Informe se a ferramenta é nova ou comum (digite em letra minúscula): ");
		String condicaoDaFerramenta = input.nextLine();

		System.out.print("\nValor do Aluguel: " + CalculoDoAluguel(PrecoNormal, diaDaSemana, condicaoDaFerramenta));

	}

}
