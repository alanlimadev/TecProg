package codigos;

public class Questao12 {

	public static void criptografia(String[] s) {
		
		System.out.println("Mensagem a se criptografar: ");
		for (int i = 0; i < s.length; i++) {
			
			System.out.print(s[i]);
			
		}
		
		for (int i = 0; i < s.length; i++) {

			switch (s[i]) {
			case "a":
				s[i] = "%";
				break;
			case "b":
				s[i] = "*";
				break;
			case "c":
				s[i] = "(";
				break;
			case "d":
				s[i] = "-";
				break;
			case "e":
				s[i] = "+";
				break;
			case "f":
				s[i] = "@";
				break;
			case "g":
				s[i] = "#";
				break;
			case "h":
				s[i] = "1";
				break;
			case "i":
				s[i] = "2";
				break;
			case "j":
				s[i] = "3";
				break;
			case "l":
				s[i] = "4";
				break;
			case "m":
				s[i] = "5";
				break;
			case "n":
				s[i] = "6";
				break;
			case "o":
				s[i] = "7";
				break;
			case "p":
				s[i] = "8";
				break;
			case "q":
				s[i] = "9";
				break;
			case "r":
				s[i] = "{";
				break;
			case "s":
				s[i] = "}";
				break;
			case "t":
				s[i] = "!";
				break;
			case "u":
				s[i] = "&";
				break;
			case "v":
				s[i] = "$";
				break;
			case "x":
				s[i] = "?";
				break;
			case "z":
				s[i] = ":";
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
		
		String str[] = {"j", "a", "v", "a", " ", "c", "o", "d", "e"};
		
		criptografia(str);

	}

}