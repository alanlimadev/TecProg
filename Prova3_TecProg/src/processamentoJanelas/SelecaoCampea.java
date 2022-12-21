package processamentoJanelas;

import java.awt.BorderLayout;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import processamentoDados.CadBolao;

public class SelecaoCampea extends JFrame {
	CadBolao cadBolao;

	public SelecaoCampea(CadBolao cadBolao) {
		setTitle("CAMPEÃO");
		setLayout(new BorderLayout());
		setVisible(true);
		setSize(272, 201);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.cadBolao = cadBolao;
		labelSuperior();
		labelCentral();
	}

	private void labelSuperior() {
		JLabel jLabel = new JLabel();
		jLabel.setHorizontalAlignment(SwingConstants.CENTER);
		add(BorderLayout.NORTH, jLabel);
	}

	private void labelCentral() {
		JLabel jLabel = new JLabel();
		jLabel.setHorizontalAlignment(SwingConstants.CENTER);
		ImageIcon imageIcon = verificarGanhador();
		imageIcon.setImage(imageIcon.getImage().getScaledInstance(250, 150, 100));
		jLabel.setIcon(imageIcon);
		add(BorderLayout.CENTER, jLabel);
	}

	private ImageIcon verificarGanhador() {
		String selecaocampea = cadBolao.getProcessamentoGeral().getVencedor();

		if (selecaocampea.equals("ARG")) {
			return new ImageIcon("src/selecoes/argentina.png");
		} else if (selecaocampea.equals("BRA")) {
			return new ImageIcon("src/selecoes/brasil.png");
		} else if (selecaocampea.equals("CRO")) {
			return new ImageIcon("src/selecoes/croacia.png");
		} else if (selecaocampea.equals("FRA")) {
			return new ImageIcon("src/selecoes/franca.png");
		} else if (selecaocampea.equals("HOL")) {
			return new ImageIcon("src/selecoes/holanda.png");
		} else if (selecaocampea.equals("ING")) {
			return new ImageIcon("src/selecoes/inglaterra.png");
		} else if (selecaocampea.equals("MAR")) {
			return new ImageIcon("src/selecoes/marrocos.png");
		} else if (selecaocampea.equals("POR")) {
			return new ImageIcon("src/selecoes/portugal.png");
		}

		return null;
	}
}