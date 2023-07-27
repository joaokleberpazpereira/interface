package exercicios;

public class CalculoJurosComposto {
	public static void main(String[] args) {
		double quantidade;// quantidade de anos 
		double salario = 1000.0;// salario principal
		double juros = 0.05;// taxa de juros
					// Exibe o cabeçalho:
		System.out.printf("%s%20s %n", "anos", "Quantidades");
		
		for (int ano = 1; ano <= 10; ++ano) {// inicia ( ano ) com 1, enquanto ( ano ) for menor que 10
												// adicionar mais 1 à ( ano ).
			// Calcula a quantidade de juros por ano
			quantidade = salario * Math.pow(1.0 + juros, ano);
			
			// mostra ao usuário  os anos e as quantidades de juros por ano.
			System.out.printf("%4d%,20.2f%n", ano, quantidade);
		}// fim do for
		
		
	}// fim do método principal

}// fim da classe
