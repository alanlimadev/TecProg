package codigos;

public class Questao13 {

	public static void criptografia(String[] s) {
		
		System.out.println("Mensagem a se criptografar: ");
		for (int i = 0; i < s.length; i++) {
			
			System.out.print(s[i]);
			
		}
		
		for (int i = 0; i < s.length; i++) {

			switch (s[i]) {
			case "%":
				s[i] = "a";
				break;
			case "*":
				s[i] = "b";
				break;
			case "(":
				s[i] = "c";
				break;
			case "-":
				s[i] = "d";
				break;
			case "+":
				s[i] = "e";
				break;
			case "@":
				s[i] = "f";
				break;
			case "#":
				s[i] = "g";
				break;
			case "1":
				s[i] = "h";
				break;
			case "2":
				s[i] = "i";
				break;
			case "3":
				s[i] = "j";
				break;
			case "4":
				s[i] = "l";
				break;
			case "5":
				s[i] = "m";
				break;
			case "6":
				s[i] = "n";
				break;
			case "7":
				s[i] = "o";
				break;
			case "8":
				s[i] = "p";
				break;
			case "9":
				s[i] = "q";
				break;
			case "{":
				s[i] = "r";
				break;
			case "}":
				s[i] = "s";
				break;
			case "!":
				s[i] = "t";
				break;
			case "&":
				s[i] = "u";
				break;
			case "$":
				s[i] = "v";
				break;
			case "?":
				s[i] = "x";
				break;
			case ":":
				s[i] = "z";
				break;
			case " ":
				s[i] = " ";
				break;
			}

		}
		
		System.out.println("\n\nMensagem criptografada: ");
		for(int i = 0; i < s.length; i++) {
			System.out.print(s[i]);
		}

	}

	public static void main(String[] args) {
		
		String str[] = {"3", "%", "$", "%", " ", "(", "7", "-", "+"};
		
		criptografia(str);

	}

}