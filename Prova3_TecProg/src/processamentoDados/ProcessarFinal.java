package processamentoDados;

import java.util.ArrayList;

import processamentoJanelas.GeracaoPlacarConfrontoSelecoes;

public class ProcessarFinal {
	private ArrayList<GeracaoPlacarConfrontoSelecoes> gerar1;
	private ProcessarSemi processarSemi;

	public ProcessarFinal(ProcessarSemi processarSemi) {
		this.gerar1 = new ArrayList<>();
		this.processarSemi = processarSemi;
		addPaineis();
	}

	public void addPaineis() {
		GeracaoPlacarConfrontoSelecoes g;
		int cont = 0;
		for (int i = 0; i < 1; i++) {
			g = new GeracaoPlacarConfrontoSelecoes();
			g.getPrimeiraSelecao().setText(processarSemi.getVencedores().get(cont));
			g.getPrimeiraSelecao().setEditable(false);
			cont++;
			g.getSegundaSelecao().setText(processarSemi.getVencedores().get(cont));
			g.getSegundaSelecao().setEditable(false);
			cont++;
			gerar1.add(g);
		}
	}

	public ArrayList<String> getVencedores() {
		ArrayList<String> vencedores = new ArrayList<>();
		for (GeracaoPlacarConfrontoSelecoes g : gerar1) {
			int placarS1 = Integer.parseInt(g.getGolsPrimeiraSelecao().getText());
			int placarS2 = Integer.parseInt(g.getGolsSegundaSelecao().getText());
			if (placarS1 > placarS2) {
				vencedores.add(g.getPrimeiraSelecao().getText());
			} else
				vencedores.add(g.getSegundaSelecao().getText());
		}
		return vencedores;
	}

	public ArrayList<GeracaoPlacarConfrontoSelecoes> getGerar1() {
		return gerar1;
	}

}