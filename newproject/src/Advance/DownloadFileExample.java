package Advance;

import java.io.File;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DownloadFileExample {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/krishnakumar/Downloads/ChromeDriver");

		WebDriver driver = new ChromeDriver();

		driver.get("http://www.leafground.com/pages/download.html");

		String path = "/Users/krishnakumar/Downloads";

		driver.findElement(By.xpath("//div[@class='todo']/a"));

		List<WebElement> links = driver.findElements(By.xpath("//div[@class='todo']/a"));

		for (WebElement alllinks : links) {

			System.out.println(alllinks.getAttribute("href"));

			if (alllinks.getAttribute("href").contains(".xlsx")) {
				alllinks.click();
				Thread.sleep(4000);
				break;
			}

		}

		File file = new File("/Users/krishnakumar/Downloads");
		File[] allfiles = file.listFiles();

		for (File downloads : allfiles) {
			
			System.out.println(downloads.getName());

			if (downloads.getName().contains("testleaf")) {

				System.out.println("The download files is present");
				
				break;
			}
			
			else	{
				System.out.println("Not present");
				
				
			}
			

		}

	}

}
