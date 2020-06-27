package newpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Editfields {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/krishnakumar/Downloads/ChromeDriverLatest/ChromeDriver");
		
		WebDriver driver= new ChromeDriver();
		
		
	driver.get("http://www.leafground.com/pages/Edit.html");
	
		
	WebElement emailbox=driver.findElement(By.id("email"));
	emailbox.sendKeys("sdkrishna111@gmail.com");
	
	
	WebElement appendbox=driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/div/input"));
	//appendbox.clear();
	appendbox.sendKeys("krishna");
	
	
	
	WebElement value=driver.findElement(By.name("username"));
	String 	defalut =value.getAttribute("value");
	System.out.println(defalut);
	
	WebElement clear =driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[4]/div/div/input"));
	clear.clear();
    WebElement dis=	 driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[5]/div/div/input"));
    Boolean val=	 dis.isEnabled();
    
    System.out.println(val);
    
    if (val) {
    	
    	System.out.println("pass");
    }
    else {
    	System.out.println("");
    }

	


		

	}

}
