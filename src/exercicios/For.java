package exercicios;

public class For {
	public static void main(String[] args) {
		for(int i = 0; i < 10; i++) {// for, inicia a variável ( i ) com zero, enquanto ( i ) for menor que 10
			// ( i ) vai adicionar mais 1 à variável ( i ).
			for(int j = 0; j < 10; j++) {// for interno, inicia a variável ( j ) com 0, enquanto ( j ) for menor que 10
				// adiciona mais 1 a variável ( j ).
				System.out.println(" HeHeHeHe ");
			}// Fím do for ínterno
			System.out.println("FIM");
		}// Fím do for externo.
	}
}
