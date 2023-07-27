package exercicios;
import java.security.SecureRandom;

public class Segundos {
	public static void main(String[] args) {
		// Objeto SecureRandom fornecera numeros aleatorios seguros
		SecureRandom aleatorios = new SecureRandom();
		int frequencia1 = 0; // contagem de 1s lançados
		int frequencia2 = 0; // contagem de 2s lançados
		int frequencia3 = 0; // contagem de 3s lançados
		int frequencia4 = 0; // contagem de 4s lançados
		int frequencia5 = 0; // contagem de 5s lançados
		int frequencia6 = 0; // contagem de 6s lançados
		
		// soma 6.000.00 vezes um lançamento de um dado
		for(int rolar =1; rolar <= 6000000; rolar++) {
			// determina um numero de 1 a 6
			int contador = 1 + aleatorios.nextInt(6);
			
			// usa o valor de 1-6 para os contadores afim de determinar qual contador incrementar
			switch(contador) {
			case 1:
				++frequencia1; // incrementa o contador de 1s
				break;
			case 2:
				++frequencia2; // incrementa o contador de 2s
				break;
			case 3:
				++frequencia3; // incrementa o contador de 3s
				break;
			case 4:
				++frequencia4; // incrementa o contador de 4s
				break;
			case 5:
				++frequencia5; // incrementa o contador de 5s
				break;
			case 6: 
				++frequencia6; // incrementa o contador de 6s
					break;
			}// fim do switch	
		}// fim do for;
		// Cabeçalho de saida
		System.out.println("Rolar\tFrequencia");
		System.out.printf("1\t%d%n2\t%d%n3\t%d%n4\t%d%n5\t%d%n6\t%d%n", 
				frequencia1, frequencia2,
				frequencia3, frequencia4,
				frequencia5, frequencia6);
	}// fim do método principal
}// fim da classe 
