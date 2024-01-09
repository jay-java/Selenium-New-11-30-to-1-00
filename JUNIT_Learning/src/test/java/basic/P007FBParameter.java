package basic;

import java.util.Arrays;
import java.util.List;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import util.DriverConnection;

@RunWith(Parameterized.class)
public class P007FBParameter {
	String email,pass;
	static WebDriver driver;
	public P007FBParameter(String email, String pass) {
		super();
		this.email = email;
		this.pass = pass;
	}
	@BeforeClass
	public static void openBrowser() {
		String url = "https://www.facebook.com/";
		driver = DriverConnection.getDriver(url);
	}
	@Test
	public void loginTest() throws InterruptedException {
		WebElement emailEle = driver.findElement(By.id("email"));
		emailEle.clear();
		emailEle.sendKeys(email);
		WebElement passEle = driver.findElement(By.id("pass"));
		passEle.clear();
		passEle.sendKeys(pass);
		Thread.sleep(2000);
	}
	
	@Parameters
	public static List<Object[]> getData() {
		Object[][] obj = new Object[4][2];
		obj[0][0] = "correct@gamil.com";
		obj[0][1] = "correct";

		obj[1][0] = "incorrect@gmail.com";
		obj[1][1] = "correct";

		obj[2][0] = "correct@gamil.com";
		obj[2][1] = "incorrect";

		obj[3][0] = "incorrect@gmail.com";
		obj[3][1] = "incorrect";

		return Arrays.asList(obj);
	}
}
