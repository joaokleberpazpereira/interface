package exercicios;

import java.util.Scanner;

public class GradeDoEstudante {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite uma nota: "); // pede para o usuário digitar uma nota
		int gradeDoEstudante = entrada.nextInt(); // recebe a nota do usuário
		
		if (gradeDoEstudante >= 90) {
			System.out.println("Parabéns voce foi aprovado!!!!");
			System.out.println("Nota: A");
		}// fim do if Nota: A 
		else if (gradeDoEstudante >= 80 & gradeDoEstudante <= 89) {
			System.out.println("Aprovado!!!");
			System.out.println("Nota: B");
		}// fim do else if Nota: B 
		else if (gradeDoEstudante >=70 & gradeDoEstudante <= 79) {
			System.out.println("Aprovado!!!");
			System.out.println("Nota: C");
		} // fim do else if Nota: C
		else  { // qunado usa um else no final de uma sequência não precisa ter uma condição 
			System.out.println("Reprovado... volte, é estude mais");
		}// fim do else if Reprovado.
		entrada.close(); // fim do Scanner
	}// fim do método principal

}// fim da classe grade do estudante
