package exercicios;

public class Estudante {
	
	private String nome;
	private double media;
	// contrutor inicializa variáveis de instâncias
	public Estudante (String nome, double media) {
		this.nome = nome;//  todo THIS tem que ter um ponto (  .   ) e o nome da variável
		// valida que a media é >= 0.0 e >= 100.0; caso contrario
		// amarzena o valor padrão da média da variável de instância ( 0.0 );
		if (media >= 0.0) {
			if (media <= 100.0) {
				this.media = media;// atribuí a média do aluno.				
			}// fim do IF interno
		}// fim do if
	}// fim do construtor
	// define o nome do aluno
	public void setNome(String nome) {
		this.nome = nome;
	}// fim do método set nome
	// recupera o nome do estudante
	public String getNome() {
		return nome;
	}// fim do método get nome
	// define a media do estudante
	public void setMedia( double estudanteMedia ) {
		// valida que a media é >= 0.0 e >= 100.0; caso contrario
		// amarzena o valor padrão da média da variável de instância ( 0.0 );
		if (media > 0.0) {
			if (media <= 100.0) {
			//	this.media = media;
			}// fim do IF interno
		}// fim do If média
	}// fim do método set média
	// recupera a média do estudante
	public double getMedia() {
		return media;
	}// fim do método get media
	// determina e retorna a letra da nota do estudante.
	public String getNota() {
		String nota = "";// inicializando como uma String vazia.
		
		if (media >= 90.0)
		{
			nota = "A";
		}// fim do IF Nota A
		else if (media >=80.0)
		{
			nota = "B";
		}// fim do Else If Nota B
		else if (media >= 70.0) 
		{
			nota = "C";
		}// fim do else if Nota C
		else if (media >= 60.0) 
		{
			nota = "D";
		}// fim do else if Nota D
		else {
			nota = "F";
		}// fim do else
		return nota;
	}// fim do método get nota

}
