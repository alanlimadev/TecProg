package questao4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		Produto produto = new Produto();

		System.out.print("Informe o nome do produto: ");
		produto.setnomeDoProduto(input.nextLine());

		System.out.print("Informe o preço de custo do produto: ");
		produto.setprecoDeCusto(input.nextDouble());

		System.out.print("Informe o preço de venda do produto: ");
		produto.setprecoDevenda(input.nextDouble());

		System.out.print("Informe as despesas da empresa: ");
		produto.setdespesasDaEmpresa(input.nextDouble());

		System.out.println("\nMargem de lucro: " + produto.calcularMargemDeLucro() + "%");
	}

}