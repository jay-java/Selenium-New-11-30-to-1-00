package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import util.DriverConnection;

public class P007_Calender {
	public static void main(String[] args) throws InterruptedException {
		String url = "https://www.globalsqa.com/demo-site/datepicker/#Simple%20Date%20Picker";
		WebDriver driver = DriverConnection.getDriver(url);

		WebElement iframe = driver.findElement(By.xpath("//div[@class='resp-tabs-container']/div[1]/p/iframe"));
		driver.switchTo().frame(iframe);
		
		Thread.sleep(2000);
		WebElement dateEle = driver.findElement(By.id("datepicker"));
		dateEle.click();
		
		WebElement currentDate = driver.findElement(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr[3]/td[3]/a"));
		String date = currentDate.getText();
		System.out.println(date);
	}
}
