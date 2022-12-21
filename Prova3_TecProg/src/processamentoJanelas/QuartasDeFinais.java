package processamentoJanelas;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import geracaoBotoesJanelas.BotaoQuartasFinal;
import processamentoDados.CadBolao;

public class QuartasDeFinais extends JFrame {
	private CadBolao cadBolao;

	public QuartasDeFinais(CadBolao cadBolao) {
		setTitle("QUARTAS DE FINAL");
		setLayout(new BorderLayout());
		setVisible(true);
		setSize(305, 190);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.cadBolao = cadBolao;
		addLabels();
		addConfrontos();
	}

	private void addLabels() {
		JLabel jLabel = new JLabel();
		jLabel.setHorizontalAlignment(SwingConstants.CENTER);
		add(BorderLayout.NORTH, jLabel);
		BotaoQuartasFinal b = new BotaoQuartasFinal(this, cadBolao);
		add(BorderLayout.SOUTH, b);
	}

	private void addConfrontos() {
		JPanel jPanel = new JPanel();
		jPanel.setLayout(new GridLayout(4, 1));
		for (GeracaoPlacarConfrontoSelecoes g : cadBolao.getProcessarQuartas().getGerar2()) {
			jPanel.add(g);
		}
		add(BorderLayout.CENTER, jPanel);
	}
}