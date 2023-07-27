package arrays;
import java.security.SecureRandom;

public class DeckOfCards {
	private Card[] deck;
	private int currentCard;
	private static final int NUMBER_OF_CARDS = 52;
	
	private static final SecureRandom numerosAleatorios = new SecureRandom();
	
	public DeckOfCards() 
	{
		String[] faces =  {"Ace", "Deuce", "Three", "Four", "Five", "Six",
				"Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King"};
		String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades" }; 
		
		deck = new Card[NUMBER_OF_CARDS];
		currentCard = 0;
		
		for (int count = 0; count < deck.length; count++)
		{
			deck[count] = new Card(faces[count %13], suits[count /13]);
		}// fim do for
	}// fim do método Deck Of Cards
	
	public void shuffle() 
	{
		currentCard = 0;
		for(int first = 0; first < deck.length; first++) 
		{
			int second = numerosAleatorios.nextInt(NUMBER_OF_CARDS);
			Card temp = deck[first];
			deck[first] = deck[second];
			deck[second] = temp;
		}// fim do for
	}// fim do método suuffle
	public Card dealCard() 
	{
		// determina se ainda há Cards a serem distribuídas
		if(currentCard < deck.length) 
		{
			return deck[currentCard++];// retorna Card atual no array
		}//fim do if
		else
		{
			return null;// retorna nulo para indicar que todos as Cards foram distribuídas
		}// fim do else
	}// fim do método deal Card
}// fim da classe deck of cards
