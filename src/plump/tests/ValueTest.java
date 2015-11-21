package plump.tests;

import static org.junit.Assert.*;

import org.junit.Test;

import plump.Value;

public class ValueTest {
	
	private Value[] v = null;

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
