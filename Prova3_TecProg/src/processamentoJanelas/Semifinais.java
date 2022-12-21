package processamentoJanelas;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import geracaoBotoesJanelas.BotaoSemifinal;
import processamentoDados.CadBolao;

public class Semifinais extends JFrame {
	private CadBolao cadBolao;

	public Semifinais(CadBolao cadBolao) {
		setTitle("SEMIFINAIS");
		setLayout(new BorderLayout());	
		setVisible(true);
		setSize(295, 137);
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
		BotaoSemifinal b = new BotaoSemifinal(this, cadBolao);
		add(BorderLayout.SOUTH, b);
	}

	private void addConfrontos() {
		JPanel jPanel = new JPanel();
		for (GeracaoPlacarConfrontoSelecoes g : cadBolao.getProcessarSemi().getGerar3()) {
			jPanel.add(g);
		}
		add(jPanel);
	}
}