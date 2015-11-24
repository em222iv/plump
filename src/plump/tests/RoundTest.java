package plump.tests;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

import plump.Deck;
import plump.Game;
import plump.Player;
import plump.Round;

public class RoundTest {
	
	private Deck deckMock;
	private Game gameMock;
 	private Player playerMock;
 	private ArrayList<Player> pList;
		 
	@Before
	public void setUp() {
	  gameMock = mock( Game.class );
	  playerMock = mock( Player.class );
	  deckMock = mock( Deck.class );
	  pList = new ArrayList<Player>();
	  pList.add(new Player("player1", new Deck()));
	  pList.add(new Player("Player2", new Deck()));
	  pList.add(new Player("Player3", new Deck()));
      pList.add(new Player("Player4", new Deck()));
	}
	
	@Test
	public void shouldInitiateRoundWithPlayerDeck() {
		Game game = new Game(pList,5,deckMock);
		Round round = new Round(game);
	}
	
	@Test
	public void shouldHaveInitializedInternalVariables() {
		Game game = new Game(pList,5,deckMock);
		Round round = new Round(game);
		
		assertNotNull(round.deck);
		assertNotNull(round.players);
		assertNotNull(round.round);
	}
	
}
