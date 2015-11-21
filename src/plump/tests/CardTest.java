package plump.tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import plump.Card;
import plump.Suit;
import plump.Value;

public class CardTest {
	private Suit[] s = null;
	private Value[] v = null;
	private Card card = null;

	
	@Before
	public void shouldInstantiateTheDifferentClasses() 
	{
		this.card = new Card(Suit.HEARTS,Value.ACE);

	}
	
	@Test
	public void shouldPrintCardWithToStringMethod() {
		assertEquals(this.card.toString(),"ACE of HEARTS");
	}

}
