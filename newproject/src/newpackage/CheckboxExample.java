package newpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckboxExample {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "/Users/krishnakumar/Downloads/ChromeDriver");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.leafground.com/pages/checkbox.html");
		
	WebElement java=driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[1]/div[1]/input"));
	Thread.sleep(4000);
	java.click();
	
	WebElement checked = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/input"));
	Boolean a=checked.isSelected();
	
	System.out.println(a);
	
	WebElement radio1= driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[3]/div[1]/input"));
	
	
	if(radio1.isSelected()) {
		Thread.sleep(4000);
		radio1.click();
	}
	
	
WebElement raido2=	driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[3]/div[2]/input"));

	
	if(raido2.isSelected()) {
		raido2.click();
	}
	
	
	}
	
	
	
	
		
		
		

	}


