package disputaDePenaltis;

import java.util.ArrayList;

public class ProcessamentoDados {
	private String nome;
	private ArrayList<Pixels> pixels;

	public ProcessamentoDados() {
		this.pixels = new ArrayList<>();
	}

	public void alimentarDadosDoJogador(int chuteX, int chuteY, ArrayList<Pixels> p) {
		Pixels pixel = mapearPosicao(chuteX, chuteY, p);

		if (pixel instanceof AreaDoGoleiro) {
			pixel.addDefesasRealizadas();
		} else if (pixel instanceof GolAreaDentro) {
			pixel.addGolsFeitos();
		}
		pixels.add(pixel);
	}

	private Pixels mapearPosicao(int chuteX, int chuteY, ArrayList<Pixels> pixel) {
		for (Pixels pixels : pixel) {
			if (pixels.getPosicaoX() == chuteX && pixels.getPosicaoY() == chuteY) {
				return pixels;
			}
		}
		return null;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int totalGols() {
		int totalGols = 0;
		for (Pixels pixel : pixels) {
			totalGols += pixel.getGolsFeitos();
		}
		return totalGols;
	}

	public int totalDefesas() {
		int totalDefesas = 0;
		for (Pixels pixel : pixels) {
			totalDefesas += pixel.getDefesasRealizadas();
		}
		return totalDefesas;
	}

	public ArrayList<Pixels> getPixels() {
		return pixels;
	}
}