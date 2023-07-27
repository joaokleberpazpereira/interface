package arrays;

import java.util.Scanner;

public class ArreyComEntradaDoUsuario {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		/* int tamanho vai ser usado para receber a quantidade de notas que o usuario vai
		 * querer armazenar!
		 * ja o int [] notas vai ser uma lista que terar o tamanho definido pelo usuario
		 * a partir da variável de entrada tamanho.
		 *  
		 */
		int tamanho;
		//int total = 0;
		System.out.print("Digite o tamanho");
		/* tamanho esta esperando a enrada do usúario, a entreda deverar ser uma entrada
		 * de inteiros caso contrario, deverar gerar um erro  
		 */
		 tamanho =  entrada.nextInt();
		 /*
		  * int[] nota esta definindo o tamanho da lista de acordo com o tamanho que o 
		  * usuário digitar
		  */
		 int[] notas = new int [tamanho];
		 for (int i = 0; i < notas.length; i++) {
			 notas[i] = entrada.nextInt();
			 /*
			  * for esta iniciando uma variavel I do tipo inteiro, esta variável vai ser 
			  * responsavel pela comparação com a variável tamanho, enquanto I for menor 
			  * que o número definito na variável tamanho, a lista nota vai esperar o 
			  * usuário digitar outro número ate que a variável I se torne falso , que é 
			  * quando I se tornar maior que o número definido pelo usuário na 
			  * variável tamanho 
			  */
		 }// fim do for 1
		 
		 for (int i = 0; i < tamanho; i++) {
			 System.out.println(notas[i]);
			 /*
			  * Este for ja vai mostrar a quantidade e os valores das notas que o usuário
			  * digitou, vai esperar ate o for 1 seja concluído para depois mostrar os 
			  * valores da lista Notas
			  */
		 }// fim do for 
		 
		 
		 
		 entrada.close();
	}

}
