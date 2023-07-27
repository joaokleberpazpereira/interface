package exercicios;

import java.util.Scanner;

public class MediaDaClasseComSentinela {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int total = 0;
		int numDeNotas = 0;
		
		System.out.print("Digite a nota:");
		int nota = entrada.nextInt();// recebe a nota ddo usuário
		
		while (nota != -1) {
			total = total + nota;//adiciona nota ao total
			
			numDeNotas = numDeNotas + 1;// incrementa o números de notas
			// solicita a entrada e lê a proxima entrada do usuário
			System.out.print("Digite a nota");
			nota = entrada.nextInt();
		}// fim do while;
		
		if (numDeNotas != 0) {
			// estamos convertendo um valor inteiro para double de ponto flutuante
			double media = (double)total / numDeNotas;// pegando  total e dividindo pelo números de notas
			System.out.printf("%n Foi inserido um total de %d Notas, no valor de:  %d%n", numDeNotas, total);
			System.out.printf("%n A média da classe é: %.2f %n ", media);
		}// fim do if 
		else {// mostra que nenhuma nota foi inserida.
			System.out.println("Nenhuma Nota foi inserida!");
		}// fim do else
		entrada.close();
	}// fim do método principal

}// fim da classe MediaDoClasseComSentinela
