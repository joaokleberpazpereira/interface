package exercicios;

import java.util.Scanner;

public class MaiorDeTres {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Insira três valores de ponto flutuante separado com espaço:\n");
		double num1 = entrada.nextDouble();
		double num2 = entrada.nextDouble();
		double num3 = entrada.nextDouble();
		
		double maximo = maximum(num1, num2, num3);
		
		System.out.println("Maximo valor e "+ maximo);
		entrada.close();
	}// fim do método principal 
	public static double maximum (double x, double y, double z) {
		// supoe que X e o maior valor principal
		double maximumValue = x;
		// Determina se Y e maior que maximumvalue
		if (y > maximumValue){// se Y for maior que maximumValue
			maximumValue = y;// adiciona Y a maximumValue
		}
		// determina se Z e maior que maximoValue
		if (z > maximumValue) {// se Z for maior que maximumValue
			maximumValue = z;// adiciona Z a maximumValue
		}
		return maximumValue;
	}
}// fim da clase maior de treis
