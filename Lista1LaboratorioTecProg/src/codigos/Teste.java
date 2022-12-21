package codigos;

public class Teste {

	public static void main(String[] args) {
		
		Cliente cliente1 = new Cliente("123456789");
		cliente1.setId(2);
		cliente1.setNome("Rui");
		
		Cliente cliente2 = new Cliente("987654321");
		cliente2.setId(3);
		cliente2.setNome("Luis");
		
		Cliente cliente3 = new Cliente("777666");
		cliente3.setId(7);
		cliente3.setNome("Ficher");
		
		Atendimento atendimento1 = new Atendimento("Valdenir");
		atendimento1.setListaDeServicos("Colocar a régua");
		atendimento1.setCabeleireiro("Alan");
		
		Atendimento atendimento2 = new Atendimento("Nilena");
		atendimento2.setListaDeServicos("Alisar");
		atendimento2.setCabeleireiro("Daniele");
		
		Atendimento atendimento3 = new Atendimento("Fernando");
		atendimento3.setListaDeServicos("Moicano de cria");
		atendimento3.setCabeleireiro("Pajé");
		
		Servico servico1 = new Servico();
		servico1.setId(1);
		servico1.setNome("Tiago");
		servico1.setValor(23);
		servico1.setDescricao("Lavar os pés");

		Servico servico2 = new Servico();
		servico2.setId(2);
		servico2.setNome("Gui");
		servico2.setValor(150);
		servico2.setDescricao("Cortar as unhas");
		
		Servico servico3 = new Servico();
		servico3.setId(3);
		servico3.setNome("Wendel");
		servico3.setValor(67);
		servico3.setDescricao("Lavar os sapatos");
		
		Agendamento agendamento1 = new Agendamento("Dani", "Emily");
		agendamento1.setId(1);
		agendamento1.setHora(10);
		agendamento1.setMinuto(40);
		
		Agendamento agendamento2 = new Agendamento("Dani", "Emily");
		agendamento2.setId(2);
		agendamento2.setHora(11);
		agendamento2.setMinuto(55);
		
		Agendamento agendamento3 = new Agendamento("Dani", "Emily");
		agendamento3.setId(3);
		agendamento3.setHora(7);
		agendamento3.setMinuto(20);
		
		Cabelereiro cabelereiro1 = new Cabelereiro("123456789", "Naiara");
		cabelereiro1.setId(1);
		
		Cabelereiro cabelereiro2 = new Cabelereiro("567891", "Artur");
		cabelereiro2.setId(2);
		
		Cabelereiro cabelereiro3 = new Cabelereiro("7777777", "Diogo");
		cabelereiro3.setId(3);
		
	}

}
