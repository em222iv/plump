package plump;

import java.util.ArrayList;

public class Game {
	public int rounds = 0;
	public Player player;
	public Deck deck;
	public ArrayList<Player> playerList;
	
	public Game(ArrayList<Player> _players,int _rounds, Deck _deck) {
		this.player = _players.get(0);
		this.rounds = _rounds;
		this.deck = _deck;
		this.playerList = _players;
	}
	
	public void newRound(Player player) {
		
	}
	
}
