package arrays;

public class SomaDeArrays {
	public static void main(String[] args) {
		int[] array = {10, 10, 10, 10, 20, 10, 20, 10, 20, 20};
		int total = 0;
		
		for(int contador = 0; contador < array.length; contador++) {
			total += array[contador];
		}// fim do for
		System.out.printf("Total dos elementos do arrays: %d%n", total);
	}// fim do método soma de arrays
}
