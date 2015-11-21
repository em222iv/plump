package plump;

import java.util.ArrayList;

public class Player {
	
	private String name;
	private ArrayList<Card> hand;
	public Player(String _name) {
		if(_name == null)
			throw new IllegalArgumentException();
		this.name = _name;
		hand = new ArrayList<Card>();
	}

	public String getName() {
		return this.name;
	}

	public ArrayList<Card> getHand() {
		return hand;
	}

	public void setHand(Card object) {
		hand.add(object);
	}

	public int amountOfCardsOnHand() {
		return hand.size();
	}

	public void pickCard(Card obj) {

		hand.remove(obj);
	}

}
