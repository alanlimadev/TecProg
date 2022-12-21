package geracaoBotoesJanelas;

import java.awt.event.ActionEvent;

import processamentoDados.CadBolao;
import processamentoJanelas.Semifinais;

public class BotaoSemifinal extends BaseBotoes {
	private Semifinais semifinais;
	private CadBolao cadBolao;

	public BotaoSemifinal(Semifinais semifinais, CadBolao cadBolao) {
		setText("AVANÇAR PARA A FINAL");
		addActionListener(this);
		this.semifinais = semifinais;
		this.cadBolao = cadBolao;
	}

	@Override
	public void actionPerformed(ActionEvent actionEvent) {
		semifinais.setVisible(false);
		cadBolao.janelaFinal();
	}
}