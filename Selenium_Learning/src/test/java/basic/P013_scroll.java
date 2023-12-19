package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import util.DriverConnection;

public class P013_scroll {
	public static void main(String[] args) {
		String url = "https://www.amazon.in/";
		WebDriver driver = DriverConnection.getDriver(url);
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		//1.By Pixels
//		js.executeScript("window.scrollBy(0,250)", "");
		
		//2.By element
//		WebElement address= driver.findElement(By.id("currentAddress"));
//		js.executeScript("arguments[0].scrollIntoView();", address);
		
		//3.By Height
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
	}
}
