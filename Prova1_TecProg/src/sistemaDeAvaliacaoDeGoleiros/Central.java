package sistemaDeAvaliacaoDeGoleiros;

import java.util.ArrayList;
import java.util.Random;

public class Central {
	private ArrayList<Pixel> pixels = new ArrayList<>();
	private ArrayList<Chute> chutes = new ArrayList<>();
	private ArrayList<Selecao> selecoes = new ArrayList<>();

	public Pixel sortearPosicaoDoGoleiro(Chute chute) {
		Random random = new Random();
		Pixel pixel = new Pixel();

		while (pixel.getQuadrante() != chute.getQuadrante()) {
			pixel.setX(random.nextInt(10)); //eixo X do gol
			pixel.setY(random.nextInt(18));	//eixo Y do gol
			pixel.verificacaoDoQuadrante(); //verifica em qual quadrante do gol o chute foi
		} 
		
		return pixel;
	}

	public void verificandoChute() {

		for (Selecao selecao : selecoes) {
			for (Goleiro goleiro : selecao.getGoleiro()) {
				for (Chute chute : chutes) {
					Pixel pixel = sortearPosicaoDoGoleiro(chute);  	//sortear posicao do goleiro
					verificarChute(pixel, chute, goleiro);			//verificando chute
				}
			}
		}

	}

