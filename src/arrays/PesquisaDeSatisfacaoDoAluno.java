package arrays;

public class PesquisaDeSatisfacaoDoAluno {
	public static void main(String[] args) {
		// array das respostas dos alunos (mais tipicamente, inserido em tempo de execução)
		int[] respostas = {1, 2, 5, 4, 3, 5, 2, 1, 3, 3, 1, 4, 3, 3, 3, 
				2, 3, 3, 2, 14};
		int[] frequencia = new int[6];
	
		// para cada resposta, seleciona elemento de respostas e utiliza esse valor
		// como índice de frequência para determinar elemento a incrementar 
		for (int resposta = 0; resposta < respostas.length; resposta++) 
		{
			try // para tratar exceções 
			{// chaves obrigatorias
				++frequencia[respostas[resposta]];
			}// fim do try
			catch (ArrayIndexOutOfBoundsException e) 
			{// chaves obrigatorias
				// invoca o método toString
				System.out.println(e);
				System.out.printf("   Respostas[%d] = %d%n%n", resposta, respostas[resposta]);
			}// fim do catch
		}// fim do for 1
		// Mostra o Cabeçalho
		System.out.printf("%s%s%n","Avaliação", " Frequência");
		
		// Gera a saída de valor de cada elemento do array
		for(int avaliacao = 1; avaliacao < frequencia.length; avaliacao++) 
		{
			System.out.printf("%6d%10d%n",avaliacao, frequencia[avaliacao]);
		}// fim do for 2
		
		
	}// fim do método principal
}// fim da classe pesquisa De Satisfação Do Aluno
