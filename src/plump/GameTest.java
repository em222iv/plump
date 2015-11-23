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

	@Test
	public void shouldExistGameConstructor() {
		 game = mock(Game.class);
		 verify(game, times(1));
	}
	
	@Mock
		Player player;
	@Test
	public void shouldInstantiatePlayerWhenNewGameIsInstantiated() {

		 player = mock(Player.class);
		 game = new Game(player);
		 assertNotNull(game.player);
	}
	 
}
