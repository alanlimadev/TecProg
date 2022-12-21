package codigos;

public class Questao14 {

	public static void contagem(String[] str) {
		
		for(int i = 0; i < str.length; i++) {
			
			int contador = 1;
			
			for(int j = i+1; j < str.length; j++) {
				
				if(str[i] == str[j]) {
					contador++;
				}
				
				
				
			}
			System.out.println(str[i] + " = " + contador);
			
		}
		
	}
	
	public static void main(String[] args) {

		String str[] = {"a", "b", "c", "3", "3", "5", "a", "c"};
		
		contagem(str);

	}

}
