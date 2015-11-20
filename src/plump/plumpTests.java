package plump;


import static org.junit.Assert.*;

import org.junit.Test;

public class plumpTests {

	@Test
	public void test() {
		Card card = new Card(0);
		assertEquals(card.a,0);
	}

}
