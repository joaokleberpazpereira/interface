package exercicios;

public class Questao_1 {
	public static void main(String[] args) {
		int x = 1;
		int total = 0;
		
		while (x <= 10) {
			int y = x * x;
			System.out.println(y);
			total += y;
			++x;
		}// fim do while
		System.out.printf(" total e: %d%n", total);
	}// fim do método principal

}
