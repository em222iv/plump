package plump.tests;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import plump.Card;
import plump.Deck;
import plump.Player;
import plump.Suit;
import plump.Value;

public class PlayerTest {

	private Deck hand;
 	private Player playerMock;
 	private Player playerSpy;
		 
	@Before
	public void setUp() {
	  hand = new Deck();
	  playerMock = mock( Player.class );
	  playerSpy = spy( new Player("spy", new Deck()));
	}

	@Test(expected=IllegalArgumentException.class)
	public void shouldThrowExceptionOnNullInput() throws Exception
	{
		new Player(null,this.hand);
	}
	
	@Test
	public void shouldThrownExcpetionWhenCalled()  
	{
		Player siri = new Player("Siri",new Deck());
		assertEquals("Siri",siri.getName());
	}
	
	@Test
	public void ShouldAddCardToPlayerHand()
	{
		this.playerMock.giveCard(new Card(Suit.HEARTS,Value.ACE));
	}
	
	@Test
	public void shouldExistGethandMethod()
	{	
		Card c = new Card(Suit.CLUBS,Value.ACE); 
		Deck d = new Deck();
		d.add(c);
		this.playerSpy.giveCard(c);
		assertEquals(1,this.playerSpy.getHand().size());
	}

	@Test
	public void shouldReturnTheAmountOfCardsOnPlayerHand()
	{
		playerSpy = spy(new Player("lisa",new Deck()));
		playerSpy.giveCard(new Card(Suit.HEARTS,Value.ACE));
		assertSame(1,this.playerSpy.amountOfCardsOnHand());
	}
	
	@Test
	public void shouldMockToSeeIfDeckIsDealingToPlayer()
	{
		  Player playerMock = mock(Player.class);
		  Deck d = new Deck();
		  d.resetDeck();
		  d.handOutCardToPlayer(1,playerMock);
		  verify(playerMock, times(1)).giveCard(any(Card.class));
	}
	
	@Test
	public void shouldHave7CardsOnHand()
	{		
		  Player play = spy(new Player("test",this.hand));
		  play.giveCard(any(Card.class));
		  verify(play,times(1)).giveCard(any(Card.class)); 
	}
	
	@Test
	public void shouldGiveCardToPlayerAndThenDiscardItLeavingPlayerWithZeroCards()
	{	
		  Player player = new Player("test",this.hand);
		  Card c = new Card(Suit.CLUBS,Value.ACE);
		  player.giveCard(c);
		  player.pickCard(c);
		  assertEquals(0,player.amountOfCardsOnHand());
	}

	@After public void reset_mocks() {
	    Mockito.reset(playerMock);
	    Mockito.reset(playerSpy);
	}
	
	@Test
	public void test() {
		Player p = new Player("test",hand);
		assertNotNull(p.compareTo(playerSpy));

	}   
	
		
}
