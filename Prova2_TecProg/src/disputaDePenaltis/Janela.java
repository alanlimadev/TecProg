package disputaDePenaltis;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Janela extends JFrame {
	private ProcessamentoDados processamentoDados;
	private LabelBotoes label;

	public Janela(String titulo, GolCompleto golCompleto, ActionListener actionListener,
			ProcessamentoDados processamentoDados) {
		setTitle(titulo);
		setLayout(new BorderLayout());
		setSize(1280, 720);
		// full hd tá bugando os botoes
		// setSize(1920, 1080);
		setLocation(100, 50);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		this.processamentoDados = processamentoDados;
		this.label = new LabelBotoes(golCompleto, actionListener);
		addLabelSuperior();
		
		//centralizar
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

	}

	public void addLabelSuperior() {
		JPanel labelSuperior = new JPanel();
		labelSuperior.setVisible(false);
		labelSuperior.setPreferredSize(new Dimension(100, 50));
		labelSuperior.add(new Botoes("INICIAR", new BotaoFuncaoIniciar(this)));
		labelSuperior.add(new Botoes("FINALIZAR", new BotaoFuncaoFinalizar(processamentoDados)));
		add(BorderLayout.NORTH, labelSuperior);
		labelSuperior.setVisible(true);
	}

	public void addlabel(LabelBotoes label) {
		this.label = label;
		this.label.setVisible(false);
		add(BorderLayout.CENTER, this.label);
		this.label.setVisible(true);
	}

	public void addLabel() {
		label.setVisible(false);
		add(BorderLayout.CENTER, label);
		label.setVisible(true);
	}

	public ProcessamentoDados getProcessamentoDados() {
		return processamentoDados;
	}
}