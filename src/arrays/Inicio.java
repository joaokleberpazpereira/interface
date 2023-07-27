package arrays;

public class Inicio {
//	public static void main(String[] args) {
//		// Declara a variavel arrey e o inicializa com um objeto array
//		int [] array = {32, 27, 64, 18, 85, 14, 90, 70, 60, 37}; // inicia o Array
//		// Mostra os titulos em colunas
//		System.out.printf("%s%8s%n", "Índice","Valor");
//		// Gera saída do valor de cada elemento do array
//		for(int contador = 0; contador < array.length; contador++) {
//			System.out.printf("%5d%8d%n", contador, array[contador]);
//		}// fim do for
//	}// fim do método principal 1
	public static void main(String[] args) {
		final int ARRAY_LENGTH = 10;
		
		int[] array = new int[ARRAY_LENGTH];
		
		for (int contador = 0; contador < array.length; contador++) {
			array[contador] = 2 + 2 * contador;
		}// fim do for
		System.out.printf("%s%8s%n", "Índice","Valor");
		// Gera saida do valor de cada elemento do array
		for(int contador = 0; contador < array.length; contador++) {
			System.out.printf("%5d%8d%n", contador, array[contador]);
		}// fim do for
	}// fim do método principal 2

}
