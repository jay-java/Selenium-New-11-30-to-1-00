package basic;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import util.DriverConnection;

public class P009WindowHandle {
	public static void main(String[] args) throws InterruptedException {
		String url = "https://demo.guru99.com/popup.php";
		WebDriver driver = DriverConnection.getDriver(url);
		
		driver.findElement(By.linkText("Click Here")).click();
		
		String mainWin = driver.getWindowHandle();
		System.out.println(mainWin);
		
		Set<String> allWin = driver.getWindowHandles();
		for(String win : allWin) {
			if(!win.equals(mainWin)) {
				driver.switchTo().window(win);
			}
		}
		
		driver.findElement(By.name("emailid")).sendKeys("selenium@gmail.com");
		driver.findElement(By.name("btnLogin")).click();
		Thread.sleep(2000);
		driver.close();
		driver.switchTo().window(mainWin);
		Thread.sleep(2000);
		driver.close();
		
	}
}
