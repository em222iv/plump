package plump;

import java.util.ArrayList;
import java.util.Scanner;

public class GameStart {
	static ArrayList<Player> pList;
	public static void main (String[] args){ 	
		pList = new ArrayList<Player>();
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a player name: ");
		String playerName = input.nextLine();
		pList.add(new Player(playerName, new Deck()));
		pList.add(new Player("Player2", new Deck()));
		pList.add(new Player("Player3", new Deck()));
		pList.add(new Player("Player4", new Deck()));

//		System.out.println("Enter number of rounds");
//		int rounds = input.nextInt();
//		Deck deck = new Deck();
//		deck.resetDeck();
//		Game g = new Game(pList, rounds,deck);
//		while(g.rounds > 0) {
//			g.round.chooseDealer();
//			foreach player
//				g.round.dealer.deal(5);
//			g.round.setRoundSticks();
//			while(g.round.turns > 0){
//				g.round.newTurn();
//				foreach(p:pList)
//					if first
//						p.pickCard
//						setSuit
//					p.pickAvaiableCard()
//					setStick();
//				turns--;
//			}
//			if stick == stickguess
//				p.score
//		}
	}
}
