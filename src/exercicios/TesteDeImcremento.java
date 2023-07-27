package exercicios;

public class TesteDeImcremento {
	public static void main(String[] args) {
		// Demostra o operador de pos-incremento
		int num = 5;
		System.out.printf("num antes do incremento %d%n", num);
		System.out.printf(" num durante o incremento %d%n", num++);
		System.out.printf("num depois do incremento %d%n", num);
		
		System.out.println();// pulando uma linha
		
		// Demostra o operador pre-incremento
		num = 5;
		System.out.printf("num antes do pre-incremento %d%n", num);
		System.out.printf("  num durante o pre-incremento %d%n", ++num);
		System.out.printf("num depois do pre-incremento %d%n", num);
	}// fim do método principal

}// fim da classe
