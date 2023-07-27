package exercicios;

public class For_Soma {
	public static void main(String[] args) {
		int total = 0;
		
		for (int num = 2; num <= 20; num += 2) {
			total = total + num;
		}// fim do for
		System.out.printf("soma: %d%n", total);
	}// fim do método principal

}// fim do da classe For_Soma
