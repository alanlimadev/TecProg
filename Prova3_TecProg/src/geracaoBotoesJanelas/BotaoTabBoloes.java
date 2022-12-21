package geracaoBotoesJanelas;

import java.awt.Dimension;
import java.awt.event.ActionEvent;

public class BotaoTabBoloes extends BaseBotoes {
	public BotaoTabBoloes() {
		setText("MOSTRAR BOLÕES CADASTRADOS");
		setPreferredSize(new Dimension(300, 40));
		addActionListener(this);	
	}

	@Override
	public void actionPerformed(ActionEvent actionEvent) {
		
	}
}