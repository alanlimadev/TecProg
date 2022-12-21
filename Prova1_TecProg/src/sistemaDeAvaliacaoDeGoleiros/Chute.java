package sistemaDeAvaliacaoDeGoleiros;

public class Chute {
	private int id;
	private int forca;
	private int quadrante;
	private int x;
	private int y;
	private String mapeamentoGol;

	public Chute(int id, int forca, int quadrante, int x, int y) {
		this.id = id;
		this.forca = forca;
		this.quadrante = quadrante;
		this.x = x;
		this.y = y;
		this.mapeamentoGol = null;
	}

	public Chute(Chute chute) {
		this.id = chute.getId();
		this.forca = chute.getForca();
		this.quadrante = chute.getQuadrante();
		this.x = chute.getX();
		this.y = chute.getX();
		this.mapeamentoGol = null;
	}
	
	public void conferirPosicaoDoChute() {
		// G = gol
		// F = fora
		// TT = travessão
		// TE = trave esquerda
		// TD = trave direita
		// A = angulo

		String condicao = "G";

		//área fora do gol
		for (int i = 0; i < 18; i++) {
			if ((x == i && y == 0) || (x == i && y == 17) || (x == 0 && y == i))
				condicao = "F";
		}

		// no trave esquerda e na trave direita
		for (int i = 2; i < 10; i++) {
			if (x == i && y == 1)
				condicao = "TE";
			if (x == i && y == 16)
				condicao = "TD";
		}
		// no travessão
		for (int i = 1; i < 17; i++) {
			if (x == 1 && y == i)
				condicao = "TT";
		}

		// no angulo
		if (condicao.equals("G")) 
			if ((x == 2 && y == 2) || (x == 2 && y == 15) ) 
				condicao = "A";
			
		this.mapeamentoGol = condicao; //condicao fina do chute
	}

	public int getId() {
		return id;
	}

	public int getForca() {
		return forca;
	}

	public int getQuadrante() {
		return quadrante;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public String getMapeamentoGol() {
		return mapeamentoGol;
	}

	public void setMapeamentoGol(String mapeamentoGol) {
		this.mapeamentoGol = mapeamentoGol;
	}

}
