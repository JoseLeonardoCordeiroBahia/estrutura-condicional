package sintaxe.opcional.operadores.de.atribuicao.cumulativa;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner scanner = new Scanner(System.in);
		
		int minutos;
		double conta = 50.0;
		
		System.out.printf("Informe os minutos: ");
		minutos = scanner.nextInt();
		
		if (minutos > 100) {
			conta += (minutos - 100) * 2.0;
		}
		
		System.out.printf("Valor da conta = R$ %.2f\n", conta);
		
		scanner.close();
	}
	
}
