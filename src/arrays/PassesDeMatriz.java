package arrays;

public class PassesDeMatriz {
	// método principal cria array e chama motifyArray e motifyElement
	public static void main(String[] args) {
		// criamos um array com 5 elementos 
		int[] array = {1, 2, 3, 4, 5};
		/// mostra o cabeçalho.
		System.out.printf("O efeito de passar a referência para toda a matriz%n"+
		"Os valores da matriz original são%n");
		
		// gera a saída de elementos do array original
		for (int valor : array) {
			// aqui mostra apenas cada elemento do array sem ter feito nenhuma alteração
			System.out.printf("   %d", valor);
		}// fim do for 1
		
		// passa a referência do array
		/// a partir daqui, mostra que o array vai ser modificado
		motifyArray(array);
		System.out.printf("%n%n Os valores da matriz modificadas são: %n ");
		
		// gera a saída de elementos do array o modificando 
		for (int valor : array) {
			System.out.printf("   %d", valor);
		}// fim do for 2
		System.out.println();
		System.out.printf("%nO efeito de passar a referência para a matriz%n"+
		"Array[3] antes da modificação do elemento é: %d%n", array[3]);
		
		// tenta modificar o array[3]
		motifyElement(array[3]);
		System.out.printf("depois que multiplicou o elemento do array[3] ele modifica novamente%n"
				+ "mas agora ele retorna com o valor anterior: %d%n",array[3]);
		
		
	}// fim do método principal
	
	// multiplica cada elemento de um array por 2
	public static void motifyArray( int[] array2) {
		// iniciamos um contador com 0:
		// enquanto contador for  menor que array2. length:
		/// adiciomaos + 1 ao contador 
		for (int contador = 0; contador < array2.length; contador++ ) {
			// aqui pega a lista e verifica qual o valor do elemento contador e
			// atribui array2[contador] multiplicado por 2
			array2[contador] *= 2;
		}// fim do for 1
	}// fim do método motify Array2
	
	// multiplica argumento por 2
	public static void motifyElement(int element) {
		// aqui estamos pegando um elemento do array especifico e multiplicamos ele por 2
		element *= 2;
		//mostra o valo do elemento multiplicado
		System.out.printf("Valor do elemento multiplicado é: %d%n", element);
	}// fim do método motify Element

}
