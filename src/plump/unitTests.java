package plump;
import static org.junit.Assert.*;
import org.mockito.Mockito;

import org.junit.Test;

public class unitTests {
	private Suit[] s = null;
	private Value[] v = null;
	
	@Test
	public void shouldCallCardConstrucotrWithValueAndSuitAndReturnACard() {
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
}
