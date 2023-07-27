package exercicios;

public class EstudanteTeste {
	public static void main(String[] args) {
		Estudante aluno1 = new Estudante("Kleber", 90.0);
		Estudante aluno2 = new Estudante("Andressa", 70.0);
		
		System.out.printf("%s sua Nota é: %s%n",
				aluno1.getNome(),aluno1.getNota());
		System.out.printf("%s sua Nota é: %s%n",
				aluno2.getNome(),aluno2.getNota());
	}// fim do mpetodo principal;

}// fim da classe Estudante;
