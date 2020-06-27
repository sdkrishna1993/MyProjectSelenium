package testNgProject;

import javax.swing.JOptionPane;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RailWire {
	
	WebDriver driver ;
	
@BeforeMethod

public void Setup() {
	System.setProperty("webdriver.chrome.driver", "/Users/krishnakumar/Downloads/ChromeDriverLatest/ChromeDriver");
	
	driver = new ChromeDriver();
	
	
	
	
	
		
		
	}


@Test

public void login() throws InterruptedException {
	
	driver.get("https://tn.railwire.co.in/rlogin");
	driver.findElement(By.name("username")).sendKeys("tn.dhandapani.sb");
	driver.findElement(By.id("login-password")).sendKeys("aranehep");
	String captchaVal = JOptionPane.showInputDialog("Please enter the captcha value:");
	System.out.println(captchaVal);
	
	driver.findElement(By.name("code")).sendKeys(captchaVal);
	
	Thread.sleep(3000);
	
	driver.findElement(By.xpath("//span[text()='Login']")).click();
	//WebElement xp=	driver.findElement(By.xpath("//img[@class='captcha-img']"));
	//String capcha =xp.getText();
	//System.out.println(capcha);
	
	driver.findElement(By.xpath("//span[text()=' Receipts ']")).click();
	String a=driver.findElement(By.xpath("//*[@id=\"sub_invoice\"]/tbody/tr[1]/td[4]")).getText();
	System.out.println(a);
	
	
	//for (int i = 0; i < array.length; i++) {
		
	//.findElement(By.xpath('//*[@id=\"sub_invoice\"]/tbody/tr[+" "+1]/td[4]')).getText()
		
	}
	
}
	
	
	
	
	

	


