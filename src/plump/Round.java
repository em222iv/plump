package plump;

import java.util.ArrayList;

public class Round {
	public Deck deck;
	public int round;
	public ArrayList<Player> players;
	public Round(Game game) {
		this.deck = game.deck;
		this.players = game.playerList;
		this.round = game.rounds;
	}
}
 