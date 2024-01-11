package parameterized;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import util.DriverConnection;

public class FBPara {
	static WebDriver driver = null;
	@BeforeClass
	public static void openBrowser() {
		String url  ="https://www.facebook.com/";
		driver = DriverConnection.getDriver(url);
	}
	@Test(dataProvider = "dp")
	public void loginTest(String email,String pass) {
		WebElement emailEle = driver.findElement(By.id("email"));
		emailEle.clear();
		emailEle.sendKeys(email);
		WebElement passEle = driver.findElement(By.id("pass"));
		passEle.clear();
		passEle.sendKeys(pass);
	}
	
	@DataProvider(name="dp")
	public static Object[][] getData(){
		Object[][] obj = new Object[4][2];
		obj[0][0] = "correct@gamil.com";
		obj[0][1] = "correct";

		obj[1][0] = "incorrect@gmail.com";
		obj[1][1] = "correct";

		obj[2][0] = "correct@gamil.com";
		obj[2][1] = "incorrect";

		obj[3][0] = "incorrect@gmail.com";
		obj[3][1] = "incorrect";
		
		return obj;
	}
}
