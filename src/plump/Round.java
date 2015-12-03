package plump;

import java.util.ArrayList;
import java.util.Map;
import java.util.Random;
import java.util.TreeMap;

public class Round {
	private Deck deck;
	private int round;
	private ArrayList<Player> players;
	private Map<Player, Integer> roundSticks;
	
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
	public void setPlayerRoundStick(Player player, int i)  {
		this.roundSticks = new TreeMap<Player, Integer>();
		if(i > round){
			throw new IndexOutOfBoundsException();
		}
		this.roundSticks.put(player, i);	
	}
	public Deck getDeck() {
		return this.deck;
	}
	public int getRoundNr() {
		return this.round;
	}
	public ArrayList<Player> getPlayers() {
		return this.players;
	}
	public Map<Player, Integer> getSticks() {
		return this.roundSticks;
	}
	public int getPlayerDeckSize(Player p) {
		return p.amountOfCardsOnHand();
		
	}
	public int print() {
		System.out.print("ett riktigt kall");
		return 1;
	}
	
}
 