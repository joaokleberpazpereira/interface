package exercicios;

public class Questao_4 {
	public static void main(String[] args) {
		String valor = "@";           // iniciei  uma  varuável  do  tipo  String:
		for (int i = 1; i <= 5; i++) {
			System.out.println(valor);// mostrando o valor atual, antes de incrementar mais 1 na variável
			valor += "@";             // valor  e  incrementado  depois  que  for  foi  utilizado 
		}
		// Esse  codigo  faz  a  mesma  coisa  do  que  o  de  cima,  mas  de  um  modo diferente!
		System.out.println(" ");
		// iniciando o for com uma variável String, usando um operador de negação " ! ", e  para comparar  a  quantidade de caracters
		// usamos Equals, que é utilizado, comparando a quantidade de caracters dentro da variável, ele ver se tem a quantidade certa
		// de caracters e compará com a quantidade que foi atribuída para comparação, neste caso foi"@@@@@@", quando o equals ver que
		// a variável chegou no seu numero determinado de caracters, ele para de comparar e termina a instrução for.
		for (String j = "@";!j.equals("@@@@@@"); j += "@") {
			System.out.println(j);
		}
	}// fim do método principal

}    // Fim da classe questão_4
