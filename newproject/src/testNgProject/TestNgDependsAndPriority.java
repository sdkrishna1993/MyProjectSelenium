package testNgProject;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNgDependsAndPriority {

	// Though priority set as 1, first depends on method = sanity2 will be executed 
	
	@BeforeMethod

	public void sanity() {

		System.out.println("Before Method");

	}

	@Test(priority=1,groups = "Sanity",dependsOnMethods="sanity2")

	public void sanity1() {

		System.out.println(" Test method1");
	}
	
	
	@Test(priority=2,groups = "Sanity")

	public void sanity2() {

		System.out.println(" Test method2");
	}
	@AfterMethod

		public void test3() {

			System.out.println("After Method");
		}
}
