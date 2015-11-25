package plump.tests;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;
import static org.mockito.Matchers.*;
import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

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
	public void shouldHaveInitializedInternalVariables() {
		Game game = new Game(pList,5,deckMock);
		Round round = new Round(this.pList,5,this.deckMock);
		
		assertNotNull(round.deck);
		assertNotNull(round.players);
		assertNotNull(round.round);
	}
	
	@Test
	public void shouldReturnFirstPersonInListToBeDealer(){
		
		Round r = mock(Round.class);
		
		when(r.chooseDealer(pList)).thenReturn(any(Player.class));
		
		assertSame(r.chooseDealer(pList), any(Player.class));
	}
	
	@Test
	public void shouldBeCalledWithRoundsDeckAndCallHandOutMethodOnIt() {
		Deck deck = mock(Deck.class);
		Round r = new Round(pList,5,deck);
		
		r.deal(deck);
		
		verify(deck,times(1)).handOutCardToPlayer(any(int.class), any(Player.class));
	}
	

	@Test
	public void test() {		
		Round r = new Round(pList,5,deckMock);
		r.setPlayerRoundStick(pList.get(0),3);
		assertFalse(r.roundSticks.isEmpty());
	}
}
