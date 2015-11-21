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

	public void getHand() {
		throw new NullPointerException();
	}

	public void setHand() {
		// TODO Auto-generated method stub
		
	}

}
