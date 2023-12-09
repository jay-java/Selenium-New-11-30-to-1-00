package basic;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import util.DriverConnection;

public class P006_Alert {
	public static void main(String[] args) throws InterruptedException {
		String url = "https://demoqa.com/alerts";
		WebDriver driver = DriverConnection.getDriver(url);
		//Alert 1
//		WebElement alertBTN = driver.findElement(By.id("alertButton"));
//		alertBTN.click();
//		Alert alert = driver.switchTo().alert();
//		Thread.sleep(2000);
//		alert.accept();
//		System.out.println("done");
		
//		//Alert 2
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
//		WebElement alertBTN = driver.findElement(By.id("timerAlertButton"));
//		alertBTN.click();
//		wait.until(ExpectedConditions.alertIsPresent());
//		Alert alert = driver.switchTo().alert();
//		alert.accept();
//		System.out.println("done");
		
		//Alert3
//		WebElement alertBTN = driver.findElement(By.id("confirmButton"));
//		alertBTN.click();
//		Alert alert = driver.switchTo().alert();
//		Thread.sleep(2000);
//		alert.dismiss();
//		System.out.println("done");
		
		//Alert4
		WebElement alertBTN = driver.findElement(By.id("promtButton"));
		alertBTN.click();
		Alert alert = driver.switchTo().alert();
		Thread.sleep(2000);
		alert.sendKeys("selenium");
		alert.accept();
		System.out.println("done");
	}
}
