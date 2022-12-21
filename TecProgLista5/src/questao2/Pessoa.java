package questao2;

public class Pessoa {

	private int idade;
	private int dia;
	private int mes;
	private int ano;
	private String nome;

	public void ajustaDataDeNascimento(int dia, int mes, int ano) {
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}
	
	public void calculaIdade(int dia, int mes, int ano) {
		if(this.mes < mes) {
			idade = ano - this.ano - 1;
		}else if(this.mes == mes && this.dia < dia) {
			idade = ano - this.ano - 1;
		}else {
			idade = ano - this.ano;
		}
	}
	
	public int informaIdade(){
		return idade;
	}
	
	public String informaNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
}