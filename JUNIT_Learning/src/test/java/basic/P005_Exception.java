package basic;

import org.junit.Test;

public class P005_Exception {
	@Test(expected = ArithmeticException.class)
	public void test() {
		int a = 10;
		int b = 2;
		int c = a/b;
		System.out.println(c);
	}
}
