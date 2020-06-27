package newpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class myClass {
static WebDriver driver;

public static void launchBrowser() {
System.setProperty("webdriver.chrome.driver", "/Users/krishnakumar/Downloads/ChromeDriver");
	
	driver= new ChromeDriver();
	driver.get("https://www.google.com/");
	
}
public static void main(String[] args) {
	launchBrowser();
	driver.findElement(By.name("q")).sendKeys("Hello world");
	String sf=driver.findElement(By.name("q")).getText();
	System.out.println(sf);
	String a ="q";
	if(sf==a) {
		
		System.out.println("True");
		
	
		}
	else {
			System.out.println("false");
		
	}
	
	driver.close();

}
	
}	


