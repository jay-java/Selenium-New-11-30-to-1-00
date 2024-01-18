package crossbrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class BrowserTest {
	WebDriver driver = null;

	@Parameters("browser")
	@Test
	public void test(String browser) {
		if (browser.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"D:\\webdriver\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.get("https://www.facebook.com/");
		}
		if (browser.equals("ff")) {
			System.setProperty("webdriver.gecko.driver", "D:\\webdriver\\geckodriver-v0.34.0-win32\\geckodriver.exe");
			driver = new FirefoxDriver();
			driver.get("https://www.facebook.com/");
		}
		if (browser.equals("edge")) {
			System.setProperty("webdriver.edge.driver", "D:\\webdriver\\edgedriver_win64\\msedgedriver.exe");
			driver = new EdgeDriver();
			driver.get("https://www.facebook.com/");

		}

	}
}
