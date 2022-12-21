package processamentoJanelas;

import java.awt.FlowLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class GeracaoPlacarConfrontoSelecoes extends JPanel {
	private JTextField primeiraSelecao;
	private JTextField segundaSelecao;
	private JTextField golsPrimeiraSelecao;
	private JTextField golsSegundaSelecao;

	public GeracaoPlacarConfrontoSelecoes() {
		setLayout(new FlowLayout());
		adicionarComponentes();
	}

	private void adicionarComponentes() {
		JLabel jLabel = new JLabel("SELEÇÃO:");
		add(jLabel);
		primeiraSelecao = new JTextField(3);
		add(primeiraSelecao);
		jLabel = new JLabel();
		add(jLabel);
		golsPrimeiraSelecao = new JTextField(1);
		add(golsPrimeiraSelecao);
		jLabel = new JLabel("\tX\t");
		add(jLabel);
		jLabel = new JLabel("SELEÇÃO:");
		add(jLabel);
		segundaSelecao = new JTextField(3);
		add(segundaSelecao);
		jLabel = new JLabel();
		add(jLabel);
		golsSegundaSelecao = new JTextField(1);
		add(golsSegundaSelecao);
	}

	public JTextField getPrimeiraSelecao() {
		return primeiraSelecao;
	}

	public JTextField getSegundaSelecao() {
		return segundaSelecao;
	}

	public JTextField getGolsPrimeiraSelecao() {
		return golsPrimeiraSelecao;
	}

	public JTextField getGolsSegundaSelecao() {
		return golsSegundaSelecao;
	}
}