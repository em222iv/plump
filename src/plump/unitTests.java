package plump;
import static org.junit.Assert.*;
import org.junit.Before;
import org.mockito.Mockito;

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
	public void shouldRemoveAndReturnTheCardOnTopOfDeck()
	{
		Card first = this.deck.get(0);
		assertEquals(first,this.deck.handOutCard());
	}
	
	@Test
	public void shouldReturnCardByIndex()
	{
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
	
	@Test(expected=NullPointerException.class)
	public void shouldThrowException() throws Exception
	{	
		this.player.setHand(this.card);
		assertEquals(this.card, this.player.getHand());
	}
	
	@Test
	public void ShouldAddCardToPlayerHand() throws Exception
	{
		this.player.setHand(this.card);
	}
	
}
