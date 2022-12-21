package formato2;

import java.util.Scanner;

public class Questao11 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		for(int i = 0; i <= 3; i++) {
						
			for(int j = 0, n = 0; j < 2; j++) {
				
				if(n == 2) {
					System.out.print(i + " - " + n + "\n");
					break;
				}else if(j == 0) {
					System.out.print(i + " - " + j + "\n");
				}else if(j == 1) {
					System.out.print(i + " - " + j + "\n");
					n++;
					j = j - 2;
				}	
			}
		}
		
		entrada.close();
		
	}

}


