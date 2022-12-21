package codigos;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		
		Scanner input = new Scanner(System.in);
		
		//2) Usuario informando os dados
		
		//cliente
		System.out.print("CLIENTE\nInforme os seguintes dados:\nCPF: ");
		String cpf = input.next();
		Cliente cliente4 = new Cliente(cpf);
		System.out.print("Informe o nome: ");
		cliente4.setNome(input.next());
		System.out.print("Informe o id: ");
		cliente4.setId(input.nextInt());
		
		//atendimento
		System.out.print("ATENDIMENTO\nInforme o cliente: ");
		String cliente = input.next();
		Atendimento atendimento4 = new Atendimento(cliente);
		System.out.print("Informe os serviços: ");
		atendimento4.setListaDeServicos(input.next());
		System.out.print("Informe o cabeleireiro: ");
		atendimento4.setCabeleireiro(input.next());
		
		//serviço
		System.out.print("SERVIÇO\nInforme o id: ");
		Servico servico4 = new Servico();
		System.out.print("SERVIÇO\nInforme o id: ");
		servico4.setId(input.nextInt());
		System.out.print("Informe o nome: ");
		servico4.setNome(input.next());
		System.out.print("Informe o valor do serviço: ");
		servico4.setValor(input.nextInt());
		System.out.print("Descrição do serviço: ");
		servico4.setDescricao(input.next());
		
		//agendamento
		System.out.print("AGENDAMENTO\nInforme o cabeleleiro: ");
		String cabeleireiro = input.next();
		System.out.print("Informe o cliente: ");
		String cliente1 = input.next();
		Agendamento agendamento4 = new Agendamento(cliente1, cabeleireiro);
		System.out.println("Informe a hora e o minuto: ");
		agendamento4.setHora(input.nextInt());
		agendamento4.setMinuto(input.nextInt());
		System.out.print("Informe o id: ");
		agendamento4.setId(input.nextInt());
		
		//cabeleileiro
		System.out.print("CABELEREIRO\nInforme o CPF");
		String cpf1 = input.next();
		System.out.print("Informe o nome: ");
		String nome = input.next();
		Cabelereiro cabelereiro4 = new Cabelereiro(cpf1, nome);
		System.out.print("Informe o id: ");
		cabelereiro4.setId(input.nextInt());
		
		//3)Imprimindo dados informados
		
		//cliente
		System.out.println("CLIENTE");
		System.out.println("Id: " + cliente4.getId());
		System.out.println("CPF: " + cliente4.getCpf());
		System.out.println("Nome: " + cliente4.getNome());
		
		//atendimento		
		System.out.println("CABELEIREIRO");
		System.out.println("\nCliente: " + atendimento4.getCliente());
		System.out.println("Data" + atendimento4.getData());
		System.out.println("Lista de serviços: " + atendimento4.getListaDeServicos());
		System.out.println("Cabeleireiro: " + atendimento4);
		
		//serviço
		System.out.println("SERVIÇOS");
		System.out.println("\nId: " + servico4.getId());
		System.out.println("Nome: " + servico4.getNome());
		System.out.println("Valor: " + servico4.getValor());
		System.out.println("Descrição: " + servico4.getDescricao());
		
		//agendamento
		System.out.println("AGENDAMENTO");
		System.out.println("\nId: " + agendamento4.getId());
		System.out.println("Data: " + agendamento4.getData());
		System.out.println("Cliente: " + agendamento4.getCliente());
		System.out.println("Hora: " + agendamento4.getHora());
		System.out.println("Minuto: " + agendamento4.getMinuto());
		
		//cabelereiro
		System.out.println("ATENDIMENTO");
		System.out.println("\nId: " + cabelereiro4.getId());
		System.out.println("Nome: " + cabelereiro4.getNome());
		System.out.println("CPF: " + cabelereiro4.getCpf());
		
	}

}
