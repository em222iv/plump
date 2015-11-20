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
	public void shouldExistSuitEnum()
	{
	    Suit[] s  = Suit.values();
	    assertEquals(s[0], Suit.HEARTS);
	}
}
