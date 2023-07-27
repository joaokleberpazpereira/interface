package arrays;
import java.security.SecureRandom;

public class RolarEParar {
	public static void main(String[] args) {
		SecureRandom numeroAleatorio = new SecureRandom();
		
		 // array de contadores de frequência
		int[] frequencia = new int [7];
		
		// lança o dado 6.000.000 vezes; usa o valor do dado como índice de frequência
		for(int rolar = 1; rolar <= 6000000; rolar++)
		{
//			utiliza o valor aleatório para determinar qual elemento 
//			frequencia incrementar durante cada iteração do loop.
			++frequencia [1 + numeroAleatorio.nextInt(6)];
		}// fim do for1
		// Mostra o cabeçalho
		System.out.printf("%s%10s%n","Lado", "Frequencia");
		
		// gera saída do valor de cada elemento do array
		for(int lado = 1; lado < frequencia.length; lado++)
		{
			System.out.printf("%4d%10d%n", lado, frequencia[lado]);
		}// fim do for2
		
	}// fim do método principal
}// fim da classe rolar e parar
