package testNgProject;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BasicAnnotations {
	
	
	
	
	@BeforeMethod
	
	public void test4() {
		
		System.out.println("Before Method");
	}
	
	
	
	
	@Test
	public void apple() {
		System.out.println("@Test 10 testcase");
	}
	
	@Test
	public void orange() {
		System.out.println(" Test 2 Orange testcases");
	}
	
	@AfterMethod
	
	public void test6() {
		
		System.out.println("After Method");
	}
	
	
	
	
	
	
	
	

}
