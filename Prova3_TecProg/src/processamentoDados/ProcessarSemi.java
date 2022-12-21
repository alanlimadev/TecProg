package processamentoDados;

import java.util.ArrayList;

import processamentoJanelas.GeracaoPlacarConfrontoSelecoes;

public class ProcessarSemi {
	private ArrayList<GeracaoPlacarConfrontoSelecoes> gerar3;
	private ProcessarQuartas processarQuartas;

	public ProcessarSemi(ProcessarQuartas processarQuartas) {
		this.gerar3 = new ArrayList<>();
		this.processarQuartas = processarQuartas;
		addPaineis();
	}

	public void addPaineis() {
		GeracaoPlacarConfrontoSelecoes g;
		int cont = 0;
		for (int i = 0; i < 2; i++) {
			g = new GeracaoPlacarConfrontoSelecoes();
			g.getPrimeiraSelecao().setText(processarQuartas.getVencedores().get(cont));
			g.getPrimeiraSelecao().setEditable(false);
			cont++;
			g.getSegundaSelecao().setText(processarQuartas.getVencedores().get(cont));
			g.getSegundaSelecao().setEditable(false);
			cont++;
			gerar3.add(g);
		}
	}

	public ArrayList<String> getVencedores() {
		ArrayList<String> vencedores = new ArrayList<>();
		for (GeracaoPlacarConfrontoSelecoes g : gerar3) {
			int placarS1 = Integer.parseInt(g.getGolsPrimeiraSelecao().getText());
			int placarS2 = Integer.parseInt(g.getGolsSegundaSelecao().getText());
			if (placarS1 > placarS2) {
				vencedores.add(g.getPrimeiraSelecao().getText());
			} else
				vencedores.add(g.getSegundaSelecao().getText());
		}
		return vencedores;
	}

	public ArrayList<GeracaoPlacarConfrontoSelecoes> getGerar3() {
		return gerar3;
	}

}