package plump.tests;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;

import org.junit.Before;
import org.junit.Test;

import plump.Deck;
import plump.Game;
import plump.Player;
import plump.Round;

public class RoundTest {
	
	private Game gameMock;
 	private Player playerMock;
		 
	@Before
	public void setUp() {
	  gameMock = mock( Game.class );
	  playerMock = mock( Player.class );
	}

	@Test
	public void shouldSendPlayersAndDeckToRound() {
		Game game = new Game(playerMock,5,new Deck());
		Round round = new Round(game.genereateAI(), new Deck());
	}
	
	@Test
	public void shouldSendPlayersAndDeckToRound() {
		Game game = new Game(playerMock,5,new Deck());
		Round round = new Round(game.genereateAI(), new Deck(),3);
	}
	
	
	
}
