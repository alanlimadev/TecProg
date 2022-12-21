package codigos;

public class Servico {

	private int id;
	private String nome;
	private int valor;
	private String descricao;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		if (id > 0)
			this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		if (nome.length() > 5)
			this.nome = nome;
	}

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		if (valor >= 0)
			this.valor = valor;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		if (descricao.length() > 10)
			this.descricao = descricao;
	}

}
