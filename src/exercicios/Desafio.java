package exercicios;

public class Desafio {
	public static void main(String[] args) {
		String valor = "#";
		for (int i = 1; i <= 5; i++) {
			System.out.println(valor); 
			valor += "#";
		}// fim do for
		System.out.println(" ");
		// usando o for sem números  para definir a quantidade 
		// de repetição vamos comparar a String.. enquanto for 
		// diferente  de  "#####"  o  V vai receber nais 1 "#"
		for (String v = "#";!v.equals("######"); v += "#") {
			System.out.println(v);
		}// fim do for 2
		// teste para ver o que cada comando mostra de resultado
		int i =1;
		int j = 2;
		int k = 3;
		double m = 2.0;
		System.out.println();
		System.out.println(i == 1);
		System.out.println(j == 3);
		System.out.println((i >= 1) && (j < 4));
		System.out.println((m <= 99) & (k < m));
		System.out.println((j >= i) || (k == m));
		System.out.println((k + m < j) | (3 - j >= k));
		System.out.println(!(k > m));
	}
}
