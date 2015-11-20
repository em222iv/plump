package plump;
import static org.junit.Assert.*;
import org.mockito.Mockito;

import org.junit.Test;

public class plumpTests {
	private Suits[] s = null;
	private Values[] v = null;
	@Test
	public void shouldSetCardVariableViaConstructorAndGetZero() {
		Card card = new Card(0);
		assertEquals(card.getA(),0);
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
}
