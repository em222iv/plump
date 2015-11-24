package plump;

import java.util.ArrayList;
import java.util.Random;

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
		Random rand = new Random();
		return players.get(rand.nextInt(players.size()));
	}
	
}
 