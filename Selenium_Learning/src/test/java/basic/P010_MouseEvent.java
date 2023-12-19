package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import util.DriverConnection;

public class P010_MouseEvent {
	public static void main(String[] args) throws InterruptedException {
		String url ="https://www.amazon.in/";
		WebDriver driver = DriverConnection.getDriver(url);
		
		WebElement fresh = driver.findElement(By.linkText("Fresh"));
		WebElement miniTV = driver.findElement(By.linkText("Amazon miniTV"));
		WebElement sell = driver.findElement(By.linkText("Sell"));
		
		Actions action= new Actions(driver);
		Action a1  = action.moveToElement(fresh).build();
		a1.perform();
		Thread.sleep(1000);
		Action a2  = action.moveToElement(miniTV).build();
		a2.perform();
		Thread.sleep(1000);
		Action a3  = action.moveToElement(sell).build();
		a3.perform();
		Thread.sleep(1000);
		
	}
}
