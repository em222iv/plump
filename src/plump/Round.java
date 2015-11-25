package plump;

import java.util.ArrayList;
import java.util.Map;
import java.util.Random;
import java.util.TreeMap;

public class Round {
	public Deck deck;
	public int round;
	public ArrayList<Player> players;
	public Map<Player, Integer> roundSticks = new TreeMap<Player, Integer>();
	public Round(ArrayList<Player> _players,int _round,Deck _deck) {
		this.deck = _deck;
		this.players = _players;
		this.round = _round;
	}
	public Object chooseDealer(ArrayList<Player> players) {
		Random rand = new Random();
		return players.get(rand.nextInt(players.size()));
	}
	
	public void deal(Deck deck) {
		deck.handOutCardToPlayer(round,(Player) chooseDealer(players));
	}
	public void setPlayerRoundStick(Player player, int i) {
		this.roundSticks.put(player, i);
		
	}
	
	
	
}
 