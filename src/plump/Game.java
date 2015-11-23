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
		this.pList = new ArrayList<Player>();
		this.pList.add(this.player);
	}
	
	public ArrayList<Player> genereateAI() {
		this.pList.add(new Player("Player2", new Deck()));
		this.pList.add(new Player("Player3", new Deck()));
		this.pList.add(new Player("Player4", new Deck()));
		return this.pList;
		
	}
	
}
