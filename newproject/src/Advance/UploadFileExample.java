package Advance;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadFileExample {

	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver", "/Users/krishnakumar/Downloads/ChromeDriver");

		WebDriver driver = new ChromeDriver();

		driver.get("http://www.csm-testcenter.org/test?do=show&subdo=common&test=file_upload");
		
	WebElement upload=	driver.findElement(By.name("file_upload"));
	
	upload.click();
	
	upload.sendKeys("/Users/krishnakumar/Downloads/first.txt");
	
	String file ="/Users/krishnakumar/Downloads/first.txt";
	
	StringSelection selection = new StringSelection(file);
	
	Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection, null);
	
	Robot rob = new Robot();
	
	rob.keyPress(KeyEvent.VK_CONTROL);
	rob.keyPress(KeyEvent.VK_V);
	rob.keyPress(KeyReleas);
	
	
	

	}

}
