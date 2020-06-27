package testNgProject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParmetersClass {
	
	
	
	WebDriver driver;
	@BeforeMethod
	@Parameters({"browser","url"})
	
	public void setup(String browser,String url) {
		
		if(browser.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "/Users/krishnakumar/Downloads/ChromeDriverLatest/ChromeDriver");
			driver= new ChromeDriver();	
		}
		
		else if(browser.equals("firefox")) {
			System.setProperty("webdriver.gecho.driver", "/Users/krishnakumar/Downloads/ChromeDriverLatest/gechoDriver");
			driver= new FirefoxDriver();	
		}
		
		
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
		driver.get(url);
		driver.findElement(By.linkText("Log in")).click();
		
	}
	
	@Test
	@Parameters({"email","password"})
	
	public void login( String email ,String password) {
		
		
		driver.findElement(By.name("Email")).sendKeys(email);
		driver.findElement(By.name("Password")).sendKeys(password);
		driver.findElement(By.xpath("//input[@value='Log in']")).click();		
		
		
		
	}
	
	@AfterMethod
	
	public void tearDown() {
		
		driver.manage().deleteAllCookies();
		
		driver.quit();
	}
	
	

}
