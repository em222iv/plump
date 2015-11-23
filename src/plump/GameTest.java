package plump;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import java.awt.List;
import java.util.ArrayList;

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
	public void shouldReturnAnArrayList() {
		game = mock(Game.class);
		ArrayList<Player> pList = new ArrayList<Player>();
		Mockito.doReturn(pList).when(game).genereateAI();
	}
	
	@Test 
	public void shouldReturnArrayListWith4Players() {
		game = spy(new Game(player,5, new Deck()));
		ArrayList<Player> pList = game.genereateAI();
		assertEquals(4,pList.size());
	}
	
	@Test
	public void shouldCallnewRoundOneTime() {
		 game = mock(Game.class);
		 game.newRound();
		 verify(game, times(1)).newRound();
	}
	
	@Test(expected=UnsupportedOperationException.class)
	public void shouldThrowExceptionOnNullInput() throws Exception
	{
		game = spy(new Game(player,5, new Deck()));
		game.newRound();
		
	}
	 
}
