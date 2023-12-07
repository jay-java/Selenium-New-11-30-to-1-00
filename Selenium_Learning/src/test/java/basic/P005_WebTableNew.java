package basic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import util.DriverConnection;

public class P005_WebTableNew {
	public static void main(String[] args) {
		String url = "https://cosmocode.io/automation-practice-webtable/";
		WebDriver driver = DriverConnection.getDriver(url);
		List<WebElement> total_row = driver.findElements(By.xpath("//table[@id='countries']/tbody/tr"));
		System.out.println("row : "+total_row.size());
		for(int r=1;r<=total_row.size();r++) {
			List<WebElement> total_col = driver.findElements(By.xpath("//table[@id='countries']/tbody/tr["+r+"]/td"));
//			System.out.println("data : "+total_col.size());
			for(int c=2;c<=total_col.size();c++) {
				WebElement data = driver.findElement(By.xpath("//table[@id='countries']/tbody/tr["+r+"]/td["+c+"]"));
				String text = data.getText();
				System.out.print(text+" | ");
			}
			System.out.println();
		}
	}
}
