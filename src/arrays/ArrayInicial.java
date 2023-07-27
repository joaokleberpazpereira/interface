package arrays;

public class ArrayInicial {
	public static void main(String[] args) {
		int[][] array1 = {{1 , 2 ,3}, {4, 5, 6}};// fim do arrey 1
		int[][] array2 = {{1, 2},{3},{4, 5, 6}};// fim do array 2
		
		System.out.println("O valor da primeira matriz, por linhas são:");
		saidaDaMatriz(array1);// Exibe array 1 por linha
		System.out.printf("%nO valor da segunda matriz, por linhas são:%n");
		saidaDaMatriz(array2);// Exibe array 2 por linha
	}// fim do método principal
	
	public static void saidaDaMatriz(int[][] array) 
	{
		// faz um loop pelas linhas da matriz
		for (int fila = 0; fila < array.length; fila++) 
		{
			// faz um loop pelas colunas da matriz
			for(int coluna = 0; coluna < array[fila].length; coluna++) 
			{
				System.out.printf("%d ", array[fila] [coluna]);
			}// fim do for 2
			System.out.println();		}// fim do for 1
	}// fim do método saida Da Matriz

}// fim da classe Arrey Inicial
