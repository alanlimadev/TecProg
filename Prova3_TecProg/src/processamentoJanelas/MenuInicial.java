package processamentoJanelas;

import java.awt.Dimension;

import javax.swing.JFrame;

public class MenuInicial extends JFrame {

	public MenuInicial() {
		setTitle("MENU");
		setSize(new Dimension(335, 270));
		add(new PainelPrincipal(this));
		setVisible(true);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	}
}