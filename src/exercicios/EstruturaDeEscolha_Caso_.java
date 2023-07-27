package exercicios;

import java.util.Scanner;

public class EstruturaDeEscolha_Caso_ {
	public static void main(String[] args) {
		// iniciando variáveis do tipo int
		int total = 0;
		int contagemDeNotas = 0;
		int a = 0; 
		int b = 0;
		int c = 0;
		int d = 0;
		int f = 0;
		Scanner entrada = new Scanner(System.in);
		System.out.printf("%s%n%s%n %s%n %s%n", // se você deixar espaços entre um %s%n e %d%n, vai ter espaços quando 
				"Enter the integer grades in the range 0-100.",// forem mostrados ao usuário
				"Type the end-of-file indicator to terminate input:", 
				"On UNIX/Linux/Mac OS X type <Ctrl> d then press Enter",
				"On Windows type <Ctrl> z then press Enter");// se quiser encerrar o programa, manda apertar ctrl.
		// agora fazemos um loop até o usuário por um fim no loop teclando a tecla ( ctrl ) do Windows!
		
		while (entrada.hasNext()) 
		{
			int nota = entrada.nextInt();// A variável ( nota ) recebe uma nota do usuário;
			total += nota;// adiciona nota à total
			++contagemDeNotas;// incrementa + 1 à contagemDeNotas
			
			// Incrementa o contador de letras adequado!
			switch (nota / 10)
			{// caso a nota seja de 99 a 100
			case 9:// vai mostrar a letra ( A )
			case 10:
				++a;// Adiciona mais 1 à variável ( A )
				break;// Sai do switch
				
			case 8:// Caso a nota seja de 80 a 89, Mostra a letra ( B )
				++b;// Adiciona mais 1 à variável ( B )
				break;// Sai do switch
			case 7:// caso a nota seja de 70 a 79, Mostra a letra ( C ) 
				++c;// Adiciona mais 1 à variável ( C )
				break;// Sai do switch
			case 6:// Caso a nota seja 60 a 69, Mostra a letra ( D )
				++d;// Adiciona mais 1 à variável ( D )
				break;// Sai do switch
				
			default:// Se a nota for menor que 60, Mostra a letra( F )
				++f;// Adiciona mais 1 à variável ( F )
				break;// Como utilizei o default, o break não seria necessario;
			}// fim do switch		
		}// fim do while
		// Exibe o relatorio da nota!!
		System.out.printf("Relatorio das notas %n");
		// Se o usuário inserir pelos menos uma nota
		if (contagemDeNotas != 0) {
			double soma = (double) total / contagemDeNotas;
			
			//Gera a saida e o resumo do resultado
			System.out.printf("O total de notas inseridas foram  %d e o total das notas e: %d%n",contagemDeNotas, total);
			// Mostra a média dos alunos inseridas....
			System.out.printf("A média da classe e: %2.f%n", soma);
			// Número de alunos que recebem cada nota
			System.out.printf("%s%n %d%n %d%n %d%n %d%n %d%n %n ",
					"Números de alunos que recebem cada nota",
					"A", a ,
					"B", b ,
					"C", c ,
					"D", d ,
					"F", f);
			
		}// fim do IF
		else {
			System.out.println("Nenhuma nota foi inserida");
		}// fim do else
		entrada.close();
	}// fim do método principal

}
