package testNgProject;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
public class TestngGroups {
// 5 test cases
// one Before Method
//After Method
	@BeforeMethod

	public void sanity() {

		System.out.println("Before Method");

	}

	@Test(priority=0,groups = "Sanity",dependsOnMethods="sanity2")

	public void sanity1() {

		System.out.println(" Test method1");
	}
	@Test(priority=1,groups = "Sanity")

	public void sanity2() {

		System.out.println(" Test method2");
	}

	@Test(priority=2,groups = "Regression")

	public void regression() {

		System.out.println(" Test method3");
	}

	@Test(groups = "Regression")

	public void regression1() {

		System.out.println(" Test method4");
	}

	@Test

	public void regression2() {

		System.out.println(" Test method5");
	}

	@AfterMethod

	public void test3() {

		System.out.println("After Method");
	}

}
