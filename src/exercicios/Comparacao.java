package exercicios;

import java.util.Scanner;

public class Comparacao {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int numero1;
		int numero2;
		
		System.out.print("Digite o primeiro número:");
		numero1 = entrada.nextInt();
		
		System.out.print("Digite o segundo número:");
		numero2 = entrada.nextInt();
		
		if(numero1 == numero2) {
			System.out.printf("%5d == %5d %n", numero1, numero2);
		}// fim do if
		if(numero1 != numero2) {
			System.out.printf("%5d != %5d %n", numero1, numero2);
		}// fim do if
		if (numero1 < numero2) {
			System.out.printf("%5d < %5d %n", numero1, numero2);
		}// fim do if
		if (numero1 > numero2) {
			System.out.printf("%5d > %5d %n", numero1, numero2);
		}// fim do if
		if (numero1 <= numero2) {
			System.out.printf("%5d <= %5d %n", numero1, numero2);
		}// fim do if
		if (numero1 >= numero2) {
			System.out.printf("%5d >= %5d %n", numero1, numero2);
		}// fim do if
		entrada.close();
	}// fim do metodo principal
}// fim da classe comparaçâo
