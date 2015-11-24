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
		 
	@Before
	public void setUp() {
	  gameMock = mock( Game.class );
	  playerMock = mock( Player.class );
	}
	    
	@Test
	public void shouldTakePlayerAndAmountOfRoundsAndDeckToSetInternalVariables() {
		Game game = new Game(playerMock,5, new Deck());
		assertEquals(5,game.rounds);
		assertNotNull(game.player);
		assertNotNull(game.deck);
	}
	
	@Test 
	public void shouldReturnAnArrayList() {
		gameMock = mock(Game.class);
		ArrayList<Player> pList = new ArrayList<Player>();
		Mockito.doReturn(pList).when(gameMock).genereateAI();
	}
	
	@Test 
	public void shouldReturnArrayListWith4Players() {
		Game game = spy(new Game(playerMock,5, new Deck()));
		ArrayList<Player> pList = game.genereateAI();
		assertEquals(4,pList.size());
	}
	
	@Test
	public void shouldCallnewRoundOneTime() throws Exception {
		 gameMock = mock(Game.class);
		 gameMock.newRound();
		 verify(gameMock, times(1)).newRound();
	}
	
	@Test
	public void shouldThrowNotImplementedException() 
	{
		Game game = spy(new Game(playerMock,5, new Deck()));
		game.newRound(playerMock);
		
	}
	@After public void reset_mocks() {
	    Mockito.reset(playerMock);
	    Mockito.reset(gameMock);
	}
	 
}
