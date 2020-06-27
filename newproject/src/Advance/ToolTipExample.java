package Advance;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToolTipExample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/krishnakumar/Downloads/ChromeDriver");

		WebDriver driver = new ChromeDriver();

		driver.get("http://www.leafground.com/pages/tooltip.html");

		WebElement tooltip = driver.findElement(By.xpath("//label[@for='age']/following::input"));

		String tool = tooltip.getAttribute("title");
		System.out.println("The tool tip is +" + tool);

	}

}
