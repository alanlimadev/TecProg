package questao3;

public class Circulo {
	
	private double raio;
	public static final double pi = 3.14;
	
	public double calcularArea() {
		return (pi * Math.pow(raio, 2));
	}
	
	public double calcularCircunferencia() {
		return (2 * pi * raio);
	}
	
	public double aumentarArea(double valor) {
		double raioNovo = raio + (raio * valor * 0.01);
		return (pi * Math.pow(raioNovo, 2));
	}
	
	public double aumentarCircunferencia(double valor) {
		return (2 * pi * (raio + (raio * valor * 0.01)));
	}
	
	public void setRaio(double raio) {
		this.raio = raio;
	}
	
}