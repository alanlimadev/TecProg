package geracaoBotoesJanelas;

import java.awt.event.ActionEvent;

import processamentoDados.CadBolao;
import processamentoDados.ProcessarQuartas;
import processamentoJanelas.QuartasDeFinais;
import processamentoJanelas.GeracaoPlacarConfrontoSelecoes;

public class BotaoQuartasFinal extends BaseBotoes {
	private ProcessarQuartas processarQuartas;
	private QuartasDeFinais quartasDeFinais;
	private CadBolao cadBolao;

	public BotaoQuartasFinal(QuartasDeFinais quartasDeFinais, CadBolao cadBolao) {
		setText("AVANÇAR PARA AS SEMIFINAIS");
		addActionListener(this);
		this.processarQuartas = cadBolao.getProcessarQuartas();
		this.quartasDeFinais = quartasDeFinais;
		this.cadBolao = cadBolao;
	}

	@Override
	public void actionPerformed(ActionEvent actionEvent) {
		quartasDeFinais.setVisible(false);
		cadBolao.janelaSemi();
	}
}