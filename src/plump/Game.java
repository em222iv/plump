package plump;

import java.util.ArrayList;

public class Game {
	int rounds = 0;
	Player player;
	Deck deck;
	ArrayList<Player> pList;
	
	public Game(Player _player,int _rounds, Deck _deck) {
		this.player = _player;
		this.rounds = _rounds;
		this.deck = _deck;
	}
	
	public ArrayList<Player> genereateAI() {
		this.pList = new ArrayList<Player>();
		
		return this.pList;
		
	}
	
}
