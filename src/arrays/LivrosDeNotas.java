package arrays;

public class LivrosDeNotas {
	private String nomeCurso;
	private int[] notas;
	
	// Construtor
	public LivrosDeNotas(String nomeCurso, int[] notas) 
	{
		this.nomeCurso = nomeCurso;
		this.notas = notas;
	}// fim do construtor
	
	
	public void setnomeCurso(String nomeCurso) 
	{
		this.nomeCurso = nomeCurso;
	}// fim do método que obtem o nome do curso
	
	
	// método para recuperar o nome do curso
	public String getnomeCurso() 
	{
		return nomeCurso;
	}// dim do método que recupera o nome do curso
	
	
	// realiza varias operações nos dados
	public void processoDeNotas() 
	{
		//gera a saída do array de notas
		saidaDeNotas();
		// chama o método getMedia para calcular a nota média
		System.out.printf("%n Média da classe é: %.2f%n ", getMedia());
		// chama os métodos getMinima e getMaxima
		System.out.printf("A nota mais baixa é: %d%n a nota mais alta é:%d%n%n",
				getMinima(), getMaxima());
		// chama o método graficoDesaida paraimprimir gráfico de distribuição de nota
		graficoDeSaida();
		
	}// fim do método processo de notas
	
	// localiza a nota minima
	public int getMinima() 
	{
		int baixoGrau = notas[0];
		
		// faz um looop pelo array notas
		for(int nota : notas) 
		{
			// se nota for mais baixa que BaixoGrau, atribui essa nota a baixoGrau
			if(nota < baixoGrau) 
			{
				baixoGrau = nota;
			}// fim do if
		}// fim do for 1
		return baixoGrau;
	}// fim do método nota minima
	
	// localiza a nota maxima
	public int getMaxima()// tem que ter um return no final 
	{
		int altoGrau = notas[0]; //Supõe que notas[0] e a maior nota
		
		// faz um loop pelo array de notas
		for(int nota : notas) 
		{
			// se a nota for maior que altograu, atribui essa nota a altoGrau
			if (nota > altoGrau) 
			{
				altoGrau = nota;// nova nota mais alta
			}// fim do if
		}// fim do for 1
		return altoGrau;
	}// fim do método obter maxima
	
	// determina a Média para o teste 
	public double getMedia() // método tem que ter um return 
	{
		int total = 0;
		for(int nota : notas) 
		{
			total += nota;
		}// fim do for1 
		return (double) total / notas.length;
	}// fim do método get Media
	
	// gera a saida de gráfico de barras exibindo a distribuição de notas
	public void graficoDeSaida() 
	{
		System.out.println("Distribuição das notas:");
		
		int[] frequencia = new int[11];
		
		// para cada nota, incrementa a frequência apropriada
		for(int nota : notas) 
		{
			++frequencia[nota / 10];
		}// fim do for1
		
		// para cada frequência de nota, imprime barra de gráfico
		for(int contagem = 0; contagem < frequencia.length; contagem++) 
		{
			// gera a saída do rotulo de barras ("00-09: ", ....., "90-99: ", "100: ")
			if (contagem == 10) 
			{
				System.out.printf("%5d: ", 100);
			}// fim do if
			else 
			{
				System.out.printf("%02d-%02d: ", 
						contagem * 10, contagem * 10 + 9);
			}// fim do else 
			
			//imprime a barra de asterisco
			for(int estrela = 0; estrela < frequencia[contagem]; estrela++)
			{
				System.out.print("*");
			}// fim do for interno, esta dentro do for 2
			System.out.println();
		}// fim do for 2
	}// fim do método grafico de saída
	
	// gera a saída de nota de cada a  luno
	public void saidaDeNotas()
	{
		System.out.printf("As notas são: %n%n");
		
		for (int estudante = 0; estudante < notas.length; estudante++) 
		{
			System.out.printf("Estudante %2d: %3d%n", 
					estudante + 1, notas[estudante]);
		}// fim do for Estudante
	}// fim do método saida de notas

}// fim da classe Livros de Notas
