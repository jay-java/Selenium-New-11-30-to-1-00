package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import util.DriverConnection;

public class P008_DropDown {
	public static void main(String[] args) throws InterruptedException {
		String url = "https://www.globalsqa.com/demo-site/datepicker/#Simple%20Date%20Picker";
		WebDriver driver = DriverConnection.getDriver(url);
		driver.findElement(By.id("DropDown DatePicker")).click();
		WebElement iframe = driver.findElement(By.xpath("//div[@class='resp-tabs-container']/div[2]/p/iframe"));
		driver.switchTo().frame(iframe);
		Thread.sleep(3000);
		driver.findElement(By.id("datepicker")).click();
		WebElement month = driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));

		Select months = new Select(month);
//		months.selectByVisibleText("May");
		months.selectByValue("4");
		
		WebElement year = driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
		Select years = new Select(year);
		years.selectByValue("2021");
	}
}
