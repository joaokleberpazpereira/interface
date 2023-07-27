package exercicios;

public class Questao_3 {
	public static void main(String[] args) {
		int row = 10;
		
		while (row >= 1) {
			int som = 1;
			while (som <=10) {
				System.out.print(row % 2 == 1 ? "<" : ">");
				++som;
			}// fim do while interno
			--row;
			System.out.println();
		}// fim do while
	}// fim do método principal

}
