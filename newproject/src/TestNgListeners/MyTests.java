package TestNgListeners;

import java.util.NoSuchElementException;

import org.testng.annotations.Test;

import junit.framework.Assert;



@Test(retryAnalyzer = RetryTest.class)


public class MyTests {
	
	
	
	
	
	
	public void method2() {
		
		System.out.println("method 2");
		
		throw new NoSuchElementException();
	}
	
	
	

}
