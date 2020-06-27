package TestnGScreenshot;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.Listeners;



public class CustomListener extends Base implements ITestListener{
	
	
	
	
	public void onTestFailure(ITestResult result) {
		
		
		System.out.println("Failed Test");
		
		failed(result.getMethod().getMethodName());
	}
	
	
	

}
