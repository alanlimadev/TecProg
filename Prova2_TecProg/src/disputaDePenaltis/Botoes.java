package disputaDePenaltis;

import java.awt.event.ActionListener;

import javax.swing.JButton;

public class Botoes extends JButton {

	public Botoes(String texto, ActionListener actionButton) {
		setText(texto);
		addActionListener(actionButton);
	}

}