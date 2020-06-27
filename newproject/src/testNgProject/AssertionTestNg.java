package testNgProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AssertionTestNg {
	
	WebDriver driver;
	@BeforeMethod
	
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "/Users/krishnakumar/Downloads/ChromeDriverLatest/ChromeDriver");
		driver= new ChromeDriver();
		
	}
	
	@Test(priority=2)
	public void OpenApp() {
		
		driver.get("http://www.leafground.com/pages/Edit.html");
		WebElement emailbox=driver.findElement(By.id("email"));
		emailbox.sendKeys("sdkrishna111@gmail.com");
		
		
		WebElement appendbox=driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/div/input"));
		//appendbox.clear();
		appendbox.sendKeys("krishna");
		boolean b=driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/div/input")).isDisplayed();
		
		Assert.assertEquals("actual", "expected");
		
		Assert.assertTrue(b);
	}
	
	
	
@AfterMethod
	
	public void tearDown() {
		
		driver.quit();
		
	}

}
