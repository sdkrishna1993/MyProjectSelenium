package newpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkElements {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "/Users/krishnakumar/Downloads/ChromeDriver");
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Link.html");
	//	driver.findElement(By.linkText("Go to Home Page")).click();
		Thread.sleep(1000);
		driver.findElement(By.partialLinkText("Go to")).click();
		
		
	}

}
