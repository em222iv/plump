package plump;
import java.util.*;

import static org.junit.Assert.*;

import org.junit.Test;

public class plumpTests {

	@Test
	public void shouldSetCardVariableViaConstructorAndGetZero() {
		Card card = new Card(0);
		assertEquals(card.a,0);
	}
	
	@Test
	public void shouldExistSuitEnumWithSuitHeartValue()
	{
	    Suit[] s  = Suit.values();
	    assertEquals(s[0], Suit.HEARTS);
	}
	
	@Test
	public void shouldExistSuitEnumWithSuitSpadesValue()
	{
	    Suit[] s  = Suit.values();
	    assertEquals(s[1], Suit.SPADES);
	}
	
	@Test
	public void shouldExistSuitEnumWithSuitDiamondValue()
	{
	    Suit[] s  = Suit.values();
	    assertEquals(s[2], Suit.DIAMOND);
	}
	
	@Test
	public void shouldExistSuitEnumWithSuitClubsValue()
	{
	    Suit[] s  = Suit.values();
	    assertEquals(s[3], Suit.CLUBS);
	}
}
