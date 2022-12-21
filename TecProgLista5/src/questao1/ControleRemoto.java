package questao1;

public class ControleRemoto {
	private int volume;
	private int canal;
	
	public ControleRemoto(){
		this.volume = 7;
		this.canal = 5;
	}
	
	public int aumentarVolume() {
		return this.volume += 1;
	}
	
	public int diminuirVolume() {
		return this.volume -= 1;
	}
	
	public int proximoCanal() {
		return this.canal += 1;
	}
	
	public int voltarCanal() {
		return this.canal -= 1;
	}
	
	public int trocarCanal(int canal) {
		return this.canal = canal;
	}
	
	public int volumeAtual(){
		return canal;
	}
	
	public int canalAtual() {
		return canal;
	}

}