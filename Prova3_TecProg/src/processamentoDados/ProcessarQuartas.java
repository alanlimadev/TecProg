package processamentoDados;

import java.util.ArrayList;

import processamentoJanelas.GeracaoPlacarConfrontoSelecoes;

public class ProcessarQuartas {
	private ArrayList<GeracaoPlacarConfrontoSelecoes> gerar2;

	public ProcessarQuartas() {
		this.gerar2 = new ArrayList<>();
		addPaineis();
	}

	public void addPaineis() {
		GeracaoPlacarConfrontoSelecoes g;
		for (int i = 0; i < 4; i++) {
			g = new GeracaoPlacarConfrontoSelecoes();
			this.gerar2.add(g);
		}
	}

	public ArrayList<String> getVencedores() {
		ArrayList<String> vencedores = new ArrayList<>();
		for (GeracaoPlacarConfrontoSelecoes g : gerar2) {
			int placarS1 = Integer.parseInt(g.getGolsPrimeiraSelecao().getText());
			int placarS2 = Integer.parseInt(g.getGolsSegundaSelecao().getText());
			if (placarS1 > placarS2) {
				vencedores.add(g.getPrimeiraSelecao().getText());
			} else
				vencedores.add(g.getSegundaSelecao().getText());
		}
		return vencedores;
	}

	public ArrayList<GeracaoPlacarConfrontoSelecoes> getGerar2() {
		return gerar2;
	}

}
