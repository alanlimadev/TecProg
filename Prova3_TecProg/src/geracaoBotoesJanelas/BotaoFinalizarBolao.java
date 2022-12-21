package geracaoBotoesJanelas;

import java.awt.event.ActionEvent;

import processamentoDados.CadBolao;
import processamentoJanelas.Final;

public class BotaoFinalizarBolao extends BaseBotoes {
	private Final f;
	private CadBolao cadBolao;

	public BotaoFinalizarBolao(Final f, CadBolao cadBolao) {
		setText("FINALIZAR BOLÃO");
		addActionListener(this);
		this.f = f;
		this.cadBolao = cadBolao;
	}

	@Override
	public void actionPerformed(ActionEvent actionEvent) {
		f.setVisible(false);
		cadBolao.janelaGanhador();
	}
}