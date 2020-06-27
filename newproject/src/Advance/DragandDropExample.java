package Advance;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class DragandDropExample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/krishnakumar/Downloads/ChromeDriver");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.leafground.com/pages/drop.html");
		
	WebElement from=	driver.findElement(By.xpath("//div[@id='draggable']"));
	WebElement To=	driver.findElement(By.xpath("//div[@id='droppable']"));
	
	Actions action = new Actions(driver);
	
	//action.clickAndHold(from).moveToElement(To).release().build().perform();
	//release(To)

	action.dragAndDrop(from, To).build().perform();
	}

}
