package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import CommonActions.CommonAction;
import PageObjectModel.LoginPOM;
import PageObjectModel.MyAccountPOM;

public class MyAccountPage extends CommonAction {
	
	
	@Test
	
	public void myAccount() throws InterruptedException {
		/*
		System.setProperty("webdriver.chrome.driver", "/Users/krishnakumar/Downloads/ChromeDriverLatest/ChromeDriver");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demowebshop.tricentis.com/login");
		Thread.sleep(2000);
		*/
		PageFactory.initElements(driver, LoginPOM.class);
		PageFactory.initElements(driver, MyAccountPOM.class);
		
		
		//Login page
		LoginPOM.username.sendKeys("Arun.Kumar@gmail.com");
		LoginPOM.password.sendKeys("password");
		LoginPOM.loginButton.click();
		
		//Account Page
		MyAccountPOM.profilelink.click();
		MyAccountPOM.addresslink.click();
		
		
		
		
		/*
		driver.findElement(By.id("Email")).sendKeys("Arun.Kumar@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("password");
		driver.findElement(By.xpath("//input[@type='submit'][@value='Log in']")).click();
		*/
		//LoginPOM loginpom = new LoginPOM();
		
		

		
		//MyAccountPOM myaccountpom = new MyAccountPOM();
		
	
	/*	
		driver.findElement(By.linkText("Arun.Kumar@gmail.com")).click();
		
		
		driver.findElement(By.linkText("Addresses")).click();
		
	*/	
		
	}
	

}
