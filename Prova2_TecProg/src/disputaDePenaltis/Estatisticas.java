package disputaDePenaltis;

import java.awt.BorderLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class Estatisticas extends JPanel {
	private ProcessamentoDados processamentoDados;

	public Estatisticas(ProcessamentoDados processamentoDados) {
		this.processamentoDados = processamentoDados;
		setLayout(new BorderLayout());
		addLabelSuperior();
	}

	private void addLabelSuperior() {
		JPanel superior = new JPanel();
		add(BorderLayout.NORTH, superior);
		JLabel nome = new JLabel("Jogador: " + processamentoDados.getNome() + " - Gols: " + processamentoDados.totalGols()
				+ " - Bolas Defendidas: " + processamentoDados.totalDefesas());
		superior.add(nome);
	}

}