package newpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ButtonExample {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "/Users/krishnakumar/Downloads/ChromeDriver");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.leafground.com/pages/Button.html");
		
		
		
	//Get the position x, y of button
		
	WebElement xyposition=	driver.findElement(By.id("position"));
	Point xypose=	xyposition.getLocation();
	int x=	xypose.getX();
	int y=	xypose.getY();
	System.out.println(" X position: "+ x+" Y Position "+y);
	
	
	//Find the button color
	
	WebElement color =driver.findElement(By.id("color"));
	String value =color.getCssValue("background-color");
	System.out.println("The color of the button is :"+value);
	
	
	//Find the height and Width
	
	WebElement size=driver.findElement(By.id("size"));
	int height =size.getSize().getHeight();
	int width =size.getSize().getWidth();
	
	System.out.println("The button height is :"+height+ " The button width is: "+width);
	
	//.click the Home Page
	
			WebElement homebutton =driver.findElement(By.id("home"));
			homebutton.click();
			
	
		
		
	}

}
