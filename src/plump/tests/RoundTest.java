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
	
	private Deck deckMock;
	private Game gameMock;
 	private Player playerMock;
		 
	@Before
	public void setUp() {
	  gameMock = mock( Game.class );
	  playerMock = mock( Player.class );
	  deckMock = mock( Deck.class );
	}
	
	@Test
	public void shouldInitiateRoundWithPlayerDeck() {
		Game game = new Game(playerMock,5,deckMock);
		Round round = new Round(game.genereateAI(), deckMock,3);
	}
	
	@Test
	public void test() {
		Game game = new Game(playerMock,5,deckMock);
		Round round = new Round(game.genereateAI(), deckMock,3);
		
		assertNotNull(round.deck);
	}
	
	
	
	
}
