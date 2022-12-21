package questao5;

public class Empregado {
	private int id;
	private String primeiroNome;
	private String sobrenome;
	private double salarioMensal;
	private boolean[] diasTrabalhados = new boolean[30];
	private int diasDeServico;

	public Empregado(String primeiroNome, String sobrenome) {
		this.primeiroNome = primeiroNome;
		this.sobrenome = sobrenome;
	}

	public Empregado(String primeiroNome, String sobrenome, int id) {
		super();
		this.primeiroNome = primeiroNome;
		this.sobrenome = sobrenome;
		this.id = id;
	}

	public double getSalarioMensal() {
		return salarioMensal;
	}

	public void setSalarioMensal(double salarioMensal) {
		this.salarioMensal = salarioMensal;
	}

	public int getDiasDeServico() {
		return diasDeServico;
	}

	public void setDiasDeServico(int diasDeServico) {
		this.diasDeServico = diasDeServico;
	}

	public int calcularDiasTrabalhados(boolean[] diasTrabalhados) {
		int contador = 0;
		
		for (int i = 0; i < diasTrabalhados.length; i++) {
			if (diasTrabalhados[i] == true)
				contador++;
		}
		return contador;
	}

	public double newSalary() {
		int diasContados = calcularDiasTrabalhados(diasTrabalhados);
		
		if (diasContados == 30) {
			return salarioMensal * 1.01;
		} else if (diasContados >= 25 && diasContados <= 27) {
			double desconto = (30 - diasContados) * (salarioMensal * 2 / 100);
			return salarioMensal - desconto;
		} else if (diasContados >= 20 && diasContados <= 24) {
			double desconto = (30 - diasContados) * (salarioMensal * 3 / 100);
			return salarioMensal - desconto;
		} else if (diasContados < 20) {
			return salarioMensal * 20 / 100;
		} else
			return salarioMensal;
	}

}
