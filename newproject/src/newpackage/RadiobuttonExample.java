package newpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadiobuttonExample {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "/Users/krishnakumar/Downloads/ChromeDriver");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.leafground.com/pages/radio.html");
		
		
WebElement unchecked=		driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/div/label[2]/input"));
Boolean check1=	unchecked.isSelected();	

WebElement checked = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/div/label[3]/input"));
Boolean  check2 =checked.isSelected();

System.out.println(check1);
System.out.println(check2);

WebElement age = driver.findElement(By.xpath("/html/body/div/div/div[3]/section/div[3]/div/div/input[3]"));
age.click();

if(checked.isSelected()) {
	checked.click();
}




	}

}
