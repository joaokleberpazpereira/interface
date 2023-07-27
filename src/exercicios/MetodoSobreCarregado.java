package exercicios;

public class MetodoSobreCarregado {
	//Testes de quadrados com métodos sobrecarregados
	public static void main(String[] args) {
		System.out.printf("Quadrados de inteiros 7 é: %d%n ", quadrado(7));
		System.out.printf("Quadrado com ponto flutuante do tipo Double 7.5 é: %f%n", quadrado(7.5));
	}// fim do método principal
	
	// Método quadrado com o argumento inteiro 
	public static int quadrado(int valorInteiro) {
		System.out.printf("%n chamando o quadrado com um argumento inteiro: %d%n", 
				valorInteiro);
		return valorInteiro * valorInteiro;
	}// fim do método quadrado inteiro
	
	// Método quadrado com o argumento do tipi double com ponto flutuante
	public static double quadrado(double valorComPontoFlutuante) {
		System.out.printf("%n Chamando o quadrado do tipo double que contém um ponto flutuante: %f%n",
				valorComPontoFlutuante);
		return valorComPontoFlutuante * valorComPontoFlutuante;
	}// fim do método quadrado com ponto flutuante;

}
