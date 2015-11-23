package plump;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.Spy;

public class GameTest {

	 @Mock
	    Game game;
	 	Player player;

	@Test
	public void shouldExistGameConstructor() {
		 game = mock(Game.class);
		 verify(game, times(1));
	}

	@Test
	public void shouldTakePlayerAndAmountOfRoundsAndDeckToSetInternalVariables() {
		player = new Player("test",new Deck());
		game = new Game(player,5, new Deck());
		assertEquals(5,game.rounds);
		assertNotNull(game.player);
		assertNotNull(game.deck);
	}
	
	@Test 
	public void test() {
		game = mock(Game.class);
		game.genereateAI();
		
	}
	 
}
