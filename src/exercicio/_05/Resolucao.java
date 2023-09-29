package exercicio._05;

import java.util.Locale;
import java.util.Scanner;

public class Resolucao {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner scanner = new Scanner(System.in);
		
		int codigo;
		int quantidade;
		double total;
		
		System.out.println(" ....................................");
		System.out.println("| CODIGO    ESPECIFICAÇÃO     PREÇO  |");
		System.out.println("| 1         Cachorro Quente   R$4.00 |");
		System.out.println("| 2         X-Salda           R$4.50 |");
		System.out.println("| 3         X-Bacon           R$5.00 |");
		System.out.println("| 4         Torrada simples   R$2.00 |");
		System.out.println("| 5         Refrigerante      R$1.50 |");
		System.out.println(" ....................................");
		
		System.out.println("Calcular o valor total da conta a pagar");
		
		System.out.println("");
		
		System.out.printf("Informe o código do produto: ");
		codigo = scanner.nextInt();
		
		System.out.printf("Informe a quantidade de produto: ");
		quantidade = scanner.nextInt();
		
		if (codigo == 1) {
			total = quantidade * 4.00;
		} else if (codigo == 2) {
			total = quantidade * 4.50;
		} else if (codigo == 3) {
			total = quantidade * 5.00;
		} else if (codigo == 4) {
			total = quantidade * 2.00;
		} else {
			total = quantidade * 1.50;
		}
		
		System.out.println("");
		
		System.out.printf("Total: R$ %.2f", total);
		
		scanner.close();
	}
	
}
