package plump;

public class GameStart {
	public static void main (String[] args){ 	
		
		Deck deck = new Deck();
		deck.resetDeck();
		System.out.println("Cards in deck "+deck.size());
		
	}
}
