package sistemaDeAvaliacaoDeGoleiros;

import java.util.ArrayList;

public class Selecao {
	private String nome;
	private ArrayList<Goleiro> goleiros = new ArrayList<>();
	
	public Selecao(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public ArrayList<Goleiro> getGoleiro() {
		return goleiros;
	}
	
	public void adicionarGoleiro(Goleiro goleiro) {
		this.goleiros.add(goleiro);
	}
}
