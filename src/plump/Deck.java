package plump;
import java.util.*;

public class Deck {
	private ArrayList<Card> deck;
	public Deck(){
	}
	
    public int size(){
		return deck.size();
    }

	public void handOutCardToPlayer(int numberOfCards,Player player) {
		if(numberOfCards == 0)
			throw new IllegalArgumentException();
		for(int i = 0; i <= numberOfCards;i++){
			Card curr = deck.remove(0);
			player.setHand(curr);
		}
	}

	public Card get(int index) {
		return deck.get(index);
	}

	public void resetDeck() {
		deck = new ArrayList<Card>();
		Suit[] suits = Suit.values();
		Value[] values = Value.values();
		
		for(Suit suit : suits){
			for(Value value : values){
				deck.add(new Card(suit,value));
			}
		}
	}

	public void add(Card card) {
		// TODO Auto-generated method stub
		
	}

}
