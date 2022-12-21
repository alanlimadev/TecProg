package geracaoBotoesJanelas;

import java.awt.Dimension;
import java.awt.event.ActionEvent;

public class BotaoImportBolao extends BaseBotoes {
	public BotaoImportBolao() {
		setText("IMPORTAR BOLÕES");
		setPreferredSize(new Dimension(300, 40));
		addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent actionEvent) {

	}
}