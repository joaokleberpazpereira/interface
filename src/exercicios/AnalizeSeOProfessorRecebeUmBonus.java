package exercicios;

import java.util.Scanner;

public class AnalizeSeOProfessorRecebeUmBonus {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int aprovado= 0;
		int reprovado = 0;
		int contador = 1;
		
		while (contador <= 10) {// enquanto o contador for menor que ou igual a 10.
			System.out.print("digite uma nota:");// vai pedir para o usuário inserir uma nota
			int nota = entrada.nextInt();// recebe a entrada do usuário e guarda na variável Nota.
			
			if (nota >= 70)  {// se a nota for maior que ou igual a 70
				aprovado = aprovado + 1;// adiciona mais 1 ao aprovado
			}// fim do if
			else {// se a nota não for maior que ou igual a 70 
				reprovado = reprovado + 1;// adiciona mais 1 ao reprovado
			}// fim do else
			contador = contador + 1;// adiciona mais 1 ao contador, quando chegar a 10 o while para.
		}//fim do while
		
		System.out.printf("São %d foram aprovados, e %d foram reprovados %n", aprovado, reprovado);
		//System.out.printf("%n são %d alunos reprovados %n", reprovado);
		
		if (aprovado >= 8) {// caso tiver mais de 8 alunos aprovados, o instrutor vai receber um Bonus 
			System.out.println(" Bonus ao Instrutor");
		}// fim do if
		else {// se não, vai receber nada
			System.out.println(" Sem Bonus ao Instrutor");
		}
		entrada.close();// fechamento do método Scanner
	}// fim do método principal

}// fim da clase de Analize se o professor recebe um bonus
