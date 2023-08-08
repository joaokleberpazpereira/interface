package arrays;

public class VarargsTest {
	 /*calcula a média
	 utilizando listas de argumentos de comprimento variável.
	 podemos criar métodos que recebem um número não especificado de argumentos.
	 um tipo seguido por reticências (...) na lista de parâmetros de um método 
	 indica que o método recebe um número variável de argumentos desse tipo par-
	 ticular. 
	 Lembrando que esse uso de reticências só pode ocorrer uma vez em cada em uma
	 lista de parâmetros , e a elipse, junto com seu tipo e nome de parâmetros,
	 deve ser colocado no fim da lista de parâmetros. 
	*/
	public static double average (double...numbers) 
	{
		// inicia a variavel 
		double total = 0.0;
		// calcula o resultado utilizando a instrução  for aprimorada
		for(double d : numbers ) 
		{
			total += d;
		}// fim do for
		/*retorna total dividido pela a quantidade de 
		 números que estiver dentro de number.length.
		 Aqui o number.length e tratado com um array de listas. 
		 Aonde todos os argumentos são do mesmo tipo.
		 Exemplos: averade(d1 and d2)
		 d1 tem o valor de 10.00 "1º" primeiro número
		 d2 tem o valor de 20.00 "2º" segundo número
		           soma vai ser 10.00 + 20.00
		                           = 30.00 dividido por 2(primeiro e segundo número)
		                           = 15.00 resultado
		 O 15.00 vai ser adicionado na variável total, então vai ficar assim: total = 15.00                              
		*/
		return total / numbers.length;
	}// fim da classe avarege
	
	public static void main(String[] args) {
		double d1 = 10.00; // double d1 recebe 10.00
		double d2 = 20.00; // double d2 recebe 20.00 
		double d3 = 30.00; // double d3 recebe 30.00
		double d4 = 40.00; // double d4 recebe 40.00
		// mostra o valor de cada variável antes de chamar o método que vai somar a média.
		System.out.printf("d1 = %.1f%nd2 = %.1f%nd3 = %.1f%nd4 = %.1f%n%n",
				d1, d2, d3, d4);
		// Soma a média de d1 e d2 com o método average.
		System.out.printf("Average of d1 and d2 is %.1f%n", average(d1, d2));
		// Soma a média de d1, d2 e d3 com o método average.
		System.out.printf("Average of d1, d2 and d3 is %.1f%n", average(d1, d2, d3 ));
		// Soma a média de d1, d2, d3 e d4 com o método average.
		System.out.printf("Average of d1, d2, d3 and d4 is %.1f%n", average(d1, d2, d3, d4));
	}

}
