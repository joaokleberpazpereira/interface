package arrays;

public class ForAprimorado {
	public static void main(String[] args) {
		// cria um array que recebe números inteiros 
		int[] array = {42, 42, 42, 42, 42, 42, 42, 42};
		// cria um inteiro que vai receber cada elemento do array 
		int total = 0;
		// aqui estamos pegando cada número de elemento do array e os somamos 
		for(int numero : array) {
			// aqui vai somando em numero crescente em sequência de 1+2, 2+3, 3+4.....
			total += numero;
			// mostrando a soma ao usúario, apois cada iteração.
			System.out.printf("mostrando cada valor interno do for: %d%n", total);
		}// fim do for 
		System.out.println();
		// aqui gera o resultado geral com todas as somas dos elementos do array 
		System.out.printf("Valor total é: %d%n", total);
	}// fim do método principal
}// fim da classe
