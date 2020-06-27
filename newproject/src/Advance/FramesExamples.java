package Advance;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesExamples {

	public static void main(String[] args) {
    System.setProperty("webdriver.chrome.driver", "/Users/krishnakumar/Downloads/ChromeDriver");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.leafground.com/pages/frame.html");
		
		driver.switchTo().frame(0);
		
		
		WebElement singleFrame =driver.findElement(By.xpath("//button[@id='Click']"));
		singleFrame.click();
		
		String text= driver.findElement(By.xpath("//button[@id='Click']")).getText();
		System.out.println("The text elememt getting displayed after clicking "+text);
		
		
		driver.switchTo().defaultContent();
		
	//Nested frame
		
		driver.switchTo().frame(1);
		
		driver.switchTo().frame("frame2");
		
		WebElement NestedFrame =driver.findElement(By.xpath("//button[@id='Click1']"));
		NestedFrame.click();
		
		
		driver.switchTo().defaultContent();
		
		List<WebElement> totalframes=driver.findElements(By.tagName("iframe"));
	int framess=	totalframes.size();
	
	System.out.println("Total frames in the page "+framess);
		
		
		
	}

}
