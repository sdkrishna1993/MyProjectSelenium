package Advance;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SelectableExample {

	public static void main(String[] args) {
		

		System.setProperty("webdriver.chrome.driver", "/Users/krishnakumar/Downloads/ChromeDriver");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.leafground.com/pages/selectable.html");
		
		List<WebElement> selectable =driver.findElements(By.xpath("//ol[@id='selectable']/li"));
		
	int count=	selectable.size();
	System.out.println("The count of the list elements are "+count);
	
	
	Actions action= new Actions(driver);
	/* Method 1
	action.clickAndHold(selectable.get(0));
	action.clickAndHold(selectable.get(1));
	action.clickAndHold(selectable.get(2));
	action.clickAndHold(selectable.get(3)).build().perform();
	*/
	
	//method 2
	/*
	action.keyDown(Keys.COMMAND).click(selectable.get(0));
	action.keyDown(Keys.COMMAND).click(selectable.get(1));
	action.keyDown(Keys.COMMAND).click(selectable.get(2));
	action.keyDown(Keys.COMMAND).click(selectable.get(3)).build().perform();
	
	*/
	//iteration using for loop
	
	for (int i = 0; i < count; i++) {
		
		if(i<3) {
			action.keyDown(Keys.COMMAND).click(selectable.get(i)).build().perform();;	
		}
		
	}
	
		
		
	}

}
