package plump;

import java.util.ArrayList;

public class Round {
	public Deck deck;
	public int round;
	public ArrayList<Player> players;
	public Round(ArrayList<Player> _players,int _round,Deck _deck) {
		this.deck = _deck;
		this.players = _players;
		this.round = _round;
	}
	public Object chooseDealer(ArrayList<Player> players) {
		Player dealer = players.remove(0);
		players.add(dealer);
		return dealer;
	}
	
	
}
 