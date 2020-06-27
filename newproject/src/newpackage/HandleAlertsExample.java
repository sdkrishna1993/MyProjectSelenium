package newpackage;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleAlertsExample {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/krishnakumar/Downloads/ChromeDriver");

		WebDriver driver = new ChromeDriver();

		driver.get("http://www.leafground.com/pages/Alert.html");

		// 1. Alert box

		WebElement Alertbox = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[1]/div/div/button"));
		Alertbox.click();
		Alert alert = driver.switchTo().alert();
		Thread.sleep(3000);
		alert.accept();

		
		// 2 Alert Confirm box Yes or No
		
		WebElement confirmbox = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/div/button"));
		confirmbox.click();
		Alert confirmalert = driver.switchTo().alert();
		Thread.sleep(3000);
		confirmalert.dismiss();
		
		//3 Alert prompt box
		
		WebElement promptbox = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[3]/div/div/button"));
		promptbox.click();
		Alert promptalert = driver.switchTo().alert();
		//Thread.sleep(3000);
		String a=promptalert.getText();
		System.out.println(a);
		promptalert.sendKeys("professor");
		promptalert.accept();
		
		
		

	}

}
