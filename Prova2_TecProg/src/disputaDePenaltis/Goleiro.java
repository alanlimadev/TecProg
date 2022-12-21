package disputaDePenaltis;

import java.util.ArrayList;
import java.util.Random;

public class Goleiro {
	private ArrayList<Pixels> pixels;
	private AreaDoGoleiro areaDoGoleiro;

	public Goleiro(SortearPosicaoGoleiro sortearAreaGoleiro, ArrayList<Pixels> pixels) {
		this.areaDoGoleiro = sortearAreaGoleiro.getAreaDoGoleiro();

		this.pixels = pixels;
	}

	public void mapearArea() {
		addPosicaoInicial(areaDoGoleiro);
		criarAreadeAtuacao();
	}

	private void addPosicaoInicial(Pixels pixel) {
		pixels.remove(buscarPixel(pixel.getPosicaoX(), pixel.getPosicaoY()));
		pixels.add(pixel);
	}

	private Pixels buscarPixel(int x, int y) {
		for (Pixels pixel : pixels) {
			if (pixel.getPosicaoX() == x && pixel.getPosicaoY() == y) {
				return pixel;
			}
		}
		return null;
	}

	public void addArea(int x, int y) {
		pixels.remove(buscarPixel(x, y));
		pixels.add(new AreaDoGoleiro(x, y));
	}

	private void criarAreadeAtuacao() {
		Random random = new Random();
		int limite = random.nextInt(8);
		for (int x = areaDoGoleiro.getPosicaoX() - 1; x >= limite; x--) {
			int y = areaDoGoleiro.getPosicaoY();
			addArea(x, y);
		}
	}

	public void addChute(int x, int y) {
		pixels.remove(buscarPixel(x, y));
		pixels.add(new Chute(x, y));
	}

	public ArrayList<Pixels> getPixels() {
		return pixels;
	}
}
