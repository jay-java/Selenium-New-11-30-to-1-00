package basic;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import util.DriverConnection;

public class P014ScreeenShot {
	public static void getScreenShot(WebDriver driver,String path) {
		TakesScreenshot ss = (TakesScreenshot)driver;
		File source =ss.getScreenshotAs(OutputType.FILE);
		File dest = new File(path); 
		try {
			FileUtils.copyFile(source, dest);
			System.out.println("ss taken");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		String url ="https://www.facebook.com/";
		WebDriver driver = DriverConnection.getDriver(url);
		
		getScreenShot(driver, "D:\\ScreenShot\\ss\\fb.png");
		
		
	}
}
