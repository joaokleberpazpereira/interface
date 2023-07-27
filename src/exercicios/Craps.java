package exercicios;
import java.security.SecureRandom;
public class Craps {
	
	public static final SecureRandom seguranca = new SecureRandom();
	// tipo enum com constantes que representam o estado do jogo
	private enum Status {CONTINUE, WON, LOST};
	// constantes que representam o lançamento comuns dos dados;
	public static final int SNAKE_EYES = 2;
	public static final int TREY = 3;
	public static final int SEVEN = 7;
	public static final int YO_LEVEN = 11;
	public static final int BOX_CAR = 12;
	
	// método principal para jogar uma partida de craps
	public static void main(String[] args) {
		int meuPonto = 0;           // Pontos se não ganhar ou perder na 1º rolagem
		Status gameStatus;          // Pode conter CONTINUE, WON ou LOST
		int sumOfDice = rollDice(); // Primeira rolagem dos dados 
		
		// Determina o estado  do jogo e a pontuação com base no primeiro lançamento
		switch (sumOfDice) 
		{ // Corpo do switch
		case SEVEN:      // Ganha com 7 no primeiro lançamento
		case YO_LEVEN:   // Ganha com 11 no primeiro lançamento
			gameStatus = Status.WON;
			break;
		case SNAKE_EYES: // Perde com 2 no primeiro lançamento
		case TREY:       // Perde com 3 no primeiro lançamento
		case BOX_CAR:    // Perde com 12 no primeiro lançamento
			gameStatus = Status.LOST;
			break;
		default:// não ganhou nem perdeu, portanto registra a pontuação
			gameStatus = Status.CONTINUE; // jogo não terminou
			meuPonto =sumOfDice; // Informa a pontuação 
			System.out.printf("Meu ponto e: %d%n", meuPonto);
			break;			
		}// fim do switch
		
		//Enquanto o jogo não estiver completo
		while(gameStatus == Status.CONTINUE) // nem WON nem LOST 
		{ // Cospó do while
			sumOfDice = rollDice(); // lança os dados novamente
			
			// Determina o estado do jogo
			if(sumOfDice == meuPonto) { // Vitoria por pontuação
				gameStatus = Status.WON;
			} // fim do if
			else 
				if (sumOfDice == SEVEN) { // perde obtendo 7 antes de atingir a pontuação
				gameStatus = Status.LOST;
			}//  fim do else if
		}// fim do while
		
		// exibe uma mensagem se ganhou ou perdeu
		if (gameStatus == Status.WON) {
			System.out.println("Jogador ganhou");
		}// fim do if 
		else {
			System.out.println("Jogador perdeu");
		} // fim do else 
	}// fim do método principal
	
	// lança dos dados, calcula a soma e mostra os resultados
	public static int rollDice() {
	
		// Seleciona os valores aleatorios do dado
		int die1 = 1 + seguranca.nextInt(6);// primeiro lançamento do dado
		int die2 = 1 + seguranca.nextInt(6);// segundo lançamento do dado
		int soma = die1 + die2;// soma dos valores dos dados 
	
		// exibe os resultados desse lançamento
		System.out.printf("Jogador rolou %d + %d = %d%n", 
				die1,
				die2,
				soma);
		return soma;
	}// fim do método roolDice

}// fim da classe Craps
