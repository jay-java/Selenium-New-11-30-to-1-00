package basic;

import java.util.List;

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

//		WebElement currentDate = driver
//				.findElement(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr[3]/td[3]/a"));
//		String date = currentDate.getText();
//		System.out.println(date);
		
		String myDate = "12";
		String myMonth = "May";
		String myYear = "2021";
		
		String currentYear = driver.findElement(By.className("ui-datepicker-year")).getText();
		System.out.println(currentYear);
		int y1 = Integer.parseInt(myYear);
		int y2 = Integer.parseInt(currentYear);
		
		while(!myYear.equals(driver.findElement(By.className("ui-datepicker-year")).getText())) {
			if(y1>y2) {
				driver.findElement(By.xpath("//div[@id='ui-datepicker-div']/div/a[2]/span")).click();
			}
			else {
				driver.findElement(By.xpath("//div[@id='ui-datepicker-div']/div/a[1]/span")).click();
			}
		}
		while(!myMonth.equals(driver.findElement(By.className("ui-datepicker-month")).getText())) {
			if(y1>y2) {
				driver.findElement(By.xpath("//div[@id='ui-datepicker-div']/div/a[2]/span")).click();
			}
			else {
				driver.findElement(By.xpath("//div[@id='ui-datepicker-div']/div/a[1]/span")).click();
			}
		}
		
		
		List<WebElement> dates = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td/a"));
		for(WebElement e:dates) {
			System.out.println(e.getText());
			if(e.getText().equals(myDate)) {
				e.click();
			}
		}
		
		
	}
}
