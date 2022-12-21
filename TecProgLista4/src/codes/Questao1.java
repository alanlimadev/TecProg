package codes;

import java.util.Scanner;

public class Questao1 {

	public static float CalculoImpostoDeRenda(float salarioMinimo, int dependentes, float salarioDoFuncionario, float taxaImpostoNormalPaga) {
		
		float impostoDeRenda;
		
		if((salarioDoFuncionario / salarioMinimo) > 12) {
			impostoDeRenda = (float) (salarioDoFuncionario * 0.2);
		}else if((salarioDoFuncionario / salarioMinimo) > 5) {
			impostoDeRenda = (float) (salarioDoFuncionario * 0.08);
		}else {
			return impostoDeRenda = 0;
		}
		
		impostoDeRenda -= dependentes * (impostoDeRenda * 0.02);
		impostoDeRenda += impostoDeRenda * 0.04;
		impostoDeRenda -= taxaImpostoNormalPaga;
		
		return impostoDeRenda;
	}

	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Informe o valor do salário mínimo: ");
		float salarioMinimo = input.nextFloat();
		
		System.out.print("Informe o número de dependentes: ");
		int dependentes = input.nextInt();
		
		System.out.print("Informe o salário do funcionário: ");
		float salarioDoFuncionario = input.nextFloat();
		
		System.out.print("Informe a taxa de imposto normal: ");
		float taxaImpostoNormalPaga = input.nextFloat();
		
		System.out.println("\nImposto de Renda cobrado: " + CalculoImpostoDeRenda(salarioMinimo, dependentes, salarioDoFuncionario, taxaImpostoNormalPaga));
		
	}

}
