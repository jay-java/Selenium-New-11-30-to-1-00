package basic;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import util.DriverConnection;

public class P004_AnnotaionPractical {
	static WebDriver driver;
	@BeforeClass
	public static void openBrowser() {
		System.out.println("browser open");
		String url ="https://www.facebook.com/";
		driver = DriverConnection.getDriver(url);
	}
	@Test
	public void createAccount() {
		System.out.println("create account");
		driver.findElement(By.linkText("Create New Account")).click();
		
	}
	@Test
	public void login() {
		System.out.println("login");
		
	}
	
	@AfterClass
	public static void closeBrowser() {
		System.out.println("browser close");
		driver.close();
	}
}
