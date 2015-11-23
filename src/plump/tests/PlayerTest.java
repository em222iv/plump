package plump.tests;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Spy;

import plump.Card;
import plump.Deck;
import plump.Player;
import plump.Suit;
import plump.Value;

public class PlayerTest {

	private String name = "Siri";
	private Player player = null;
	
	@Before
	public void shouldInstantiateTheDifferentClasses() 
	{
		this.player = new Player(this.name);
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void shouldThrowExceptionOnNullInput() throws Exception
	{
		new Player(null);
	}
	@Test
	public void shouldThrownExcpetionWhenCalled()  
	{
		assertEquals("Siri",this.player.getName());
	}
	
	@Test
	public void ShouldAddCardToPlayerHand()
	{
		this.player.giveCard(new Card(Suit.HEARTS,Value.ACE));
	}
	
	
	@Test
	public void shouldExistGethandMethod()
	{
		Card c = new Card(Suit.CLUBS,Value.ACE); 
		Deck d = new Deck();
		d.add(c);
		this.player.giveCard(c);
		assertEquals(1,this.player.getHand().size());
	}

	@Test
	public void shouldReturnTheAmountOfCardsOnPlayerHand()
	{
		this.player.giveCard(new Card(Suit.HEARTS,Value.ACE));
		assertSame(1,this.player.amountOfCardsOnHand());
	}
	
	@Test
	public void shouldMockToSeeIfDeckIsDealingToPLayer()
	{
		  player = mock(Player.class);
		  Deck d = new Deck();
		  d.resetDeck();
		  Card first = d.get(0);
		  d.handOutCardToPlayer(1,player);

		  verify(player, times(1)).giveCard(first);
	}
	
	@Spy 
	Player p = new Player("test");
	@Test
	public void shouldHave7CardsOnHand()
	{
		  Deck d = new Deck();
		  d.resetDeck();
		  d.handOutCardToPlayer(6,player);
		  assertEquals(7,player.amountOfCardsOnHand());	  
	}
	
	@Test
	public void shouldGiveCardToPlayerAndThenDiscardItLeavingPlayer()
	{	
		  Player player = new Player("test");
		  Deck d = new Deck();
		  Card c = new Card(Suit.CLUBS,Value.ACE);
		  player.giveCard(c);
		  player.pickCard(c);
		  assertEquals(0,player.amountOfCardsOnHand());
	}
		
}
