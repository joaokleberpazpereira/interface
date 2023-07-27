package exercicios;

public class Questao5 {
	private static int x = 1;
	
	public static void main(String[] args) {
		int x = 5; // variavel local x que sombrea o campo x 
		System.out.printf("O valor da variavel X no principal é:%d%n", x);
		
		LocalDoUsuario();// local do usuário tem uma variável local X
		campoDoUsuario();// campo do usuário utiliza o campo x da classe 
		LocalDoUsuario();// local do usuário reinicializa a variável local x
		campoDoUsuario();// campo X da classe retém seu valor
		
		System.out.printf("O valor da variavel X no principal é:%d%n", x);
	}// fim do método principal
	// cria e inicializa a variável local X durante cada chamada
	public static void LocalDoUsuario() 
	{
		int x = 25; // inicializa toda vez que o local do usuário é chamado
		System.out.printf("%n O valor de x na variável de entrada local do usuário é:%d%n ",
				x);
		++x; // modifica a variável local x desse método
		System.out.printf("valor de X antes de sair do método local do usuário é:%d%n ",
				x);
	}// fim do metodo variável local do usuário
	// modifica o campo x da classe, durante cada chamada 
	public static void campoDoUsuario() 
	{
		System.out.printf("%nO campo X ao inserir o campo de usuário do método é:%d%n",
				x);
		x *= 10;// modifica o campo x da classe
		System.out.printf("O campo x antes de sair do método, o campo do usuário é:%d%n", 
				x);
	}// fim do método campo do usuário

}
