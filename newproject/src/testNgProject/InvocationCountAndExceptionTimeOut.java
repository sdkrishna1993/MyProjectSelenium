package testNgProject;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class InvocationCountAndExceptionTimeOut {
	
	
	@BeforeMethod
	
	public void setup() {
		
		System.out.println(" Before method");
	}
	
	@Test(invocationCount =2)
	
	public void test1() {
		System.out.println(" Test1 method");
	}
	@Test(expectedExceptions =Exception.class)
	public void test2() {
		 int i =9/0;
		
		System.out.println("Test2 Method ");
	}
	
	@AfterMethod
	
	public void TearDown() {
		System.out.println("After Method");
	}
	
	

}
