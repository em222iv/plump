package plump.tests;
import static org.mockito.Mockito.*;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import plump.Card;
import plump.Deck;
import plump.Player;
import plump.Suit;
import plump.Value;

public class DeckTest {
	private Card card = null;
	private Deck deck = null;
	
	@Before
	public void shouldInstantiateTheDifferentClasses() 
	{
		this.card = new Card(Suit.HEARTS,Value.ACE);
		this.deck = new Deck();
	}
	
	@Test
	public void shouldPrintCardWithToStringMethod() {
		assertEquals(this.card.toString(),"ACE of HEARTS");
	}
	@Test
	public void shouldResetDeckAndGetDeckSizeOf52()
	{
		this.deck.resetDeck();
		assertEquals(52,this.deck.size());
	}

	@Test
	public void test()
	{
		this.deck.add(this.card);
	}
	
	@Test
	public void shouldReturnCardByIndex()
	{
		this.deck.resetDeck();
		this.deck.get(1);
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void shouldThrowExceptionOnZeroInput() throws Exception
	{
		this.deck.handOutCardToPlayer(0,new Player("Siri",new Deck()));
	}
	
	@Test
	public void shouldRemoveSpecificCardFromDeck()
	{	
		this.deck.add(this.card);
		this.deck.remove(this.card);
		assertEquals(0,this.deck.size());
	}
	
}
