package arrays;
// programa de impreção de barras de gráficos
public class BarrasDeArreys {
	public static void main(String[] args) {
		int[] array = {0, 0, 0, 0, 0, 0, 1, 2, 4, 2, 1};
		
		System.out.println("Distribuição de notas");
		// para cada elemento de um array, gera a saída de uma barra de gráfico
		for(int contador = 0; contador < array.length; contador++) {
			// Gera saída do rótulo de barra ("00-09",...."90-99: ", "100: ")
			if (contador == 10) 
			{
				System.out.printf("%5d: ", 100);
			}// fim do IF
			else
			{
			System.out.printf("%02d-%02d: ",
					contador * 10,contador * 10 + 9);	
			}// fim do else
			// for que imorime a barra de asteriscos
			for (int stars = 0; stars < array[contador]; stars++) {
				System.out.print("*");
			}// fim do for interno
			System.out.println();
		}// fim do for
	}// fim do método principal
}
