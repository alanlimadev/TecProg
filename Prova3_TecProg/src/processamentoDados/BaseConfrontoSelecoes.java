package processamentoDados;

public class BaseConfrontoSelecoes {
	private String primeiraSelecao;
	private String segundaSelecao;
	private int placarPrimeiraSelecao;
	private int placarSegundaSelecao;

	public BaseConfrontoSelecoes(String primeiraSelecao, String segundaSelecao, int placarPrimeiraSelecao, int placarSegundaSelecao) {
		this.primeiraSelecao = primeiraSelecao;
		this.segundaSelecao = segundaSelecao;
		this.placarPrimeiraSelecao = placarPrimeiraSelecao;
		this.placarSegundaSelecao = placarSegundaSelecao;
	}
}