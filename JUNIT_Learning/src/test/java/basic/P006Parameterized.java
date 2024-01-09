package basic;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class P006Parameterized {
	int a, b, res;

	public P006Parameterized(int a, int b, int res) {
		super();
		this.a = a;
		this.b = b;
		this.res = res;
	}

	@Test
	public void addTest() {
		Calc c = new Calc();
		int actual = c.add(a, b);
		assertEquals(res, actual);
	}

	@Parameters
	public static List<Object[]> getData() {
		Object[][] obj = new Object[4][3];
		obj[0][0] = 1;
		obj[0][1] = 2;
		obj[0][2] = 3;

		obj[1][0] = 10;
		obj[1][1] = 22;
		obj[1][2] = 30;

		obj[2][0] = 10;
		obj[2][1] = 20;
		obj[2][2] = 30;

		obj[3][0] = 11;
		obj[3][1] = 22;
		obj[3][2] = 33;

		return Arrays.asList(obj);
	}
}
