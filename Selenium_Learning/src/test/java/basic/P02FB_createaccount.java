package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import util.DriverConnection;

public class P02FB_createaccount {
	public static void main(String[] args) throws InterruptedException {
		String url = "https://www.facebook.com/";
		WebDriver driver = DriverConnection.getDriver(url);
		driver.findElement(By.xpath("//div[@class='_6ltg']/a")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("firstname")).sendKeys("selenium");
		driver.findElement(By.name("lastname")).sendKeys("java");
	}
}
