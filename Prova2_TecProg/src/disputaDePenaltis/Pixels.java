package disputaDePenaltis;

import javax.swing.JButton;

public class Pixels extends JButton {
	private int posicaoX, posicaoY, golsFeitos, defesasRealizadas;

	public Pixels(int posicaoX, int posicaoY) {
		this.posicaoX = posicaoX;
		this.posicaoY = posicaoY;
	}

	public int getPosicaoX() {
		return posicaoX;
	}

	public int getPosicaoY() {
		return posicaoY;
	}

	public void addGolsFeitos() {
		this.golsFeitos++;
	}

	public void addDefesasRealizadas() {
		this.defesasRealizadas++;
	}

	public int getGolsFeitos() {
		return golsFeitos;
	}

	public int getDefesasRealizadas() {
		return defesasRealizadas;
	}

}