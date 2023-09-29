package escopo.e.inicializacao;

public class Main {

	public static void main(String[] args) {
		double price = 400.00;
		
		if (price < 200.00) {
			double discount = price * 01;
			System.out.println(discount);
		}
		
//		Não tem como imprimir a varaivel discount aqui, pois
//      ela só existe dentro do if e caso descomentamos o
//      print o compilador irá acusar um erro por a variável
//      não exisitir
//		System.out.println(discount);
		
	}
	
}
