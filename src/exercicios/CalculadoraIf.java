package exercicios;

import java.util.Scanner;

public class CalculadoraIf {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int numeroX;// vai recebe o primeiro numero;
		int numeroY;// vai receber o segundo numero;
		int numeroZ;// vai receber o terceiro numero;
		int resultado;// vai receber o resultado das somas de numeroX + numeroY + numeroZ
		
		System.out.print("Digite o numero X ");// lêr o primeiro numero
		numeroX = entrada.nextInt();
		
		System.out.print("Digite o segundo numero Y ");// lêr o segundo numero
		numeroY = entrada.nextInt();
		
		System.out.print("Digite o numero Z ");// lér o terceiro numero
		numeroZ = entrada.nextInt();
		resultado = numeroX + numeroY + numeroZ;
		
		System.out.printf("O Resultado é = %d", resultado);
		entrada.close();// todo método Scanner tem que ser fechado ao final
	}// fim do método principal
}// fim da classe calculadora if
