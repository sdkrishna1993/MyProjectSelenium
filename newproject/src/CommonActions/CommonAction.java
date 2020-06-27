package CommonActions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CommonAction {
	
	public static Properties properties =null;
	public static WebDriver driver =null;
	
	
	public static Properties loadpropertyfile() throws IOException {
		
		FileInputStream  stream = new FileInputStream("Config.properties");
		properties = new Properties();
		properties.load(stream);
		
		 
	//	System.out.println("loading");
		return properties;
		
	}	
		
	@BeforeMethod
	public void setup1() throws IOException {
		
		
		loadpropertyfile();
		
		String browser =properties.getProperty("browser");
		String un =properties.getProperty("username");
		String pass =properties.getProperty("password");
		String url =properties.getProperty("url");
		String drivelocation = properties.getProperty("driverLocation");
		System.out.println(browser);
		System.out.println(un);
		System.out.println(pass);
		System.out.println(url);
		System.out.println(drivelocation);
			
		
		if(browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", drivelocation);
			driver = new ChromeDriver();
			
		}
		
		else if(browser.equalsIgnoreCase("firefox")){
			
			System.setProperty("gechodriver.firfox.driver", drivelocation);
			driver = new FirefoxDriver();
			
			
			
		}
		
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		
	}
	@AfterMethod
	public void tearDown() {
		
		//driver.quit();
		
	}
		
		
		
		
		
	}
	
	


