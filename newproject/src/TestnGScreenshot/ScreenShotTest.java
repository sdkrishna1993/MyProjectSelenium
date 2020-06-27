package TestnGScreenshot;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import junit.framework.Assert;
@Listeners(CustomListener.class)


public class ScreenShotTest extends Base{
	
/*	
  @BeforeMethod
  
  public void setup() {
	  initialization();
	  
  }
 */ 
 
WebDriver driver;

  @Test
  
  public void loginTest() {
	  
	  System.setProperty("webdriver.chrome.driver", "/Users/krishnakumar/Downloads/ChromeDriverLatest/ChromeDriver");
	  
	  driver=new ChromeDriver();
	  
	  driver.get("https://www.google.com");
	  
	  Assert.assertEquals(false, true);
	  
  }


	
	
  
  
  /*
  public void takeScreenshotTest2() {
	  Assert.assertEquals(true, false);
  }
  
  public void takeScreenshotTest3() {
	  
	  Assert.assertEquals(true, false);  
	  
  }
  */
 /* 
  @AfterMethod
  
  public void tearDown() {
	  
	  if(driver != null){
          driver.quit();
          System.out.println("Driver was instantiated. Quitting..");
      }else{
          System.out.println("Driver was null so nothing to do");
      }
  }
*/	
	
	
	
	

}
