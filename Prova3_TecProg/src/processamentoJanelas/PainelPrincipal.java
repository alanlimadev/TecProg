package processamentoJanelas;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import geracaoBotoesJanelas.BotaoCadBolao;
import geracaoBotoesJanelas.BotaoExportBolao;
import geracaoBotoesJanelas.BotaoImportBolao;
import geracaoBotoesJanelas.BotaoTabBoloes;

public class PainelPrincipal extends JPanel {
	private MenuInicial menuInicial;

	public PainelPrincipal(MenuInicial menuInicial) {
		setLayout(new BorderLayout());
		setVisible(true);
		this.menuInicial = menuInicial;
		addSuperior();
		addBotoes();
	}

	private void addSuperior() {
		JLabel jLabel = new JLabel("FUNCIONALIDADE DO BOLÃO");
		jLabel.setHorizontalAlignment(SwingConstants.CENTER);
		jLabel.setFont(new Font(Font.DIALOG, Font.BOLD, 16));
		add(BorderLayout.NORTH, jLabel);
	}

	private void addBotoes() {
		JPanel jPanel = new JPanel();
		jPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 300, 10));
		jPanel.add(new BotaoCadBolao(menuInicial));
		jPanel.add(new BotaoTabBoloes());
		jPanel.add(new BotaoImportBolao());
		jPanel.add(new BotaoExportBolao());
		add(BorderLayout.CENTER, jPanel);
	}
}