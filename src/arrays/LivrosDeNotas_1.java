package arrays;
//classe livro de notas utilizando arrays bidimensional para armazenar notas!
public class LivrosDeNotas_1 {
	
	private String courseName;
	private int[][] grades;
	
	//construtor que inicia os argumentos courseName e arrey de notas
	public LivrosDeNotas_1(String courseName, int[][] grades) 
	{
		this.courseName = courseName;
		this.grades = grades;
	}// fim do método construtor que inicia os argumentos courseName e o array de notas
	
	// Método que configura o nome de um curso
	public  void setCourseName(String courseName) 
	{
		this.courseName = courseName;
		// Esse.coursename recebe o courseName;
	}// fim do método de configuração do nome do curso
	
	// Método que recupera o nome do curso/courseName
	public String getCourseName() 
	{
		return courseName;// Método deve conter um retorno 
	}// fim do método que recupera o nome do curso
	
	// realiza várias operações de dados
	public void procressGrade() 
	{
		// gera a saída do arrey de notas
		outputGrades();
		
		// chama os metodos getMinimum e getMaximum
		System.out.printf("%n%s %d%n%s %d%n%n",
				"Lowest grade in the grade book is", getMinimum(),
				"highest grade in the grade book is", getMaximum());
		// gera a saída de grafico de distribuição de notas de todas as notas em todos os testes.
		outputBarChar();
	}// fim do método que raliza as operações dos dados
	
	// método que localiza a nota minima
	public int getMinimum() 
	{
		// Supõe que o primeiro elemento da array de notas é o  menor; 
		int lowGrade = grades[0][0];
		
		// Faz um loop pela linha array de notas
		for(int[] studentGrades : grades) 
		{
			// faz um loop pelas colunas da linha  atual; 
			for(int grade : studentGrades) 
			{
				// se a nota for menor que lowGrade, atribui a nota a lowGrade
				if(grade < lowGrade) 
				{
					lowGrade = grade;
				}// fim da condição de atribuição 
			}// fim do loop de cada coluna
		}// fim do loop das linhas 
		
		return lowGrade;
	}// fim do método que localiza a nota minima
	
	// localiza a nota maxima
	public int getMaximum() 
	{
		// supõe que o primeiro elemento de array de notas é o maior
		int highGrade = grades[0][0];
		// faz um loop pelas linhas do array de notas
		for(int[] studentGrades : grades) 
		{
			// faz um loop pelas colunas da linha atual
			for(int grade : studentGrades) 
			{
				// se a nota for maior que highGrade, atribui essa nta a highGrade;
				if(grade > highGrade) 
				{
					highGrade = grade;
				}// fim do condição de atribuição
			} // fim do loop de cada coluna
		}// fim do loop de cada linha
		return highGrade;// método deve conter um retorno
	}// fim do método de localização de nota maxima
	
	// Determina a médio de um conjunto particular de notas
	public double getAverage(int[] setOfGrades) 
	{
		int total = 0;
		
		// soma as notas de um aluno
		for(int grade : setOfGrades)
		{
			total += grade;
		}// fim do loop que faz a soma e atribui a nota
		//retorna a média da nota
		return (double) total / setOfGrades.length;
	}// fim do método que determina a média de um conjunto de notas
	
	// gera a saída do grafico de barras para exibir distribuição total de notas
	public void outputBarChar() 
	{
		System.out.println("Overall grade distribution:");
		// armazena frequência de notas em cada  intervalo de 10 notas 
		int[] frequency = new int[11];
		
		// para cada nota em livrosdenotas_1, incrementa a frequência apropriada.
		for(int[] studentGrades : grades) 
		{
			for(int grade : studentGrades) 
			{
				++frequency[grade / 10];
			}// fim do for de imcrementação
		}// fim do for que incrementa a sequência apropriada de cada nota.
		
		// para cada sequência de nota, imprime barra no gráfico
		for(int count = 0; count <frequency.length; count++) 
		{
			// gera a saída do rotulo de barras ("00-09", ..... , "90-99", "100"
			if(count == 10) 
			{
				System.out.printf("%5d:  ", 100);
			}// fim da condição if
			else 
			{
				System.out.printf("%02d-%02d: ",
						count * 10, count * 10 + 9);
			}// fim do else
			// imprime a barra de asteriscos
			for(int stars = 0; stars < frequency[count]; stars++) 
			{
				System.out.print("*");
			}// fim do for que faz imprimir as barras de asteriscos
			
			System.out.println();
		}// fim do for que imprime a barra de gráfico
	}// fim do método que mostra o grafico de barras e mostra a distribuição de notas
	
	// gera a saída do conteúdo do array de notas
	public void outputGrades() 
	{
		System.out.printf("The grades are:%n%n");
		System.out.print("		");// Linha do titulo de coluna
		// Cria um titulo de coluna para cada um dos testes.
		for(int test =0; test < grades[0].length; test++) 
		{
			System.out.printf("Teste %d ", test + 1);
		}//// fim do for que implementa cada titulo
		
		// titulo de coluna da média do aluno
		System.out.println("Average");
		
		// cria linhas/colunas de texto que representam notas de arrey
		for(int student = 0; student < grades.length; student++) 
		{
			System.out.printf(" Estudante %2d", student + 1);
			// Gera a saída de notas do aluno
			for(int test : grades[student]) 
			{
				System.out.printf("%8d", test);
			}// fim do for que gera cada saida com a nota de cada aluno
			
			double average = getAverage(grades[student]);
			System.out.printf("%9.2f%n", average);
		}// Fim do for que cria as linhas e colunas do array
	}// fim do método que gera a saída dos conteúdos das notas
}// fim da classe livrosdeNotas_1
