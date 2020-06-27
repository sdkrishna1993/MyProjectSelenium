package TestnGScreenshot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	
	
	
	public static WebDriver driver;
	/*
	public static void initialization() {
		
		System.setProperty("webdriver.chrome.driver", "/Users/krishnakumar/Downloads/ChromeDriverLatest/ChromeDriver");

		WebDriver driver = new ChromeDriver();

		driver.get("http://www.google.com");
		
		}
	
	*/
	public void failed(String testMethodName) {
		
		//Convert web driver object to TakeScreenshot

        TakesScreenshot scrShot =((TakesScreenshot)driver);

        //Call getScreenshotAs method to create image file

                File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);

            //Move image file to new destination

                try {
					File DestFile=new File("/Users/krishnakumar/Downloads/Screenshots/"
							+testMethodName+"_"+".jpg");

					//Copy file at destination

					
						FileUtils.copyFile(SrcFile, DestFile);
				} catch (Exception e) {
					
					System.out.println(e.getMessage());
					
				}
				
	  
	  
		
	}
	

}
