package disputaDePenaltis;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

public class BotaoFuncaoIniciar implements ActionListener {
	private Janela label;

	public BotaoFuncaoIniciar(Janela janela) {
		this.label = janela;
	}

	@Override
	public void actionPerformed(ActionEvent actionEvent) {
		String nome = JOptionPane.showInputDialog(null, "Informe o nome do jogador: ", null, 1);
		label.getProcessamentoDados().setNome(nome);
		label.addLabel();
	}
}
