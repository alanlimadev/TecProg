package sistemaDeAvaliacaoDeGoleiros;

import java.util.ArrayList;

public class Goleiro {
	private int id;
	private String nome;
	private int velocidade;
	private int flexibilidade;
	private int agilidade;
	private int coordenacao;
	private int forca;
	private int equilibrio;
	private int AAG;

	// atributos adicionais
	private int golDeChuteComForcaMaior = 0; //exceção: a força do chute sendo mais forte que a força do goleiro = gol
	private ArrayList<Chute> totalDeChutes = new ArrayList<>();

	public Goleiro(int id, String nome, int velocidade, int flexibilidade, int agilidade, int coordenacao, int forca, int equilibrio) {
		super();
		this.id = id;
		this.nome = nome;
		this.velocidade = velocidade;
		this.flexibilidade = flexibilidade;
		this.agilidade = agilidade;
		this.coordenacao = coordenacao;
		this.forca = forca;
		this.equilibrio = equilibrio;
		this.AAG = (((velocidade * 3) + (flexibilidade * 2) + (agilidade * 3) + (coordenacao * 2) + (forca) + (equilibrio * 2)) / 8);
	}

	public int contarQuantidadeDeDefesas() { //informa a quantidade de defesas do goleiro
		int quantidadeDeDefesas = 0;
		for (Chute totalDeChute : totalDeChutes) {
			if (totalDeChute.getMapeamentoGol().equals("DEFESA"))
				quantidadeDeDefesas++;
		}
		return quantidadeDeDefesas;
	}
	
	public int contarQuantidadeDeGolsFeitos() { //informa a quantidade de gols sofridos 
		int quantidadeDeGols = 0;
		for(Chute totalDeChute : totalDeChutes) {
			if(totalDeChute.getMapeamentoGol().equals("GOL"))
				quantidadeDeGols++;
		}
		return quantidadeDeGols;
	}

	public int getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public int getForca() {
		return forca;
	}

	public int getAAG() {
		return AAG;
	}

	public int getGolDeChuteComForcaMaior() {
		return golDeChuteComForcaMaior;
	}

	public void addGolDeChuteComForcaMaior() {
		golDeChuteComForcaMaior++;
	}

	public ArrayList<Chute> getTotalDeChutes() {
		return totalDeChutes;
	}

	public void addTotalDeChutes(Chute chute) {
		totalDeChutes.add(chute);
	}

}