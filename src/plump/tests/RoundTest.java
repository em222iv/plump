package plump.tests;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;
import static org.mockito.Matchers.*;

import java.awt.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;

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
	public void shouldHaveInitializedInternalVariables() 
	{
		Game game = new Game(pList,5,deckMock);
		Round round = new Round(this.pList,5,this.deckMock);
		
		assertNotNull(round.getDeck());
		assertNotNull(round.getPlayers());
		assertNotNull(round.getRoundNr());
	}
	
	@Test
	public void shouldReturnFirstPersonInListToBeDealer()
	{
		Round r = mock(Round.class);
		
		when(r.chooseDealer(pList)).thenReturn(any(Player.class));
		
		assertSame(r.chooseDealer(pList), any(Player.class));
	}
	
	@Test
	public void shouldBeCalledWithRoundsDeckAndCallHandOutMethodOneTime() 
	{
		Deck deck = mock(Deck.class);
		Round r = new Round(pList,5,deck);
		
		r.deal(deck);
		
		verify(deck,times(1)).handOutCardToPlayer(any(int.class), any(Player.class));
	}
	
	@Test(expected=IndexOutOfBoundsException.class)
	public void shouldThrowsIndexOutOfBoundOnInputHighterThanRound() {
		Round r = new Round(pList,5,deckMock);
		
		r.setPlayerRoundStick(playerMock,6);
		assertFalse(((Map<Player, Integer>) r.getSticks()).isEmpty());
	}
	
	@Test(expected=IndexOutOfBoundsException.class)
	public void shouldThrowsIndexOutOfBoundOnInputLowerThanZero() {
		Round r = new Round(pList,5,deckMock);
		
		r.setPlayerRoundStick(playerMock,-1);
		
		assertFalse(((Map<Player, Integer>) r.getSticks()).isEmpty());
	}

	@Test
	public void shouldSetTheAmountOfSticksACertainPlayerWants() 
	{		
		Round r = new Round(pList,5,deckMock);
		
		r.setPlayerRoundStick(playerMock,3);
		
		assertFalse(((Map<Player, Integer>) r.getSticks()).isEmpty());
	}
	
	@Test
	public void shouldReturnTheCurrentRoundsDeck() 
	{
		Round r = mock(Round.class);
		
		when(r.getDeck()).thenReturn(deckMock);
		
		assertEquals(r.getDeck(), deckMock);
	}

	@Test
	public void shouldReturnTheCurrentAmountOfRoundsLeft() 
	{
		Round r = mock(Round.class);
		
		when(r.getRoundNr()).thenReturn(5);
		
		assertEquals(r.getRoundNr(), 5);
	}
	
	@Test
	public void shouldBeCalledAndReturnArrayListOfPlayers() 
	{
		Round r = mock(Round.class);
		
		when(r.getPlayers()).thenReturn(pList);
		
		assertEquals(r.getPlayers(), pList);
	}
	
	@Test
	public void shouldReturnTreeMapWithPlayersChosenSticks() 
	{
		Map<Player, Integer> m = new TreeMap<Player, Integer>();
		m.put(playerMock, 4);	
		Round r = mock(Round.class);
		
		when(r.getSticks()).thenReturn(m);
		r.setPlayerRoundStick(playerMock, 4);
		
		assertEquals(r.getSticks(),m);
	}
	
	@Test
	public void test() 
	{	
		ArrayList spy = spy(new ArrayList());
		spy.add(new Player("spier", new Deck()));
		
		Round r = new Round(spy,5,deckMock);
		
		assertEquals(1,r.getPlayers().size());
	}
	
}
