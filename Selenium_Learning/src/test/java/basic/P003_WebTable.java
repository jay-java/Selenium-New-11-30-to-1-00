package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import util.DriverConnection;

public class P003_WebTable {
	public static void main(String[] args) {
		String url = "https://www.techlistic.com/2017/02/automate-demo-web-table-with-selenium.html";
		WebDriver driver = DriverConnection.getDriver(url);
		WebElement text = driver.findElement(By.xpath("//table[@id='customers']/tbody/tr[5]/td[2]/span"));
		String name = text.getText();
		System.out.println(name);
	}
}
