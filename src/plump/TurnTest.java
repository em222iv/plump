package plump;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

public class TurnTest {
	
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
	public void shouldExistsTurnConstructor() {
		new Turn(pList,playerMock);
	}
	
	@Test
	public void shouldReturnThePlayerListInserted() {
		Turn t = new Turn(pList,playerMock);
		assertEquals(pList,t.getPlayers());
	}
	
	@Test
	public void shouldSetInternalvalueOfFirstPlayer() {
		Turn t = new Turn(pList,playerMock);
		t.setFirst(playerMock);
		assertNotNull(t.first);
	}


}
