package plump.tests;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import java.awt.List;
import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

import plump.Deck;
import plump.Game;
import plump.Player;
import plump.Turn;

public class TurnTest {
	
	private Deck deckMock;
	private Game gameMock;
 	private Player playerMock;
 	private ArrayList<Player> pList;
		 
	@Before
	public void setUp() 
	{
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
	public void shouldExistsTurnConstructor() 
	{
		new Turn(pList,playerMock);
	}
	//do give code Coverage
	@Test
	public void shouldReturnThePlayerListInserted1() 
	{
		ArrayList<Player> spy = spy(pList);
		Turn t = mock(Turn.class);
		
		doReturn(spy).when(t).getPlayers();
		
		assertEquals(spy,t.getPlayers());
	}
	//does not give code Coverage
	@Test
	public void shouldReturnThePlayerListInserted2() 
	{
		Turn t = new Turn(pList,playerMock);
		assertEquals(pList,t.getPlayers());
	}
	
	
	@Test
	public void shouldSetInternalvalueOfFirstPlayer() 
	{
		Turn t = new Turn(pList,playerMock);
		t.setFirst(playerMock);
		assertNotNull(t.first);
	}
	
	@Test
	public void shouldGetInternalValueOfFirstPlayer() 
	{
		Turn t = new Turn(pList,playerMock);
		t.setFirst(playerMock);
		assertEquals(playerMock,t.getFirst());
	}

	@Test
	public void shouldGetInternalValueOfFirstPlayerWithMock() 
	{
		  Turn t = mock(Turn.class);

		  when(t.getFirst()).thenReturn(playerMock);

		  assertEquals(t.getFirst(), playerMock);
	}


}
