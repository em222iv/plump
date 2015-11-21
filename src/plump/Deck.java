package plump;
import java.util.*;

public class Deck {
	private ArrayList<Card> deck;
	public Deck(){
		deck = new ArrayList<Card>();
		Suit[] suits = Suit.values();
		Value[] values = Value.values();
		
		for(Suit suit : suits){
			for(Value value : values){
				deck.add(new Card(suit,value));
			}
		}
	}
	
    public int size(){
		return deck.size();
    }

	public Card handOutCard(int numberOfCards,Player player) {
		return deck.remove(0);
	}

	public Card get(int index) {
		return deck.get(index);
	}

}
