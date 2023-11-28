package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class P001_OpenBrowser {
	public static void main(String[] args) throws InterruptedException {
		//1.Chrome
//		System.setProperty("webdriver.chrome.driver", "D:\\webdriver\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("https://www.facebook.com/");
		
		//2.Firefox
//		System.setProperty("webdriver.gecko.driver", "C:\\Users\\jay-pc\\Downloads\\geckodriver-v0.33.0-win64\\geckodriver.exe");
//		WebDriver driver = new FirefoxDriver();
//		driver.manage().window().maximize();
//		driver.get("https://www.facebook.com/");
		
		//3.Edge
		System.setProperty("webdriver.edge.driver", "C:\\Users\\jay-pc\\Downloads\\edgedriver_win64 (1)\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		
//		WebElement email = driver.findElement(By.id("email"));
//		email.sendKeys("abc@gmail.com");
//		WebElement password = driver.findElement(By.id("pass"));
//		password.sendKeys("abc@123");
//		WebElement fp = driver.findElement(By.xpath("//div[@class='_6ltj']/a"));
//		fp.click();
//		Thread.sleep(2000);
//		driver.navigate().back();
//		Thread.sleep(2000);
//		driver.quit();
	}
}
