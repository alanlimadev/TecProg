package disputaDePenaltis;

import java.util.Random;

public class SortearPosicaoGoleiro {

	private AreaDoGoleiro areaDoGoleiro;
	private GolCompleto golCompleto;

	public SortearPosicaoGoleiro(GolCompleto golCompleto) {
		this.golCompleto = golCompleto;
		sortearPosicao();
	}

	private void sortearPosicao() {
		Random random = new Random();
		sortearGoleiro(random);
	}

	private void sortearGoleiro(Random random) {
		int x = golCompleto.getLinhas() - 1;
		int y = random.nextInt(golCompleto.getColunas());
		areaDoGoleiro = new AreaDoGoleiro(x, y);
	}

	public AreaDoGoleiro getAreaDoGoleiro() {
		return areaDoGoleiro;
	}
}
