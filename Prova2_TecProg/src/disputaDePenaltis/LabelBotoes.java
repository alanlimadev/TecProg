package disputaDePenaltis;

import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JPanel;

public class LabelBotoes extends JPanel {
	private ActionListener actionListener;

	public LabelBotoes(GolCompleto golCompleto, ActionListener actionListener) {
		this.actionListener = actionListener;
		setLayout(new GridLayout(9, 17));
		addBotoes(golCompleto.getPixels(), actionListener);
	}

	public LabelBotoes(Goleiro gol) {
		setLayout(new GridLayout(9, 17));
		addBotoes(gol.getPixels(), actionListener);
	}

	public LabelBotoes(ArrayList<Pixels> pixels) {
		setLayout(new GridLayout(9, 17));
		addBotoes(pixels, null);
	}

	private void addBotoes(ArrayList<Pixels> pixels, ActionListener actionListener) {
		for (int x = 0; x < 9; x++) {
			for (int y = 0; y < 17; y++) {
				ordenar(x, y, pixels, actionListener);
			}
		}
	}

	private void ordenar(int x, int y, ArrayList<Pixels> pixels, ActionListener actionListener) {
		for (Pixels pixel : pixels) {
			if (pixel.getPosicaoX() == x && pixel.getPosicaoY() == y) {
				pixel.addActionListener(actionListener);
				add(pixel);
			}
		}
	}
}