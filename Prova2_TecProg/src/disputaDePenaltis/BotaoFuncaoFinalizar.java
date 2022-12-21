package disputaDePenaltis;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BotaoFuncaoFinalizar implements ActionListener {
	private ProcessamentoDados processamentoDados;

	public BotaoFuncaoFinalizar(ProcessamentoDados processamentoDados) {
		this.processamentoDados = processamentoDados;
	}

	@Override
	public void actionPerformed(ActionEvent actionEvent) {
		JanelaEstatisticas estatisticas = new JanelaEstatisticas(processamentoDados);
	}
}