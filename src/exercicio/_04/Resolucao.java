package exercicio._04;

import java.util.Scanner;

public class Resolucao {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int horaInicial;
		int horaFinal;
		int duracao;
		
		System.out.println("Calcular a duração do jogo");
		
		System.out.println("");
		
		System.out.print("Informe a hora inical: ");
		horaInicial = scanner.nextInt();
		
		System.out.print("Informe a hora final: ");
		horaFinal = scanner.nextInt();
		
		if (horaInicial < horaFinal) {
			duracao = horaFinal - horaInicial;
		}
		else {
			duracao = 24 - horaInicial + horaFinal;
		}
		
		System.out.println("O JOGO DUROU " + duracao + " HORA(S)");
		
		scanner.close();
	}
	
}