	public void verificarChute(Pixel pixel, Chute chute, Goleiro goleiro) {
		int x = pixel.getX(), y = pixel.getY(), contador = 0, auxiliar, atuacao = goleiro.getAAG();
		boolean defesaDoGoleiro = false;

		if (atuacao % 4 == 0)
			auxiliar = (atuacao / 4) - 1;
		else
			auxiliar = atuacao / 4;

		Chute chuteAuxiliar = new Chute(chute);

		while ((atuacao > 0 && defesaDoGoleiro == false)) {
			if (contador < 4) {
				if (x == chute.getX() && y == chute.getY()) {
					if (contador == 3) {

						if (goleiro.getForca() >= chute.getForca()) {
							defesaDoGoleiro = true;
						} else {
							goleiro.addGolDeChuteComForcaMaior();
							defesaDoGoleiro = false;
						}

					} else if (y == pixel.getY() + auxiliar) {
						if (goleiro.getForca() >= chute.getForca()) {
							defesaDoGoleiro = true;
						} else {
							goleiro.addGolDeChuteComForcaMaior();
							defesaDoGoleiro = false;
						}

					} else {
						defesaDoGoleiro = true;
					}
				}
				atuacao--;
				contador++;
				x = x > 0 ? x -= 1 : pixel.getX(); //utilização do if mais compacto
			} else {
				x = pixel.getX();
				y = y < 17 ? y += 1 : y; //utilizacao do if mais compacto
				contador = 0;
			}

		}

		if (defesaDoGoleiro == true) {
			chute.conferirPosicaoDoChute();
			if (chute.getMapeamentoGol().equals("G") || chute.getMapeamentoGol().equals("A")) {
				chuteAuxiliar.setMapeamentoGol("DEFESA");
				goleiro.addTotalDeChutes(chuteAuxiliar);
			} else {
				chuteAuxiliar.setMapeamentoGol(chute.getMapeamentoGol());
				goleiro.addTotalDeChutes(chuteAuxiliar);
			}

		} else {
			chute.conferirPosicaoDoChute();
			if (chute.getMapeamentoGol().equals("G") || chute.getMapeamentoGol().equals("A")) {
				chuteAuxiliar.setMapeamentoGol("GOL");
				goleiro.addTotalDeChutes(chuteAuxiliar);
			} else {
				chuteAuxiliar.setMapeamentoGol(chute.getMapeamentoGol());
				goleiro.addTotalDeChutes(chuteAuxiliar);
			}

		}

	}
	
//	1) O sistema deverá mostrar a média de quantos chutes os goleiros de cada seleção
//	conseguiram pegar
	public String questao1() {
		String visualizacaoTotal = "MÉDIA DE DEFESAS DOS GOLEIROS DE CADA SELEÇÃO:";
		double media = 0;

		for (Selecao selecao : selecoes) {
			double soma = 0;
			for (Goleiro goleiro : selecao.getGoleiro()) {
				soma += goleiro.contarQuantidadeDeDefesas(); //somar todas as defesas
			}
			media = soma / selecao.getGoleiro().size(); //calcula a media
			visualizacaoTotal += "\n" + selecao.getNome() + " | " + "Media de Defesas do Goleiro: " + String.format("%.1f", media); //funcao java pra limitar casas decimais 
		}

		return visualizacaoTotal;

	}

//	2) O sistema deverá gerar a pontuação dos goleiros de cada seleção e informar qual é
//	o goleiro mais indicado para ser o titular.
	public String questao2() {
		String visualizacaoTotal = "\nPONTUAÇÃO DOS GOLEIROS DE CADA SELEÇÃO:";
		
		for (Selecao selecao : selecoes) {
			visualizacaoTotal += "\n" + selecao.getNome().toUpperCase() + "\n";
			int maiorNumeroDefesas = 0;
			String nomeGoleiroTitular = "";
			
			for (Goleiro goleiro : selecao.getGoleiro()) {
				
				visualizacaoTotal += goleiro.getNome() + " | Quantiade de Defesas: " + goleiro.contarQuantidadeDeDefesas() + "\n";
				if (goleiro.contarQuantidadeDeDefesas() > maiorNumeroDefesas) {
					maiorNumeroDefesas = goleiro.contarQuantidadeDeDefesas();
					nomeGoleiroTitular = goleiro.getNome();
				}
			}
			visualizacaoTotal += "GOLEIRO TITULAR: " + nomeGoleiroTitular;
		}
		
		return visualizacaoTotal;
	}

//	3) O sistema deverá mostrar a média de quantos gols os goleiros de cada seleção
//	levou.
	public String questao3() {
		String visualizacaoTotal = "\nMÉDIA DE GOLS SOFRIDOS PELOS GOLEIROS DE CADA SELEÇÃO:";

		for (Selecao selecao : selecoes) {
			double somaDeGolsSofridos = 0;
			double media = 0;
			for (Goleiro goleiro : selecao.getGoleiro()) {
				somaDeGolsSofridos += goleiro.contarQuantidadeDeDefesas();
			}
			media = somaDeGolsSofridos / selecao.getGoleiro().size();
			visualizacaoTotal += "\n" + selecao.getNome() + ": " + String.format("%.1f", media);
		}

		return visualizacaoTotal;
	}

//	4) O sistema deverá mostrar para a lista de chutes, quantos chutes foram para fora,
//	quantos acertaram a trave do lado esquerdo, quantos acertaram a trave do lado
//	direito e quantos acertaram a trave do lado direito. obs: essa computação é feita
//	apenas uma vez, a lista de chutes é a mesma para cada goleiro
	public String questao4() {
		String visualizacaoTotal = "\nVISUALIZAÇÃO DOS CHUTES:\n";
		int traveDireita = 0, traveEsquerda = 0, travessao = 0, fora = 0, angulo = 0;
		
		for (Chute chute : chutes) {
			chute.conferirPosicaoDoChute();
			if (chute.getMapeamentoGol().equals("TD")) {
				traveDireita++;
			} else if (chute.getMapeamentoGol().equals("TE")) {
				traveEsquerda++;
			} else if (chute.getMapeamentoGol().equals("TT")) {
				travessao++;
			} else if (chute.getMapeamentoGol().equals("F")) {
				fora++;
			}
		}
		
		visualizacaoTotal += "Trave Direita: " + traveDireita;
		visualizacaoTotal += "\nTrave Esquerda: " + traveEsquerda;
		visualizacaoTotal += "\nTravessão: " + travessao;
		visualizacaoTotal += "\nFora do Gol: " + fora;

		return visualizacaoTotal;
	}

//	5) O sistema deverá mostrar os gols feitos no ângulo do gol.
	public String questao5() {
		int angulo = 0;
		String visualizacaoTotal = "\nCHUTES NO ÂNGULO: ";
		for (Chute chute : chutes) {
			chute.conferirPosicaoDoChute();
			if (chute.getMapeamentoGol().equals("A"))
				angulo++;
		}

		visualizacaoTotal += angulo;

		return visualizacaoTotal;
	}
	
//	6) O sistema deverá indicar as seleções que tem os 3 melhores goleiros (ou seja quem
//	menos tomam gols).
	public String questao6() {
		String visualizacaoTotal = "\nTOP 3 MELHORES SELEÇÕES EM QUANTIDADE DE DEFESAS:";
		int indiceDoGoleiroIndicado = 0, indiceDaSelecaoDoGoleiro = 0, quantidadeDeIndicados = 3;
		
		ArrayList<Selecao> selecao = selecoes;

		for (int i = 0; i < quantidadeDeIndicados; i++) { // já informados que são só 3 goleiros, vamos utilizar esse tipo de laço for
			int maiorNumeroDeDefesas = 0;
			
			for (Selecao selecaoAuxiliar : selecao) {
				for (Goleiro goleiro : selecaoAuxiliar.getGoleiro()) {
					if (goleiro.contarQuantidadeDeDefesas() > maiorNumeroDeDefesas) {
						maiorNumeroDeDefesas = goleiro.contarQuantidadeDeDefesas();
						indiceDoGoleiroIndicado = selecaoAuxiliar.getGoleiro().indexOf(goleiro);
						indiceDaSelecaoDoGoleiro = selecao.indexOf(selecaoAuxiliar);
					}
				}
			}
			visualizacaoTotal += "\nTOP" + (i+1) + ": " +  selecao.get(indiceDaSelecaoDoGoleiro).getNome() + " | Quantidade de Defesas: " + selecao.get(indiceDaSelecaoDoGoleiro).getGoleiro().get(indiceDoGoleiroIndicado).contarQuantidadeDeDefesas();
			selecao.get(indiceDaSelecaoDoGoleiro).getGoleiro().remove(indiceDoGoleiroIndicado); //tira o que tiver mais defesas 
		}

		return visualizacaoTotal;
	}

//	7) O sistema deverá mostrar as ocorrências em que o goleiro conseguiu chegar na bola
//	mas por causa da sua força ser menor que do chute não conseguiu efetuar a defesa
	public String questao7() {
		String visualizacaoTotal = "\nQUANTIDADE DE VEZES DE GOLS SOFRIDOS POR FORÇA MAIOR DO CHUTE: ";
		int somaTotalDeGols = 0;
		
		for (Selecao selecao : selecoes) {
			for (Goleiro goleiro : selecao.getGoleiro()) {
				somaTotalDeGols += goleiro.getGolDeChuteComForcaMaior();
			}
		}
		
		visualizacaoTotal += somaTotalDeGols;

		return visualizacaoTotal;

	}

//	8) O sistema deverá imprimir para cada goleiro as seguintes informações:
//		Nome, seleção, gols defendidos, gols tomados e AAG.
	public String questao8() {
		String visualizacaoTotal = "\nGOLEIROS (Nome, seleção, gols defendidos, gols tomados e AAG): ";
		
		for (Selecao selecao : selecoes) {
			for (Goleiro goleiro : selecao.getGoleiro()) {
				visualizacaoTotal += "\n" + goleiro.getNome() + " - " + selecao.getNome() + " - "
						+ goleiro.contarQuantidadeDeDefesas() + " - " + goleiro.contarQuantidadeDeGolsFeitos() + " - "
						+ goleiro.getAAG();
			}
		}
		
		return visualizacaoTotal;
	}

	public void addPixel(Pixel pixel) {
		this.pixels.add(pixel);
	}

	public void adicionarChute(Chute chute) {
		this.chutes.add(chute);
	}

	public void adicionarSelecao(Selecao selecao) {
		this.selecoes.add(selecao);
	}

	public ArrayList<Pixel> getPixels() {
		return pixels;
	}

	public ArrayList<Chute> getChutes() {
		return chutes;
	}

	public ArrayList<Selecao> getSelecoes() {
		return selecoes;
	}

}