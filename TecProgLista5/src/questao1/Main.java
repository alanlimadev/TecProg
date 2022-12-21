package questao1;

public class Main {

	public static void main(String[] args) {
		ControleRemoto controleRemoto = new ControleRemoto();
		
		System.out.println("Volume aumentado: " + controleRemoto.aumentarVolume());
		System.out.println("Volume reduzido: " + controleRemoto.diminuirVolume());
		System.out.println("Número do canal aumentado: " + controleRemoto.proximoCanal());
		System.out.println("Número do canal reduzido: " + controleRemoto.voltarCanal());
		
	}

}