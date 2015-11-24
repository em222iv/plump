package plump.tests;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;
import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;


import plump.Deck;
import plump.Game;
import plump.Player;

public class GameTest {
	
	private Game gameMock;
 	private Player playerMock;
 	private ArrayList<Player> pList;
	 
	@Before
	public void setUp() {
	  gameMock = mock( Game.class );
	  playerMock = mock( Player.class );
	  pList = new ArrayList<Player>();
	  pList.add(new Player("player1", new Deck()));
	  pList.add(new Player("Player2", new Deck()));
	  pList.add(new Player("Player3", new Deck()));
      pList.add(new Player("Player4", new Deck()));
	 
	}
	    
	@Test
	public void shouldTakePlayerAndAmountOfRoundsAndDeckToSetInternalVariables() {
		Game game = new Game(pList,5, new Deck());
		assertEquals(5,game.rounds);
		assertNotNull(game.player);
		assertNotNull(game.deck);
		assertNotNull(game.playerList);
	}
	
	@Test
	public void shouldCallnewRoundOneTime() throws Exception {
		 gameMock = mock(Game.class);
		 gameMock.newRound();
		 verify(gameMock, times(1)).newRound();

		
	}
	
	@Test
	public void test() {
	 Game game = new Game(pList,5, new Deck());
	 game.newRound();
	 assertNotNull(game.round);
		
	}
	

	
	@After public void reset_mocks() {
	    Mockito.reset(playerMock);
	    Mockito.reset(gameMock);
	}
	 
}
