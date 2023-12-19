package basic;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import util.DriverConnection;

public class P012_KeyBoard {
	public static void main(String[] args) {
		String url = "https://www.google.com/";
		WebDriver driver = DriverConnection.getDriver(url);
		
		WebElement search = driver.findElement(By.name("q"));
		
		Actions action = new Actions(driver);
		action.click(search)
			.keyDown(Keys.SHIFT)
			.sendKeys("selenium learnig with java")
			.keyUp(Keys.SHIFT)
//			.pause(Duration.ofSeconds(3))
			.keyDown(Keys.ARROW_DOWN)
			.keyDown(Keys.ARROW_DOWN)
			.keyDown(Keys.ENTER)
			.build()
			.perform();
		
	}
}
