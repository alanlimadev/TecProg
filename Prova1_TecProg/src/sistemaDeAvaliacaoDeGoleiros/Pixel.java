package sistemaDeAvaliacaoDeGoleiros;

public class Pixel {
	private int quadrante;
	private int x;
	private int y;
	private String mapeamentoGol;

	public void verificacaoDoQuadrante() {
		int quadrante = 0;
		if (x <= 4 && y <= 8) {
			quadrante = 1;
		} else if (x <= 4 && y > 8) {
			quadrante = 2;
		} else if (x > 4 && y <= 8) {
			quadrante = 3;
		} else if (x > 4 && y > 8) {
			quadrante = 4;
		}
		this.quadrante = quadrante;
	}

	public void posicaoDoChute() {
		String condicao = "G";

		for (int i = 0; i < 18; i++) {
			if ((x == i && y == 0) || (x == i && y == 17) || (x == 0 && y == i))
				condicao = "F";
		}

		for (int i = 1; i < 17; i++) {
			if ((x == i && y == 1) || (x == i && y == 16) || (x == 1 && y == i))
				condicao = "T";
		}

		if ((condicao.equals("G")) && ((x == 1 && y == 2) || (x == 2 && y == 15)))
			condicao = "A";

		this.mapeamentoGol = condicao;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getQuadrante() {
		return quadrante;
	}

	public String getMapeamentoGol() {
		return mapeamentoGol;
	}
	
}
