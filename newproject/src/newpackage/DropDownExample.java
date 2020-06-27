package newpackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownExample {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "/Users/krishnakumar/Downloads/ChromeDriver");

		WebDriver driver = new ChromeDriver();

		driver.get("http://www.leafground.com/pages/Dropdown.html");

		WebElement drop1 = driver.findElement(By.id("dropdown1"));

		Select sel = new Select(drop1);

		sel.selectByIndex(1);
		Thread.sleep(4000);
		sel.selectByValue("2");
		Thread.sleep(4000);
		sel.selectByVisibleText("Loadrunner");
		
		

//	Get the no of options

		List<WebElement> lis= sel.getOptions();

		int count = lis.size();

		System.out.println("The count of the dropdown list :" + count);

//select the dropdown value using sendkeys method

		WebElement drop2 = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[5]/select"));
		drop2.sendKeys("Appium");
		
		
//select multiple values in the dropdown
		
	WebElement mutidrop=	driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[6]/select"));
	
	Select sele = new Select(mutidrop);
	
	sele.selectByIndex(0);
	sele.selectByValue("2");
	sele.selectByVisibleText("Loadrunner");
	
		
		
		

	}

}
