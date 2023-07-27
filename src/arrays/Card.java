package arrays;

public class Card {
	private final String face;
	private final String suit;
	
	public Card(String cardFace, String cardSuit)
	{
		this.face = cardFace;
		this.suit = cardSuit;
	}// fim do método card
	
	public String toString()
	{
		return face + " OF " + suit;
	}// fim do método  toString
}// fim da classe card
