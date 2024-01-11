package listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class P02BasicListener implements ITestListener{
	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("test started");
	}
	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("test success");
	}
	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("test fail");
	}
	
	@Override
	public void onFinish(ITestContext context) {
		System.out.println("test finish");
	}
}
