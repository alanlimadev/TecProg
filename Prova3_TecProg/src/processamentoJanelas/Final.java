package processamentoJanelas;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import geracaoBotoesJanelas.BotaoFinalizarBolao;
import processamentoDados.CadBolao;

public class Final extends JFrame {
	private CadBolao cadBolao;

	public Final(CadBolao cadBolao) {
		setTitle("FINAL");
		setLayout(new BorderLayout());
		setVisible(true);
		setSize(295, 99);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.cadBolao = cadBolao;
		addLabels();
		addConfrontos();
	}

	private void addConfrontos() {
		JPanel jPanel = new JPanel();
		for (GeracaoPlacarConfrontoSelecoes g : cadBolao.getProcessarFinal().getGerar1()) {
			jPanel.add(g);
		}
		add(BorderLayout.CENTER, jPanel);
	}

	private void addLabels() {
		JLabel jLabel = new JLabel();
		jLabel.setHorizontalAlignment(SwingConstants.CENTER);
		add(BorderLayout.NORTH, jLabel);
		BotaoFinalizarBolao b = new BotaoFinalizarBolao(this, cadBolao);
		add(BorderLayout.SOUTH, b);
	}
}