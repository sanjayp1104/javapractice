package junitexample;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestJunit {
	@Test
	public void testSetup() {
		String str ="Junit Setup done";
		assertEquals("Junit Setup done1", str);

	}

}
