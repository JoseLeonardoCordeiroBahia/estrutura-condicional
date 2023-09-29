package exercicio._01;

import java.util.Scanner;

public class Resolucao {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int numero;
		
		System.out.println("Verificar se o número é negativo ou não");
		
		System.out.println("");
		
		System.out.print("Informe um número: ");
		numero = scanner.nextInt();
		
		if (numero < 0) {
			System.out.println("NEGATIVO");
		} else {
			System.out.println("NAO NEGATIVO");
		}
		
		scanner.close();
	}

}
