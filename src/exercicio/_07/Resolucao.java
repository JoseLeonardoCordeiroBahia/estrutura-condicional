package exercicio._07;

import java.util.Locale;
import java.util.Scanner;

public class Resolucao {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner scanner = new Scanner(System.in);

		double x;
		double y;
		
		System.out.println("Verificar se X e Y está sobre um dos eixos cartesianos ou "
				+ "na origem");
		
		System.out.println("");
		
		System.out.print("Informe o valor do eixo X: ");
		x = scanner.nextDouble();
		
		System.out.print("Informe o valor do eixo Y: ");
		y = scanner.nextDouble();
		
		if (x == 0.0 && y == 0.0) {
			System.out.println("Origem");
		}
		else if (x == 0.0) {
			System.out.println("Eixo Y");
		}
		else if (y == 0.0) {
			System.out.println("Eixo X");
		}
		else if (x > 0.0 && y > 0.0) {
			System.out.println("Q1");
		}
		else if (x < 0.0 && y > 0.0) {
			System.out.println("Q2");
		}
		else if (x < 0.0 && y < 0.0) {
			System.out.println("Q3");
		}
		else {
			System.out.println("Q4");
		}
		
		scanner.close();
	}
	
}
