package geracaoBotoesJanelas;

import java.awt.Dimension;
import java.awt.event.ActionEvent;

import processamentoDados.CadBolao;
import processamentoJanelas.MenuInicial;

public class BotaoCadBolao extends BaseBotoes {
	private MenuInicial menuInicial;

	public BotaoCadBolao(MenuInicial menuInicial) {
		setText("CADASTRAR NOVO BOLÃO");
		setPreferredSize(new Dimension(300, 40));
		addActionListener(this);
		this.menuInicial = menuInicial;
	}

	@Override
	public void actionPerformed(ActionEvent actionEvent) {
		menuInicial.setVisible(false);
		CadBolao cadBolao = new CadBolao();
	}
}