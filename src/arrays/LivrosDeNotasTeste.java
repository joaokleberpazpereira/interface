package arrays;
// criando um objeto LivrosDeNotas utilizando um array de notas,
// e, então, invoca o método processodeNotas para analisá-las.
public class LivrosDeNotasTeste {
	
	public static void main(String[] args) {
		// array de notas dos alunos
		int[] listasDeNotas = {89, 89, 89, 89, 100, 89, 64, 78, 90, 89};
		LivrosDeNotas meuLivroDeNotas = new LivrosDeNotas(
				"CS101 Introdução da programação java",listasDeNotas);
		System.out.printf("Bem vindo ao livro de notas para%n%s%n%n"
				,meuLivroDeNotas.getnomeCurso());
		meuLivroDeNotas.processoDeNotas();
	}// fim do método principal

}// fim da classe livros de notas teste
