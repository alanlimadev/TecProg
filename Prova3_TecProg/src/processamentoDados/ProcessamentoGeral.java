package processamentoDados;

import java.util.ArrayList;

import processamentoJanelas.GeracaoPlacarConfrontoSelecoes;

public class ProcessamentoGeral {
	private String nome;
	private ArrayList<GeracaoPlacarConfrontoSelecoes> quartas;
	private ArrayList<GeracaoPlacarConfrontoSelecoes> semi;
	private ArrayList<GeracaoPlacarConfrontoSelecoes> faseFinal;
	private String vencedor;

	public ProcessamentoGeral() {

	}

	public ArrayList<GeracaoPlacarConfrontoSelecoes> getQuartas() {
		return quartas;
	}

	public ArrayList<String> selecoes(ArrayList<GeracaoPlacarConfrontoSelecoes> gerar) {
		ArrayList<String> s = new ArrayList<>();
		for (GeracaoPlacarConfrontoSelecoes g : gerar) {
			s.add(g.getPrimeiraSelecao().getText());
			s.add(g.getSegundaSelecao().getText());
		}
		return s;
	}

	public ArrayList<Integer> placar(ArrayList<GeracaoPlacarConfrontoSelecoes> gerar) {
		ArrayList<Integer> gols = new ArrayList<>();
		for (GeracaoPlacarConfrontoSelecoes g : gerar) {
			gols.add(Integer.parseInt(g.getGolsPrimeiraSelecao().getText()));
			gols.add(Integer.parseInt(g.getGolsSegundaSelecao().getText()));
		}
		return gols;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public ArrayList<GeracaoPlacarConfrontoSelecoes> getSemi() {
		return semi;
	}

	public void setSemi(ArrayList<GeracaoPlacarConfrontoSelecoes> semi) {
		this.semi = semi;
	}

	public void setQuartas(ArrayList<GeracaoPlacarConfrontoSelecoes> quartas) {
		this.quartas = quartas;
	}

	public ArrayList<GeracaoPlacarConfrontoSelecoes> getFaseFinal() {
		return faseFinal;
	}

	public void setFaseFinal(ArrayList<GeracaoPlacarConfrontoSelecoes> faseFinal) {
		this.faseFinal = faseFinal;
	}

	public String getVencedor() {
		return vencedor;
	}

	public void setVencedor(String vencedor) {
		this.vencedor = vencedor;
	}

}