package plump;

public class Player {
	
	private String name;
	private Deck hand;
	public Player(String _name) {
		if(_name == null)
			throw new IllegalArgumentException();
		this.name = _name;
		hand = new Deck();
	}

	public String getName() {
		return this.name;
	}

	public void giveCard(Card object) {
		hand.add(object);
	}

	public int amountOfCardsOnHand() {
		return hand.size();
	}

	public Deck getHand() {
		return hand;
		
	}

//	public void pickCard(Card obj) {
//		hand.remove(obj);
//	}

}
