package codigos;

import java.util.Calendar;

public class Agendamento {

	private int id;
	private Calendar data;
	private String cliente;
	private int hora;
	private int minuto;
	private String cabeleireiro;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Calendar getData() {
		return data;
	}
	public void setData(Calendar data) {
		this.data = data;
		
	}
	public String getCliente() {
		return cliente;
	}
	public void setCliente(String cliente) {
		this.cliente = cliente;
	}
	public Agendamento(String cliente, String cabeleireiro) {
		super();
		this.cliente = cliente;
		this.cabeleireiro = cabeleireiro;
		data = Calendar.getInstance();
	}
	public int getHora() {
		return hora;
	}
	public void setHora(int hora) {
		this.hora = hora;
	}
	public int getMinuto() {
		return minuto;
	}
	public void setMinuto(int minuto) {
		this.minuto = minuto;
	}
	public String getCabeleireiro() {
		return cabeleireiro;
	}
	public void setCabeleireiro(String cabeleireiro) {
		this.cabeleireiro = cabeleireiro;
	}
	
	
}
