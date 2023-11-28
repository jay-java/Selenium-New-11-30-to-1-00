package basic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import util.DriverConnection;

public class P004_FetchWebTableData {
	public static void main(String[] args) {
		String url = "https://www.techlistic.com/2017/02/automate-demo-web-table-with-selenium.html";
		WebDriver driver = DriverConnection.getDriver(url);
		List<WebElement> list = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr"));
		System.out.println(list.size());
		for(int i=1;i<list.size();i++) {
			List<WebElement> thead = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr["+i+"]/th"));
			System.out.println(thead.size());
			for(int j = 1;j<thead.size();j++) {
				WebElement th_data = driver.findElement(By.xpath("//table[@id='customers']/tbody/tr["+i+"]/th/["+j+"]/span"));
				System.out.println(th_data.getText());
			}
		}
	}
}
