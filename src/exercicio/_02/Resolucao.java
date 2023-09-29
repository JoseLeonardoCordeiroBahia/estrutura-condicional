package exercicio._02;

import java.util.Scanner;

public class Resolucao {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int numero;
		
		System.out.println("Verificar se o número é par ou ímpar");
		
		System.out.println("");
		
		System.out.print("Informe um número: ");
		numero = scanner.nextInt();
		
		if (numero % 2 == 0) {
			System.out.println("PAR");
		} else {
			System.out.println("IMPAR");
		}
		
		scanner.close();
	}
	
}
