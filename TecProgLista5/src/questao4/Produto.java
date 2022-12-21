package questao4;

public class Produto {
	private String nomeDoProduto;
	private double precoDeCusto;
	private double precoDevenda;
	private double margemDeLucro;
	private double despesasDaEmpresa;

	public double calcularMargemDeLucro() {
		return (((precoDevenda - (precoDeCusto + despesasDaEmpresa)) / precoDevenda) * 100);
	}

	public void setnomeDoProduto(String nomeDoProduto) {
		this.nomeDoProduto = nomeDoProduto;
	}
	
	public void setprecoDeCusto(double precoDeCusto) {
		this.precoDeCusto = precoDeCusto;
	}
	
	public void setprecoDevenda(double precoDevenda) {
		this.precoDevenda = precoDevenda;
	}
	
	public double getmargemDeLucro() {
		return margemDeLucro;
	}
	
	public void setdespesasDaEmpresa(double despesasDaEmpresa) {
		this.despesasDaEmpresa = despesasDaEmpresa;
	}
	
}