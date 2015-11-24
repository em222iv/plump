package plump;

import java.util.ArrayList;

public class Round {
	public Deck deck;
	public int round;
	public ArrayList<Player> players;
	public Round(ArrayList<Player> _players,Deck _deck,int _round) {
		this.deck = _deck;
		this.players = _players;
		this.round = _round;
	}
}
 