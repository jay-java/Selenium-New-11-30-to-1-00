package basic;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class P003_Annotations {
	@Test
	public void test1() {
		System.out.println("test 1");
	}
	@Test
	public void test2() {
		System.out.println("test 2");
	}
	@BeforeClass
	public static void test3() {
		System.out.println("before class");
	}
	@AfterClass
	public static void test4() {
		System.out.println("after class");
	}
	@Before
	public void test5() {
		System.out.println("before");
	}
	@After
	public void test6() {
		System.out.println("after");
	}
}
