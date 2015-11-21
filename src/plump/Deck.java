package plump;
import java.util.*;

public class Deck {
	private ArrayList<Card> deck;
	public Deck(){
		deck = new ArrayList<Card>();
		deck.add(new Card(Suit.HEARTS,Value.ACE));
	}
	
    public int size(){
		return deck.size();
    }

}
