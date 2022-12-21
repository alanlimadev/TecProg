package disputaDePenaltis;

import java.util.ArrayList;

public class GolCompleto {
	private ArrayList<Pixels> pixels;
	private int linhas, colunas;

	public GolCompleto(int linhas, int colunas) {
		this.pixels = new ArrayList<>();
		this.colunas = colunas;
		this.linhas = linhas;
		mapearGol();
	}

	private void mapearGol() {
		traveEsquerda();
		traveDireita();
		travessao();
		golAreaDentro();
		areaForaGol();
	}

	private void traveEsquerda() {
		for (int i = 2; i < linhas; i++) {
			pixels.add(new Traves(i, 1));
		}
	}

	private void traveDireita() {
		for (int i = 2; i < linhas; i++) {
			pixels.add(new Traves(i, colunas - 2));
		}
	}

	private void travessao() {
		for (int i = 1; i < colunas - 1; i++) {
			pixels.add(new Traves(1, i));
		}
	}

	private void golAreaDentro() {
		for (int i = 2; i < linhas; i++) {
			for (int j = 2; j < colunas - 2; j++) {
				pixels.add(new GolAreaDentro(i, j));
			}
		}
	}

	private void areaForaGol() {
		for (int i = 1; i < linhas; i++) {
			pixels.add(new GolFora(i, 0));
		}
		for (int i = 0; i < colunas; i++) {
			pixels.add(new GolFora(0, i));
		}
		for (int i = 1; i < linhas; i++) {
			pixels.add(new GolFora(i, colunas - 1));
		}
	}

	public ArrayList<Pixels> getPixels() {
		return pixels;
	}

	public int getLinhas() {
		return linhas;
	}

	public int getColunas() {
		return colunas;
	}
}
