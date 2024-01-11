package listeners;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.annotations.Test;

import util.DriverConnection;

public class P03FBTest {
	@Test
	public void titleTest(ITestContext context) {
		String url = "https://www.facebook.com/";
		WebDriver driver = DriverConnection.getDriver(url);
		context.setAttribute("myDriver", driver);
		assertEquals(driver.getTitle(), "Facebook");
		
	}
}
