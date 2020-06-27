package Advance;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleWindowsExample {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "/Users/krishnakumar/Downloads/ChromeDriver");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.leafground.com/pages/Window.html");
		
		
		
	//current window focus
		String parentWindow=driver.getWindowHandle();
		System.out.println(parentWindow);
		
		WebElement button=driver.findElement(By.xpath("//button[@id='home']"));
		button.click();
		
	Set<String> windows=	driver.getWindowHandles();// new window and as well as old window
	
	for (String allwindows : windows) {
		
		driver.switchTo().window(allwindows);
	//	System.out.println(allwindows);
		
		}
		
	//WebElement newwindow=	driver.findElement(By.xpath("//img[@alt='Edit / Text Fields']"));
		WebElement newwindow=	driver.findElement(By.xpath("//*[@id=\"post-153\"]/div[2]/div/ul/li[1]/a"));
			
			newwindow.click();
			
			driver.close();
		
		driver.switchTo().window(parentWindow);
			
		WebElement openmultiple=	driver.findElement(By.xpath("//button[@onclick='openWindows()']"));
		
		openmultiple.click();
		
	int size=	driver.getWindowHandles().size();
	
	System.out.println("The windows count +"+size);
	
	Set<String> windows1 =driver.getWindowHandles();
	
	ArrayList<String> wind = new ArrayList<>(windows1);
	
	System.out.println("The windows 1 "+wind.get(0));
	System.out.println("The windows 1 "+wind.get(1));
	System.out.println("The windows 1 "+wind.get(2));
	
	/*
	for (int i = 1; i < size; i++) {
		
		System.out.println(wind.get(i));
		
		driver.switchTo().window(wind.get(i));
		System.out.println(driver.getTitle());
		driver.close();
		
	}
	*/
	//System.out.println("Before close "+driver.getTitle());
	
	String s ="TestLeaf - Interact with Buttons";
for (String all : windows1) {
	
	System.out.println(driver.getTitle());
		
		if(s.equals(driver.getTitle())) {
			
			driver.switchTo().window(driver.getTitle());
			System.out.println(all);
			driver.close();
			
		}
	
	
	
	
	/*
	for (String all : windows1) {
		
		if(parentWindow.equals(all)) {
			
			driver.switchTo().window(all);
			//System.out.println(all);
			driver.close();
			
		}
		
	
		
	}
		*/	
			
		
	
		
		
	}

}
}