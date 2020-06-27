package newpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FireFox {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "/Users/krishnakumar/Downloads/geckodriver.exe");
	//Illegal state expection	if not specify gecko driver preoperly.
		WebDriver driver =new FirefoxDriver();
		driver.get("https://www.google.com");
		driver.close();//method for close the browser
		driver.quit();//close entire browser whic means close the all tabs
		
		
		
		

	}

}
