package exercicio._06;

import java.util.Locale;
import java.util.Scanner;

public class Resolucao {
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner scanner = new Scanner(System.in);
		
		double numero;
		String intervalo;
		
		System.out.println("Verificar se o valor está nos seguintes intervalos "
				+ "([0,25], (25,50], (50,75], (75,100])");
		
		System.out.println("");
		
		System.out.print("Informe um número: ");
		numero = scanner.nextDouble();
		
		if (numero < 0 || numero > 100) {
			intervalo = "Fora de intervalo";
		} else if (numero <= 25) {
			intervalo = "Intervalo [0,25]";
		} else if (numero <= 50) {
			intervalo = "Intervalo [25,50]";
		} else if (numero <= 75) {
			intervalo = "Intervalo [50,75]";
		} else {
			intervalo = "Intervalo [75,100]";
		} 
		
		System.out.println(intervalo);
		
		scanner.close();
	}

}
