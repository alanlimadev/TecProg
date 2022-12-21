package sistemaDeAvaliacaoDeGoleiros;

import java.util.ArrayList;

public class Main {
	
	public static Central inicializandoCentral() {
		Central central = new Central();
		
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 18; j++) {
				Pixel pixel = new Pixel();
				pixel.setX(i);
				pixel.setY(j);
				pixel.posicaoDoChute();
				pixel.verificacaoDoQuadrante();
				central.addPixel(pixel);
			}
		}
		
		inicializandoChutes(central);
		inicializandoCadaSelecao(central);
		
		return central;
	}
	
	public static void inicializandoCadaSelecao(Central central) {
		ArrayList<Goleiro> goleiro = inicializandoGoleiros();
		
		//seleções selecionadas
		Selecao selecao1 = new Selecao("Brasil");
		Selecao selecao2 = new Selecao("Gana");
		Selecao selecao3 = new Selecao("Servia");
		Selecao selecao4 = new Selecao("Argentina");
		Selecao selecao5 = new Selecao("Alemanha");
		
		for (int i = 0; i < goleiro.size(); i++) {
			if (i < 5) {
				selecao1.adicionarGoleiro(goleiro.get(i));
			} else if (i < 10) {
				selecao2.adicionarGoleiro(goleiro.get(i));
			} else if (i < 15) {
				selecao3.adicionarGoleiro(goleiro.get(i));
			} else if (i < 20) {
				selecao4.adicionarGoleiro(goleiro.get(i));
			} else if( i >= 20){
				selecao5.adicionarGoleiro(goleiro.get(i));
			}
		}
		
		central.adicionarSelecao(selecao1);
		central.adicionarSelecao(selecao2);
		central.adicionarSelecao(selecao3);
		central.adicionarSelecao(selecao4);
		central.adicionarSelecao(selecao5);

	}
	
	public static ArrayList<Goleiro> inicializandoGoleiros() {
		ArrayList<Goleiro> goleiros = new ArrayList<>();
		
		//instanciando e preenchendo os atributos
		//indice, nome, velocidade, flexibilidade, agilidade, coordenacao, forca, equilibrio
		goleiros.add(new Goleiro(1, "Pratik Skaggs", 5, 7, 8, 9, 6, 6));
		goleiros.add(new Goleiro(2, "Uehudah Hack", 9, 6, 8, 8, 7, 10));
		goleiros.add(new Goleiro(3, "Edison Drye", 5, 8, 5, 8, 10, 7));
		goleiros.add(new Goleiro(4, "Ajani Harding", 6, 6, 5, 8, 7, 6));
		goleiros.add(new Goleiro(5, "Orazio Hart", 5, 8, 7, 9, 9, 10));
		goleiros.add(new Goleiro(6, "Tristan Karns", 9, 7, 10, 7, 7, 6));
		goleiros.add(new Goleiro(7, "Niven Glaser", 10, 9, 7, 6, 5, 8));
		goleiros.add(new Goleiro(8, "Derwyn Devers", 10, 7, 9, 5, 9, 5));
		goleiros.add(new Goleiro(9, "Tod Phan", 10, 7, 7, 5, 5, 6));
		goleiros.add(new Goleiro(10, "Eddie Hulse", 7, 6, 5, 9, 7, 5));
		goleiros.add(new Goleiro(11, "Welford Yepez", 5, 8, 8, 7, 7, 8));
		goleiros.add(new Goleiro(12, "Rishley Snyder", 6, 5, 6, 5, 7, 6));
		goleiros.add(new Goleiro(13, "Milo Mccurdy", 10, 9, 8, 6, 10, 9));
		goleiros.add(new Goleiro(14, "Carden Justus", 8, 5, 8, 5, 10, 7));
		goleiros.add(new Goleiro(15, "Carlyon Gorby", 8, 5, 8, 8, 8, 6));
		goleiros.add(new Goleiro(16, "Mungo Spangler", 8, 10, 9, 8, 9, 5));
		goleiros.add(new Goleiro(17, "Whitmore Squires", 9, 10, 7, 9, 9, 10));
		goleiros.add(new Goleiro(18, "Pedrog Mccurdy", 8, 5, 10, 5, 7, 7));
		goleiros.add(new Goleiro(19, "Ridgley Leo", 8, 8, 8, 9, 9, 9));
		goleiros.add(new Goleiro(20, "Bolton Tarin", 9, 8, 7, 6, 9, 10));
		goleiros.add(new Goleiro(21, "Edison Loy", 7, 7, 5, 10, 10, 7));
		goleiros.add(new Goleiro(22, "Delling Herndon", 7, 5, 5, 8, 9, 9));
		goleiros.add(new Goleiro(23, "Senichi Iorio", 7, 7, 5, 8, 10, 5));
		goleiros.add(new Goleiro(24, "Albin Kerner", 6, 7, 8, 8, 9, 9));
		goleiros.add(new Goleiro(25, "Jivin Justus", 9, 10, 8, 7, 7, 5));
		goleiros.add(new Goleiro(26, "Clement Fleisher", 10, 9, 10, 5, 7, 8));
		
		return goleiros;
	}
	
	public static void inicializandoChutes(Central central) {
		
		//instanciando e preenchendo os atributos
		//id, força, quadrante, posição no eixo X, posição no eixo Y
		central.adicionarChute(new Chute(1, 2, 1, 4, 7));
		central.adicionarChute(new Chute(2, 6, 1, 3, 6));
		central.adicionarChute(new Chute(3, 9, 2, 4, 15));
		central.adicionarChute(new Chute(4, 5, 4, 6, 11));
		central.adicionarChute(new Chute(5, 3, 4, 8, 13));
		central.adicionarChute(new Chute(6, 3, 3, 6, 4));
		central.adicionarChute(new Chute(7, 4, 4, 5, 8));
		central.adicionarChute(new Chute(8, 7, 4, 7, 14));
		central.adicionarChute(new Chute(9, 8, 4, 7, 14));
		central.adicionarChute(new Chute(10, 4, 4, 6, 12));
		central.adicionarChute(new Chute(11, 2, 4, 5, 15));
		central.adicionarChute(new Chute(12, 7, 3, 6, 4));
		central.adicionarChute(new Chute(13, 3, 3, 8, 2));
		central.adicionarChute(new Chute(14, 9, 4, 7, 10));
		central.adicionarChute(new Chute(15, 10, 4, 7, 12));
		central.adicionarChute(new Chute(16, 5, 1, 4, 2));
		central.adicionarChute(new Chute(17, 3, 4, 5, 13));
		central.adicionarChute(new Chute(18, 10, 2, 4, 16));
		central.adicionarChute(new Chute(19, 10, 4, 5, 16));
		central.adicionarChute(new Chute(20, 10, 2, 3, 14));
		central.adicionarChute(new Chute(21, 9, 2, 1, 8));
		central.adicionarChute(new Chute(22, 4, 4, 8, 16));
		central.adicionarChute(new Chute(23, 8, 4, 6, 14));
		central.adicionarChute(new Chute(24, 7, 4, 7, 11));
		central.adicionarChute(new Chute(25, 6, 1, 0, 3));
		central.adicionarChute(new Chute(26, 5, 3, 6, 7));
		central.adicionarChute(new Chute(27, 3, 3, 8, 4));
		central.adicionarChute(new Chute(28, 4, 3, 6, 7));
		central.adicionarChute(new Chute(29, 10, 2, 2, 13));
		central.adicionarChute(new Chute(30, 7, 3, 5, 3));

	}
	
	public static void main(String[] args) {
		
		Central central = inicializandoCentral();
		
		central.verificandoChute(); //carregar chutes
		
		System.out.println(central.questao1());
		System.out.println(central.questao2());
		System.out.println(central.questao3());
		System.out.println(central.questao4());
		System.out.println(central.questao5());
		System.out.println(central.questao6());
		System.out.println(central.questao7());
		System.out.println(central.questao8());
	}

}
