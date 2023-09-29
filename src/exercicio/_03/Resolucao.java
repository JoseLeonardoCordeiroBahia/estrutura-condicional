package exercicio._03;

import java.util.Scanner;

public class Resolucao {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int valorA;
		int valorB;
		
		System.out.println("Verificar se os dois valores são múltiplos entre si");
		
		System.out.println("");
		
		System.out.print("Informe o valor A: ");
		valorA = scanner.nextInt();
		
		System.out.print("Informe o valor B: ");
		valorB = scanner.nextInt();
		
		if (valorA % valorB == 0 || valorB % valorA == 0) {
			System.out.println("Sao Multiplos");
		} else {
			System.out.println("Nao sao Multiplos");
		}
		
		scanner.close();
	}
	
}
