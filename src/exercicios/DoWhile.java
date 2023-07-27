package exercicios;

public class DoWhile {
	public static void main(String[] args) {
		
		int agora = 1;// iniciando uma variável com 1
		
		do {// do..while, comando que vai ser gerado pelo menos uma vez
			System.out.printf("Agora é: %d%n", agora);
			++agora;// adiciona mais 1 a variável ( agora )
		}// fim do do..while
		while (agora <= 10);// enquanto a variável ( agora ) for menor que ou iqual a 10, ele vai repetir o loop. 
		
		System.out.println();// apenas  para pular uma linha
	}// fim do método principal

}// fim da classe
