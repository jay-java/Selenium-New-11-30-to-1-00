package basic;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class P003_Annotaions {
	@BeforeClass
	public static void beforeClass() {
		
	}
	@AfterClass
	public static void afterClass() {
		
	}
	@BeforeTest
	public void before() {
		
	}
	@AfterTest
	public void afterTest() {
		
	}
	@Test
	public void test() {
		
	}
	@Ignore
	public void ingnore() {

	}
}
