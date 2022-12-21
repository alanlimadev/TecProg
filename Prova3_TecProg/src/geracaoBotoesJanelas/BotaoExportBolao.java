package geracaoBotoesJanelas;

import java.awt.Dimension;
import java.awt.event.ActionEvent;

public class BotaoExportBolao extends BaseBotoes {
	public BotaoExportBolao() {
		setText("EXPORTAR BOLÕES");
		setPreferredSize(new Dimension(300, 40));
		addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent actionEvent) {

	}
}