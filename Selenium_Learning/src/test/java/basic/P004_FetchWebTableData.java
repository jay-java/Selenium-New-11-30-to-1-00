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
		List<WebElement> thead = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr[1]/th/span"));
		System.out.println(thead.size());
		for(WebElement e:thead) {
			String head_text = e.getText();
			System.out.print(head_text+"  ");
		}
		System.out.println();
		List<WebElement> table_row = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr"));
		System.out.println(table_row.size());
		for(int r= 2;r<=table_row.size();r++) {
			List<WebElement> table_data = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr["+r+"]/td"));
			System.out.println(table_data.size());
			for(int d=1;d<=table_data.size();d++) {
				List<WebElement> table_data_text = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr["+r+"]/td["+d+"]/span"));
				for(WebElement s:table_data_text) {
					String span_text = s.getText();
					System.out.println(span_text);
				}
			}
		}
	}
}
