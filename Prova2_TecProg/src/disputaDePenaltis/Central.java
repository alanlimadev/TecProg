package disputaDePenaltis;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Central implements ActionListener {
	private GolCompleto golCompleto;
	private ProcessamentoDados processamentoDados;
	private SortearPosicaoGoleiro sorteadorPosicaoGoleiro;
	private Goleiro goleiro;
	private Janela janela;

	public Central() {
		golCompleto = new GolCompleto(9, 17);
		processamentoDados = new ProcessamentoDados();
		janela = new Janela("Disputa de Pênaltis", golCompleto, this, processamentoDados);
	}

	public void iniciar(int x, int y) {
		golCompleto = new GolCompleto(9, 17);
		sorteadorPosicaoGoleiro = new SortearPosicaoGoleiro(golCompleto);
		goleiro = new Goleiro(sorteadorPosicaoGoleiro, golCompleto.getPixels());
		goleiro.mapearArea();
		processamentoDados.alimentarDadosDoJogador(x, y, goleiro.getPixels());
	}

	public void mudarLabel(Pixels pixels) {
		goleiro.addChute(pixels.getPosicaoX(), pixels.getPosicaoY());
		LabelBotoes label = new LabelBotoes(goleiro);
		janela.addlabel(label);
	}

	@Override
	public void actionPerformed(ActionEvent actionEvent) {
		Pixels pixels = (Pixels) actionEvent.getSource();
		iniciar(pixels.getPosicaoX(), pixels.getPosicaoY());
		mudarLabel(pixels);
	}
}