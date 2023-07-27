package exercicios;

import java.util.Scanner;

public class MediaDaClasse {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int total = 0;// inicia a variável total com 0;
		int contador = 1;// inicia a variável ontador com 1;
		
		while(contador <= 10) {// definição do contador, 
			//se contador for menor que e igual a 10, ele encerra o programa;
			System.out.print("Digite a nota:");
			int media = entrada.nextInt();// recebe a entrada do usuário
			total= total + media;// adiciona a nota inserida 
			contador = contador + 1;// adiciona + 1 ao contador While	
		}// fim while
		// fase de término
		int nota = total / 10;
		// mostra a nota dos alunos
		System.out.printf("%nA soma total da classe é: %d%n", total);
		System.out.printf("A média da classe é: %d%n",nota);
		entrada.close();
	}// fim do método principal;

}// fim da classe MédiaDaClasse;
