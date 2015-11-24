package plump;

import java.util.ArrayList;

public class Round {
	public Deck deck;
	public int round;
	public ArrayList<Player> players;
	public Round(ArrayList<Player> players,Deck deck_,int round) {
		this.deck = deck_;
		this.players = players;
		this.round = round;
		
	}
}
 