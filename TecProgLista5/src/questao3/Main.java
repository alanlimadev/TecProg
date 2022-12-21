package questao3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		Circulo circulo = new Circulo();
		
		System.out.print("Informe o valor do raio do círculo: ");
		double raio = input.nextDouble();
		
		System.out.print("Informe o percentual de aumento do raio: ");
		double valor = input.nextDouble();
		
		circulo.setRaio(raio);
		
		System.out.println("\nÁrea do Círculo: " + circulo.calcularArea());
		System.out.println("Circunferência do Círculo: " + circulo.calcularCircunferencia());

		System.out.println("Área do Círculo Modificada: " + circulo.aumentarArea(valor));
		System.out.println("Circunferência do Círculo Modificada: " + circulo.aumentarCircunferencia(valor));
		
	}

}