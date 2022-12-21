package codigos;

import java.util.Calendar;

public class Atendimento {
	
	private String cliente;
	private Calendar data;
	private String listaDeServicos;
	private String cabeleireiro;
	
	public String getCliente() {
		return cliente;
	}
	public void setCliente(String cliente) {
		this.cliente = cliente;
	}
	public Calendar getData() {
		return data;
	}
	public void setData(Calendar data) {
		this.data = data;
		
	}
	public String getListaDeServicos() {
		return listaDeServicos;
	}
	public void setListaDeServicos(String listaDeServicos) {
		this.listaDeServicos = listaDeServicos;
	}
	public String getCabeleireiro() {
		return cabeleireiro;
	}
	public void setCabeleireiro(String cabeleireiro) {
		this.cabeleireiro = cabeleireiro;
	}
	public Atendimento(String cliente) {
		super();
		this.cliente = cliente;
		data = Calendar.getInstance();
	}
	


}
