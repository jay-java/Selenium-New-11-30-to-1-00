package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenBrowser {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\webdriver\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
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
