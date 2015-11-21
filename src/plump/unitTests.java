package plump;
import static org.junit.Assert.*;
import org.mockito.Mockito;

import org.junit.Test;

public class unitTests {
	private Suit[] s = null;
	private Value[] v = null;
	
	@Test
	public void shouldCallCardConstrucotrWithValueAndSuitAndReturnACard() 
	{
		Card card = new Card(Suit.HEARTS,Value.ACE);
	}
	
	@Test
	public void shouldPrintCardWithToStringMethod() {
		Card card = new Card(Suit.HEARTS,Value.ACE);
		assertEquals(card.toString(),"ACE of HEARTS");
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
	public void shouldCallDeckConstructor() 
	{
		Deck deck = new Deck();
	}
	
	@Test
	public void shouldRemoveAndReturnTheCardOnTopOfDeck()
	{
		Deck deck = new Deck();
		Card first = deck.get(0);
		assertEquals(first,deck.handOutCard());
	}
	
	@Test
	public void shouldReturnCardByIndex()
	{
		Deck deck = new Deck();
		deck.get(1);
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void shouldThrowExceptionOnNullInput() throws Exception
	{
		new Player(null);
	}
	
	@Test
	public void shouldNotThrowExceptionOnCorrectInput()
	{
		Player player1 = new Player("Player1");
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void shouldThrownExcpetionWhenCalled()  throws Exception
	{
		Player player1 = new Player("Player1");
		assertEquals("Player1",player1.getName());
	}
	
	
}
