package basic;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class P001_CalcTest {
	@Test
	public void addTest() {
		Calc c = new Calc();
		int expectedRes = 24;
		int actualRes = c.add(12, 12);
		assertEquals(expectedRes, actualRes);
	}
}
