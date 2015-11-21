package plump;
import static org.junit.Assert.*;
import java.util.ArrayList;
import org.junit.Before;
import static org.mockito.Mockito.*;

import org.junit.Test;

public class unitTests {
	private String name = "Siri";
	private Suit[] s = null;
	private Value[] v = null;
	private Card card = null;
	private Deck deck = null;
	private Player player = null;
	
	@Before
	public void shouldInstantiateTheDifferentClasses() 
	{
		this.card = new Card(Suit.HEARTS,Value.ACE);
		this.deck = new Deck();
		this.player = new Player(this.name);
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
	public void shouldExistSuitEnumWithSuitHeartValue()
	{
	    s  = Suit.values();
	    assertEquals(s[0], Suit.HEARTS);
	}
	
	@Test
	public void shouldExistSuitEnumWithSuitSpadesValue()
	{
	    s  = Suit.values();
	    assertEquals(s[1], Suit.SPADES);
	}
	
	@Test
	public void shouldExistSuitEnumWithSuitDiamondValue()
	{
	    s  = Suit.values();
	    assertEquals(s[2], Suit.DIAMONDS);
	}
	
	@Test
	public void shouldExistSuitEnumWithSuitClubsValue()
	{
	    s  = Suit.values();
	    assertEquals(s[3], Suit.CLUBS);
	}
	
	@Test
	public void shouldExistValueEnumWithValueAce()
	{
		 v  = Value.values();
	     assertEquals(v[0], Value.ACE);
	}
	
	@Test
	public void shouldExist13DifferentValuesinValueEnum()
	{
	     assertEquals(13, Value.values().length);
	}
	
	@Test
	public void shouldExistNummeredValueForEachValue()
	{
		 v  = Value.values();
	     assertEquals(1, Value.ACE.Value);
	}
	
	@Test
	public void shouldReturnCardByIndex()
	{
		this.deck.resetDeck();
		this.deck.get(1);
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
		this.player.giveCard(this.card);
	}
	

	@Test
	public void shouldReturnTheAmountOfCardsOnPlayerHand()
	{
		this.player.giveCard(this.card);
		assertEquals(1,this.player.amountOfCardsOnHand());
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void shouldThrowExceptionOnZeroInput() throws Exception
	{
		this.deck.handOutCardToPlayer(0,this.player);
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
	
}
